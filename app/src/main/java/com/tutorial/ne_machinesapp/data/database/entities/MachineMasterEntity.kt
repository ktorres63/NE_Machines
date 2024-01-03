package com.tutorial.ne_machinesapp.data.database.entities

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class MachineMasterEntity (
    @PrimaryKey val code: Int,
    @ColumnInfo(name = "nameMM") val nameMM: String?,
    @ColumnInfo(name = "prodLine") val prodLine: String?,
    @ColumnInfo(name = "prodPlant") val prodPlant: String?,
    @ColumnInfo(name = "locationMM") val locationMM: String?,
    @ColumnInfo(name = "stateMM") val stateMM: String?,
)
