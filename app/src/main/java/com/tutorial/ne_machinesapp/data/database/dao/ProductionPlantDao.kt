package com.tutorial.ne_machinesapp.data.database.dao

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query
import com.tutorial.ne_machinesapp.data.database.entities.ProductionPlantEntity

@Dao
interface ProductionPlantDao {
    @Query("SELECT * FROM ProductionPlantEntity")
    fun getAll(): List<ProductionPlantEntity>

    @Query("SELECT * FROM ProductionPlantEntity WHERE code IN (:ppCodes)")
    fun loadAllByIds(ppCodes: IntArray): List<ProductionPlantEntity>

    @Insert
    fun insertAll(vararg prodPlant: ProductionPlantEntity)

    @Delete
    fun delete(prodPlant: ProductionPlantEntity)
}