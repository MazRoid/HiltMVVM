package com.mazroid.hilttest.network

import com.mazroid.hilttest.ui.model.MainUserModel
import io.reactivex.Single
import retrofit2.http.*

interface NetworkServices {


    @GET("api/")
    fun getAllUser(
        @Query("result") result: Int,
    ): Single<MainUserModel>

}
