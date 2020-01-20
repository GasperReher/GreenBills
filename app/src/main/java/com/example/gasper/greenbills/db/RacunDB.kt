package com.example.gasper.greenbills.db


import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.example.gasper.greenbils.db.Izdelek


@Database(entities = arrayOf(Racun::class,Izdelek::class), version = 4)
abstract class RacunDB : RoomDatabase() {
    abstract fun racunDao(): RacunDAO
    abstract fun izdelekDao(): IzdelekDAO

    companion object {
        private var INSTANCE: RacunDB? = null

        fun getInstance(context: Context): RacunDB? {
            if (INSTANCE == null) {
                synchronized(RacunDB::class) {
                    INSTANCE = Room.databaseBuilder(context.applicationContext,
                        RacunDB::class.java, "RacunDB.db")
                        .fallbackToDestructiveMigration()
                        .build()
                }
            }
            return INSTANCE
        }

        fun destroyInstance() {
            INSTANCE = null
        }
    }

}