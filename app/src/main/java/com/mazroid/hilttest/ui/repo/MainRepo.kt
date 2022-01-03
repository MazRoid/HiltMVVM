package com.mazroid.hilttest.ui.repo

import android.util.Log
import androidx.lifecycle.MutableLiveData
import com.google.gson.Gson
import com.mazroid.hilttest.MyApplication
import com.mazroid.hilttest.database.AppDatabase
import com.mazroid.hilttest.network.NetworkServices
import com.mazroid.hilttest.ui.model.MainUserModel
import com.mazroid.hilttest.ui.model.ResultUser
import com.mazroid.hilttest.util.AppConstants
import com.mazroid.hilttest.util.Utils
import io.reactivex.Completable
import io.reactivex.disposables.CompositeDisposable
import io.reactivex.disposables.Disposable
import io.reactivex.schedulers.Schedulers

import javax.inject.Inject

class MainRepo
@Inject constructor(
    private val networkServices: NetworkServices,
    private val appDatabase: AppDatabase,
    private val myApplication: MyApplication,
    private val gson: Gson
) {
    var bag: CompositeDisposable = CompositeDisposable()
    val TAG = "MZD=={MainRepo}=="

    fun getAllUser(): MutableLiveData<List<ResultUser>> {
        val data = MutableLiveData<List<ResultUser>>()
        if (Utils.isOnline(myApplication)) {
            bag.add(
                networkServices.getAllUser(10)
                    .subscribeOn(Schedulers.io())
                    .observeOn(Schedulers.io())
                    .subscribe({
                        Log.e("-=-=-=- ", "$it")
//                    data.postValue(it!!.results)
                        it!!.results.forEach {
                            it.isAccepted = AppConstants.Status.PENDING
                        }
                        insertAll(data, it!!.results)
                    }, {
                        Log.e("-=-ERROR=-=- ", "${it.printStackTrace()}")
                        data.postValue(emptyList())
                    })
            )
        } else {
            bag.add(
                appDatabase?.resultUserDao()?.getAll()!!
                    .subscribeOn(Schedulers.io())
                    .observeOn(Schedulers.io())
                    .subscribe({
                        data.postValue(it)
                    }, {
                        data.postValue(emptyList())
                    })
            )
        }
        return data
    }


    private fun insertAll(
        liveData: MutableLiveData<List<ResultUser>>,
        responseData: List<ResultUser>
    ): Disposable {
        return Completable.fromAction {
            appDatabase?.resultUserDao()?.deleteAll()
        }
            .subscribeOn(Schedulers.io())
            .observeOn(Schedulers.io())
            .subscribe({
                Log.d(TAG, "Deletion:Completed ")
                appDatabase?.let {
                    bag.add(
                        Completable.fromAction {
                            it.resultUserDao().insertAll(responseData)
                        }
                            .subscribeOn(Schedulers.io())
                            .observeOn(Schedulers.io())
                            .subscribe({
                                liveData.postValue(responseData)
                            }, { t ->
                                Log.d(TAG, "DB-Error: ${t.localizedMessage}")
                                liveData.postValue(null)
                            })
                    )
                }

            }, { t ->
                Log.d(TAG, "DB-Error: ${t.localizedMessage}")
            })

    }

    fun getFromDatabase(): MutableLiveData<List<ResultUser>> {

        val data = MutableLiveData<List<ResultUser>>()

        bag.add(

            appDatabase.resultUserDao().getAll()
                .subscribeOn(Schedulers.io())
                .observeOn(Schedulers.io())
                .subscribe({
                    data.postValue(it)
                }, {
                    data.postValue(emptyList())
                })
        )

        return data
    }


    fun replaceUser(value: ResultUser): MutableLiveData<ResultUser?> {
        val data = MutableLiveData<ResultUser?>()

        bag.add(
            Completable.fromAction {
                appDatabase.resultUserDao().insert(value)
            }
                .subscribeOn(Schedulers.io())
                .observeOn(Schedulers.io())
                .subscribe({
                    data.postValue(value)
                }, { data.postValue(null) })
        )
        return data
    }


}