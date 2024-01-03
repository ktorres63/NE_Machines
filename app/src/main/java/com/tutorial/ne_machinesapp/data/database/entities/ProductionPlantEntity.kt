package com.tutorial.ne_machinesapp.data.database.entities

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class ProductionPlantEntity (
    @PrimaryKey val code: Int,
    @ColumnInfo(name = "namePP") val namePP: String?,
    @ColumnInfo(name = "statePP") val statePP: String?,
)