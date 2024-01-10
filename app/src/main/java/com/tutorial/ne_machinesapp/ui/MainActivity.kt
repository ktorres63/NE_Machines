package com.tutorial.ne_machinesapp.ui

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.tutorial.ne_machinesapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnProducionLine.setOnClickListener {
            val intent = Intent(this, ProductionLineActivity::class.java)
            startActivity(intent)
        }
        binding.btnMastersMachines.setOnClickListener {
            val intent = Intent(this, MachinesMasterActivity::class.java)
            startActivity(intent)
        }
        binding.btnProducionPlant.setOnClickListener {
            val intent = Intent(this, ProductionPlantActivity::class.java)
            startActivity(intent)
        }
    }
}