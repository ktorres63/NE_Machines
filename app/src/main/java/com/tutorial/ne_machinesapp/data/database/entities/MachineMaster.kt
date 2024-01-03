package com.tutorial.ne_machinesapp.data.database.entities

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class MachineMaster (
    @PrimaryKey val code: Int,
    @ColumnInfo(name = "nameMM") val name: String?,
    @ColumnInfo(name = "prodLine") val prodLine: String?,
    @ColumnInfo(name = "prodPlant") val prodPlant: String?,
    @ColumnInfo(name = "location") val location: String?,
    @ColumnInfo(name = "state") val state: String?,
)
