package com.mazroid.hilttest.database.dao

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.mazroid.hilttest.ui.model.MainUserModel

import io.reactivex.Single

@Dao
interface MainUserDao {

    @Query("SELECT * FROM MainUserModel")
    fun getAll(): Single<MainUserModel>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insertAll(achieved: MainUserModel?)

    @Query("DELETE FROM MainUserModel")
    fun deleteAll(): Int


}
