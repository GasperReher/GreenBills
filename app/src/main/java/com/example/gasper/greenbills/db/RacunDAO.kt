package com.example.gasper.greenbills.db


import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy.REPLACE
import androidx.room.Query



@Dao
interface RacunDAO {
    @Query("SELECT * from Racun")
    fun getAll(): List<Racun>

    @Insert(onConflict = REPLACE)
    fun insert(racun:Racun)

}