package com.mazroid.hilttest.util

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
    }
}