package com.mazroid.hilttest

import android.app.Application
import android.util.Log
import dagger.hilt.android.HiltAndroidApp


@HiltAndroidApp
class MyApplication()  : Application() {
    val TAG : String = "MyApplication"


    override fun onCreate() {
        super.onCreate()
        Log.e(TAG, "application initiated...")
    }
}