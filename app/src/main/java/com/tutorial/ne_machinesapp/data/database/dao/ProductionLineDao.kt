package com.tutorial.ne_machinesapp.data.database.dao

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query
import com.tutorial.ne_machinesapp.data.database.entities.ProductionLineEntity

@Dao
interface ProductionLineDao {
    @Query("SELECT * FROM ProductionLineEntity")
    fun getAll(): List<ProductionLineEntity>

    @Query("SELECT * FROM ProductionLineEntity WHERE code IN (:plCodes)")
    fun loadAllByIds(plCodes: IntArray): List<ProductionLineEntity>

    @Insert
    fun insertAll(vararg prodLines: ProductionLineEntity )

    @Delete
    fun delete(prodLine: ProductionLineEntity)
}