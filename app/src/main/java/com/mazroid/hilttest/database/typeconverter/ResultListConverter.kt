package com.mazroid.hilttest.database.typeconverter

import androidx.room.TypeConverter
import com.google.gson.Gson
import com.google.gson.reflect.TypeToken
import com.mazroid.hilttest.ui.model.ResultUser

class ResultListConverter {

    @TypeConverter
    fun fromResultList(list: List<ResultUser>?): String? {
        if (list == null) {
            return null
        }
        val gson = Gson()
        val type = object : TypeToken<List<ResultUser>>() {

        }.type
        return gson.toJson(list, type)
    }

    @TypeConverter
    fun toResultList(string: String?): List<ResultUser>? {
        if (string == null) {
            return null
        }
        val gson = Gson()
        val type = object : TypeToken<List<ResultUser>>() {

        }.type
        return gson.fromJson(string, type)
    }

}


