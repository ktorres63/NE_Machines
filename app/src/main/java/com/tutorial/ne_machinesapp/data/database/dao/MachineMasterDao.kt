package com.tutorial.ne_machinesapp.data.database.dao

import androidx.room.Dao
import androidx.room.Query
import com.tutorial.ne_machinesapp.data.database.entities.MachineMasterEntity
import com.tutorial.ne_machinesapp.data.database.entities.ProductionLineEntity

@Dao
interface MachineMasterDao {
    @Query("SELECT * FROM machinemasterentity")
    fun getAll(): List<MachineMasterEntity>
}