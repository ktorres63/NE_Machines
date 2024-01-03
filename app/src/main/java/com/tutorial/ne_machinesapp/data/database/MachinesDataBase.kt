package com.tutorial.ne_machinesapp.data.database

import androidx.room.Database
import com.tutorial.ne_machinesapp.data.database.dao.MachineMasterDao
import com.tutorial.ne_machinesapp.data.database.dao.ProductionLineDao
import com.tutorial.ne_machinesapp.data.database.dao.ProductionPlantDao
import com.tutorial.ne_machinesapp.data.database.entities.ProductionLine
import com.tutorial.ne_machinesapp.data.database.entities.ProductionPlant
import com.tutorial.ne_machinesapp.ui.MachinesMaster

@Database(entities = [MachinesMaster::class, ProductionLine::class, ProductionPlant::class],version = 1)
abstract class MachinesDataBase {
    abstract fun machineMasterDao(): MachineMasterDao
    abstract fun productionLineDao(): ProductionLineDao
    abstract fun productionPlantDao(): ProductionPlantDao
}