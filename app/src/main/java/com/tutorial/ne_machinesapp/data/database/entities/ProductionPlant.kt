package com.tutorial.ne_machinesapp.data.database.entities

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class ProductionPlant (
    @PrimaryKey val code: Int,
    @ColumnInfo(name = "namePP") val name: String?,
    @ColumnInfo(name = "state") val state: String?,
)