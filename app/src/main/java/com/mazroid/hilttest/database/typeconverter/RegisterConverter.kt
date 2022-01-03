package com.mazroid.hilttest.database.typeconverter

import androidx.room.TypeConverter
import com.google.gson.Gson
import com.google.gson.reflect.TypeToken
import com.mazroid.hilttest.ui.model.Info
import com.mazroid.hilttest.ui.model.ResultUser

class RegisterConverter {

    @TypeConverter
    fun fromValue(value: ResultUser.Registered): String? {
        if ( value== null) {
            return null
        }
        val gson = Gson()
        val type = object : TypeToken<ResultUser.Registered>() {

        }.type
        return gson.toJson(value, type)
    }

    @TypeConverter
    fun toValue(string: String?): ResultUser.Registered? {
        if (string == null) {
            return null
        }
        val gson = Gson()
        val type = object : TypeToken<ResultUser.Registered>() {

        }.type
        return gson.fromJson(string, type)
    }

}


