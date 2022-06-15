package com.istiqomah.absensi

import androidx.room.Database
import com.istiqomah.absensi.model.ModelDatabase
import androidx.room.RoomDatabase
import com.istiqomah.absensi.database.dao.DatabaseDao



@Database(entities = [ModelDatabase::class], version = 1, exportSchema = false)
abstract class AppDatabase : RoomDatabase() {
    abstract fun databaseDao(): DatabaseDao?
}