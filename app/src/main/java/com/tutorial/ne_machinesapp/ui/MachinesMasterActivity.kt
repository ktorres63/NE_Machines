package com.tutorial.ne_machinesapp.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.tutorial.ne_machinesapp.databinding.ActivityMachinesMasterBinding

class MachinesMasterActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMachinesMasterBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding =ActivityMachinesMasterBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}