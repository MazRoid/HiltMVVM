package com.mazroid.hilttest.database.typeconverter

import androidx.room.TypeConverter
import com.google.gson.Gson
import com.google.gson.reflect.TypeToken
import com.mazroid.hilttest.ui.model.ResultUser

class NameConverter {

    @TypeConverter
    fun fromFooter(value: ResultUser.Name): String? {
        if ( value== null) {
            return null
        }
        val gson = Gson()
        val type = object : TypeToken<ResultUser.Name>() {

        }.type
        return gson.toJson(value, type)
    }

    @TypeConverter
    fun toFooter(string: String?): ResultUser.Name? {
        if (string == null) {
            return null
        }
        val gson = Gson()
        val type = object : TypeToken<ResultUser.Name>() {

        }.type
        return gson.fromJson(string, type)
    }

}


