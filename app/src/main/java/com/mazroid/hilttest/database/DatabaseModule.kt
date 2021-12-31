package com.mazroid.hilttest.database

import android.app.Application
import androidx.room.Room
import com.mazroid.hilttest.util.AppConstants.Companion.DATABASE_NAME
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@InstallIn(SingletonComponent::class)
@Module
object DatabaseModule {

    @Provides
    fun provideAppDatabase(app: Application)
            : AppDatabase = Room
        .databaseBuilder(app, AppDatabase::class.java, DATABASE_NAME)
        .fallbackToDestructiveMigration() // get correct db version if schema changed
        .build()

}
