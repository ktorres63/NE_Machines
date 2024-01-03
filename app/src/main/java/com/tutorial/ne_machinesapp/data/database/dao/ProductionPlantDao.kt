package com.tutorial.ne_machinesapp.data.database.dao

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query
import com.tutorial.ne_machinesapp.data.database.entities.ProductionPlant

@Dao
interface ProductionPlantDao {
    @Query("SELECT * FROM productionPlant")
    fun getAll(): List<ProductionPlant>

    @Query("SELECT * FROM productionPlant WHERE code IN (:plCodes)")
    fun loadAllByIds(ppCodes: IntArray): List<ProductionPlant>

    @Insert
    fun insertAll(vararg prodPlant: ProductionPlant)

    @Delete
    fun delete(prodPlant: ProductionPlant)
}