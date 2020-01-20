package com.example.gasper.greenbils.db


import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import java.io.Serializable

@Entity(tableName = "Izdelek")
data class Izdelek(@PrimaryKey() var id: Int?,
                 @ColumnInfo(name = "naziv") var naziv: String,
                 @ColumnInfo(name = "kolicina") var kolicina: String,
                   @ColumnInfo(name = "cena") var cena: String,
                   @ColumnInfo(name = "tk") var tk: Int?
) : Serializable {



    constructor():this(0,"","","",0)
}

