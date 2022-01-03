package com.mazroid.hilttest.database.typeconverter

import androidx.room.TypeConverter
import com.google.gson.Gson
import com.google.gson.reflect.TypeToken
import com.mazroid.hilttest.ui.model.ResultUser

class DobConverter {

    @TypeConverter
    fun fromValue(value: ResultUser.Dob): String? {
        if ( value== null) {
            return null
        }
        val gson = Gson()
        val type = object : TypeToken<ResultUser.Dob>() {

        }.type
        return gson.toJson(value, type)
    }

    @TypeConverter
    fun toValue(string: String?): ResultUser.Dob? {
        if (string == null) {
            return null
        }
        val gson = Gson()
        val type = object : TypeToken<ResultUser.Dob>() {

        }.type
        return gson.fromJson(string, type)
    }
}


