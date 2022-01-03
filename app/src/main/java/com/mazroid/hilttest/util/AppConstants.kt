package com.mazroid.hilttest.util

class AppConstants {

    object Status {
        const val ACCEPTED = "ACCEPTED"
        const val REJECTED = "REJECTED"
        const val PENDING = "PENDING"

    }


    companion object {

        var baseUrl = "https://randomuser.me/"
        const val DATABASE_NAME: String = "mazroidTest"
    }
}