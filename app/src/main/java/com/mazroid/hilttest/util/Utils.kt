package com.mazroid.hilttest.util

import android.content.Context
import android.net.ConnectivityManager
import android.util.Log
import java.io.IOException
import java.text.SimpleDateFormat
import java.util.*

class Utils {

    companion object{

        fun dateConverter(value: String?): String? {
            return when {
                value == "NA" || value.equals(null) || value == "" -> "NA"
                else -> {
                    val utcFormat = SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss")
                    utcFormat.timeZone = TimeZone.getTimeZone("UTC")

                    val date = utcFormat.parse(value)
                    val pstFormat = SimpleDateFormat("dd-MM-yyyy", Locale.ENGLISH)
                    pstFormat.format(date)
                }
            }
        }

        fun isOnline(context: Context?): Boolean {
            try {
                val cm =
                    context?.getSystemService(Context.CONNECTIVITY_SERVICE) as ConnectivityManager
                val netInfo = cm.activeNetworkInfo;
                return netInfo != null && netInfo.isConnected
            } catch (e: IOException) {
                Log.d("😅", "e-isOnline:$e ");
                return false
            }

        }

    }
}