package com.example.gasper.greenbills.db

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy.REPLACE
import androidx.room.Query
import com.example.gasper.greenbils.db.Izdelek


@Dao
interface IzdelekDAO {
/*    @Query("SELECT * from Izdelek")
    fun getAll(): List<Izdelek>*/

    @Query("SELECT * from Izdelek where tk=:id")
    fun getSpecial( id:Int): List<Izdelek>

    @Insert(onConflict = REPLACE)
    fun insert(izdelek:Izdelek)

}