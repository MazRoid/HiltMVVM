package com.mazroid.hilttest.database

import androidx.room.Database
import androidx.room.RoomDatabase
import androidx.room.TypeConverters
import com.mazroid.hilttest.ui.model.MainUserModel

@Database(
    entities = [
        MainUserModel::class,
    ], version = 1
)



@TypeConverters(
//    EventsConverter::class,

    )
abstract class AppDatabase : RoomDatabase() {

//    abstract fun leaderBoardDao(): LeaderBoardDao

}








