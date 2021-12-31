package com.mazroid.hilttest.database.typeconverter

import androidx.room.TypeConverter
import com.google.gson.Gson
import com.google.gson.reflect.TypeToken
import com.mazroid.hilttest.ui.model.Info

class InfoConverter {

    @TypeConverter
    fun fromValue(value: Info): String? {
        if ( value== null) {
            return null
        }
        val gson = Gson()
        val type = object : TypeToken<Info>() {

        }.type
        return gson.toJson(value, type)
    }

    @TypeConverter
    fun toValue(string: String?): Info? {
        if (string == null) {
            return null
        }
        val gson = Gson()
        val type = object : TypeToken<Info>() {

        }.type
        return gson.fromJson(string, type)
    }

}


