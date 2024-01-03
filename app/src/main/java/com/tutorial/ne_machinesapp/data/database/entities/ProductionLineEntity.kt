package com.tutorial.ne_machinesapp.data.database.entities

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class ProductionLineEntity (
    @PrimaryKey val code: Int,
    @ColumnInfo(name = "namePL") val namePL: String?,
    @ColumnInfo(name = "statePL") val statePL: String?,
)