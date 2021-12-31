package com.mazroid.hilttest.ui.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.load.engine.DiskCacheStrategy
import com.mazroid.hilttest.databinding.RecyclerItemBinding
import com.mazroid.hilttest.ui.model.ResultUser
import com.mazroid.hilttest.util.Utils


class MainAdapter(val context: Context, var resultUser: List<ResultUser>) :
    RecyclerView.Adapter<MainAdapter.ViewHold>() {

    class ViewHold(val context: Context, val binder: RecyclerItemBinding) :
        RecyclerView.ViewHolder(binder.root) {
        fun bindInfo(
            result: ResultUser
        ) {
            result.let {
                binder.tvDob.text = Utils.dateConverter(it.dob.date)
                binder.tvUserName.text = "${it.name.title} ${it.name.first}"
                binder.tvNumber.text = "${it.phone}"
                Glide.with(context)
                    .load(it.picture!!.medium)
                    .diskCacheStrategy(DiskCacheStrategy.ALL)
                    .into(binder.ownerImg)
            }
        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHold {
        val binder: RecyclerItemBinding = RecyclerItemBinding.inflate(
            LayoutInflater.from(context), parent, false
        )
        return ViewHold(context, binder)
    }

    override fun onBindViewHolder(holder: ViewHold, position: Int) {
        holder.bindInfo(result = resultUser[position])
    }

    override fun getItemCount(): Int {
        return resultUser.size
    }
}