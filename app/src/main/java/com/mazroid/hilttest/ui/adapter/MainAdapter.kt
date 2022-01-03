package com.mazroid.hilttest.ui.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.load.engine.DiskCacheStrategy
import com.mazroid.hilttest.databinding.RecyclerItemBinding
import com.mazroid.hilttest.ui.model.ResultUser
import com.mazroid.hilttest.util.AppConstants
import com.mazroid.hilttest.util.Utils


class MainAdapter(val context: Context, var resultUser: List<ResultUser>) :
    RecyclerView.Adapter<MainAdapter.ViewHold>() {

    var callback: MainAdapterCallback? = null

    class ViewHold(val context: Context, val binder: RecyclerItemBinding) :
        RecyclerView.ViewHolder(binder.root) {
        fun bindInfo(
            callback: MainAdapterCallback,
            position: Int,
            result: ResultUser
        ) {
            result.let {
                binder.tvDob.text = Utils.dateConverter(it.dob.date)
                binder.tvAge.text = "${it.dob.age}"
                binder.tvUserName.text = "${it.name.title} ${it.name.first}"
                binder.tvNumber.text = "${it.phone}"
                binder.tvLocation.text = "${it.location.street.name} ,${it.location.city} "
                binder.tvPincode.text = "${it.location.country} ,${it.location.postcode} "

                binder.acceptBtn.setOnClickListener {
                    callback.onAccept(position, result)
                }
                binder.cancelBtn.setOnClickListener {
                    callback.onReject(position, result)
                }
                Glide.with(context)
                    .load(it.picture!!.medium)
                    .diskCacheStrategy(DiskCacheStrategy.ALL)
                    .into(binder.ownerImg)

                if (it.isAccepted == AppConstants.Status.PENDING) {
                    binder.tvMessage.visibility = View.GONE
                    binder.cancelBtn.visibility = View.VISIBLE
                    binder.acceptBtn.visibility = View.VISIBLE
                } else {
                    binder.cancelBtn.visibility = View.GONE
                    binder.acceptBtn.visibility = View.GONE
                    binder.tvMessage.visibility = View.VISIBLE
                    binder.tvMessage.text = if (it.isAccepted == AppConstants.Status.ACCEPTED) {
                        "Member Accepted"
                    } else {
                        "Member Declined"
                    }
                }
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
        holder.bindInfo(callback!!, position, resultUser[position])
    }

    override fun getItemCount(): Int {
        return resultUser.size
    }

    interface MainAdapterCallback {

        fun onTapped(position: Int, value: ResultUser)
        fun onAccept(position: Int, value: ResultUser)
        fun onReject(position: Int, value: ResultUser)

    }
}