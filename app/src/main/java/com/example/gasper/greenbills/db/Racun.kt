package com.example.gasper.greenbills.db


import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import java.io.Serializable

@Entity(tableName = "Racun")
data class Racun(@PrimaryKey() var id: Int?,
                 @ColumnInfo(name = "datum") var datum: String,
                 @ColumnInfo(name = "trgovina") var trgovina: String
) : Serializable {



    constructor():this(0,"","")
}
