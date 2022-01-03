package com.mazroid.hilttest.database.typeconverter

import androidx.room.TypeConverter
import com.google.gson.Gson
import com.google.gson.reflect.TypeToken
import com.mazroid.hilttest.ui.model.Info
import com.mazroid.hilttest.ui.model.ResultUser
import com.mazroid.hilttest.ui.model.UserLocation

class LocationConverter {

    @TypeConverter
    fun fromValue(value: UserLocation): String? {
        if ( value== null) {
            return null
        }
        val gson = Gson()
        val type = object : TypeToken<UserLocation>() {

        }.type
        return gson.toJson(value, type)
    }

    @TypeConverter
    fun toValue(string: String?): UserLocation? {
        if (string == null) {
            return null
        }
        val gson = Gson()
        val type = object : TypeToken<UserLocation>() {

        }.type
        return gson.fromJson(string, type)
    }

}


