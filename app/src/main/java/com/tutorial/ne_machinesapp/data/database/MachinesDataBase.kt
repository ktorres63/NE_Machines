package com.tutorial.ne_machinesapp.data.database

import androidx.room.Database
import androidx.room.RoomDatabase
import com.tutorial.ne_machinesapp.data.database.dao.ProductionLineDao
import com.tutorial.ne_machinesapp.data.database.dao.ProductionPlantDao
import com.tutorial.ne_machinesapp.data.database.entities.ProductionLineEntity
import com.tutorial.ne_machinesapp.data.database.entities.ProductionPlantEntity
import com.tutorial.ne_machinesapp.data.database.entities.MachineMasterEntity

//MachineMasterEntity::class,
//@Database(entities = [ ProductionLineEntity::class, ProductionPlantEntity::class],version = 1)

@Database(entities = [ ProductionLineEntity::class, ProductionPlantEntity::class],version = 1, exportSchema = false)
abstract class MachinesDataBase: RoomDatabase() {
    //abstract fun machineMasterDao(): MachineMasterDao
    abstract fun getproductionLineDao(): ProductionLineDao
    abstract fun getproductionPlantDao(): ProductionPlantDao
}

