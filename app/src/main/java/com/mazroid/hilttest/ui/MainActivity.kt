package com.mazroid.hilttest.ui

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.activity.viewModels
import androidx.lifecycle.Observer
import androidx.recyclerview.widget.LinearLayoutManager
import com.mazroid.hilttest.databinding.ActivityMainBinding
import com.mazroid.hilttest.ui.adapter.MainAdapter
import com.mazroid.hilttest.ui.model.ResultUser
import com.mazroid.hilttest.ui.viewmodel.MainViewModel
import com.mazroid.hilttest.util.AppConstants
import com.mazroid.hilttest.util.BaseActivity
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : BaseActivity(), MainAdapter.MainAdapterCallback {

    lateinit var binding: ActivityMainBinding
    var adapter: MainAdapter? = null
    val viewModel: MainViewModel by viewModels()
    var adapterList: MutableList<ResultUser> = mutableListOf()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        initialize()
    }

    private fun initialize() {
        val manager = LinearLayoutManager(this)
        binding.rvMain.layoutManager = manager

        showProgressDialog(this)
        viewModel.getAllUser().observe(this, Observer {
            cancelProgressDialog()
            setAdapter(it.toMutableList())
        })
    }

    private fun setAdapter(list: MutableList<ResultUser>) {
        adapterList.clear()
        adapterList.addAll(list)
        if (adapter == null) {
            adapter = MainAdapter(this, adapterList)
            adapter?.callback = this
            binding.rvMain.adapter = adapter
        }
        adapter?.notifyDataSetChanged()

    }

    fun updateUser(isAccepted: Boolean, value: ResultUser) {
        if (isAccepted) {
            value.isAccepted = AppConstants.Status.ACCEPTED
        } else {
            value.isAccepted = AppConstants.Status.REJECTED
        }

        viewModel.replaceUser(value).observe(this, Observer {
            adapter.let {
                it!!.notifyDataSetChanged()
            }
        })
    }

    override fun onTapped(position: Int, value: ResultUser) {

    }

    override fun onAccept(position: Int, value: ResultUser) {
        updateUser(true, value)
    }

    override fun onReject(position: Int, value: ResultUser) {
        updateUser(false, value)
    }
}