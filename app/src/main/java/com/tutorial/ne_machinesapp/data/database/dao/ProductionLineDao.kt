package com.tutorial.ne_machinesapp.data.database.dao

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query
import com.tutorial.ne_machinesapp.data.database.entities.ProductionLine

@Dao
interface ProductionLineDao {
    @Query("SELECT * FROM productionLine")
    fun getAll(): List<ProductionLine>

    @Query("SELECT * FROM productionLine WHERE code IN (:plCodes)")
    fun loadAllByIds(plCodes: IntArray): List<ProductionLine>

    @Insert
    fun insertAll(vararg prodLines: ProductionLine )

    @Delete
    fun delete(prodLine: ProductionLine)
}