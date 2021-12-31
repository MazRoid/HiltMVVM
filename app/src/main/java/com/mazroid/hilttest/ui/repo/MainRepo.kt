package com.mazroid.hilttest.ui.repo

import android.util.Log
import androidx.lifecycle.MutableLiveData
import com.google.gson.Gson
import com.mazroid.hilttest.database.AppDatabase
import com.mazroid.hilttest.network.NetworkServices
import com.mazroid.hilttest.ui.model.MainUserModel
import io.reactivex.disposables.CompositeDisposable
import io.reactivex.schedulers.Schedulers

import javax.inject.Inject

class MainRepo
@Inject constructor(
    private val networkServices: NetworkServices,
    private val appDatabase: AppDatabase,
    private val gson: Gson
) {
    var bag: CompositeDisposable = CompositeDisposable()

    fun getAllUser(): MutableLiveData<MainUserModel> {
        val data = MutableLiveData<MainUserModel>()
        bag.add(
            networkServices.getAllUser(10)
                .subscribeOn(Schedulers.io())
                .observeOn(Schedulers.io())
                .subscribe({
                    Log.e("-=-=-=- ", "$it")
                    data.postValue(it)
                }, {
                    Log.e("-=-ERROR=-=- ", "${it.printStackTrace()}")

                })
        )
        return data
    }

}