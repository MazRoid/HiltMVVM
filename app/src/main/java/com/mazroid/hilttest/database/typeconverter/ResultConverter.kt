package com.mazroid.hilttest.database.typeconverter

import androidx.room.TypeConverter
import com.google.gson.Gson
import com.google.gson.reflect.TypeToken
import com.mazroid.hilttest.ui.model.Result

class ResultConverter {

    @TypeConverter
    fun fromFooter(value: Result): String? {
        if ( value== null) {
            return null
        }
        val gson = Gson()
        val type = object : TypeToken<Result>() {

        }.type
        return gson.toJson(value, type)
    }

    @TypeConverter
    fun toFooter(string: String?): Result.Name? {
        if (string == null) {
            return null
        }
        val gson = Gson()
        val type = object : TypeToken<Result.Name>() {

        }.type
        return gson.fromJson(string, type)
    }

}


