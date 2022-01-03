package com.mazroid.hilttest.database.dao

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.mazroid.hilttest.ui.model.ResultUser

import io.reactivex.Single

@Dao
interface ResultUserDao {

    @Query("SELECT * FROM ResultUser")
    fun getAll(): Single<List<ResultUser>>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insert(list: ResultUser?)

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insertAll(list: List<ResultUser>?)

    @Query("DELETE FROM ResultUser")
    fun deleteAll(): Int


}
