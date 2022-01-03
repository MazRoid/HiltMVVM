package com.mazroid.hilttest.database.typeconverter

import androidx.room.TypeConverter
import com.google.gson.Gson
import com.google.gson.reflect.TypeToken
import com.mazroid.hilttest.ui.model.ResultUser

class PictureConverter {

    @TypeConverter
    fun fromValue(value: ResultUser.Picture): String? {
        if ( value== null) {
            return null
        }
        val gson = Gson()
        val type = object : TypeToken<ResultUser.Picture>() {

        }.type
        return gson.toJson(value, type)
    }

    @TypeConverter
    fun toValue(string: String?): ResultUser.Picture? {
        if (string == null) {
            return null
        }
        val gson = Gson()
        val type = object : TypeToken<ResultUser.Picture>() {

        }.type
        return gson.fromJson(string, type)
    }

}


