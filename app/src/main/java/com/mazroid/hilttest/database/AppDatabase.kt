package com.mazroid.hilttest.database

import androidx.room.Database
import androidx.room.RoomDatabase
import androidx.room.TypeConverters
import com.mazroid.hilttest.database.dao.ResultUserDao
import com.mazroid.hilttest.database.typeconverter.*
import com.mazroid.hilttest.ui.model.ResultUser

@Database(
    entities = [
        ResultUser::class,
    ], version = 1
)


@TypeConverters(
    RegisterConverter::class,
    NameConverter::class,
    PictureConverter::class,
    DobConverter::class,
    LocationConverter::class
    )
abstract class AppDatabase : RoomDatabase() {

    abstract fun resultUserDao(): ResultUserDao

}








