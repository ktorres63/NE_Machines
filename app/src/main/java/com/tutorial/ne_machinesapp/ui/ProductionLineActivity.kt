package com.tutorial.ne_machinesapp.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import com.tutorial.ne_machinesapp.R
import com.tutorial.ne_machinesapp.databinding.ActivityProductionLineBinding

class ProductionLineActivity : AppCompatActivity() {
    private lateinit var binding: ActivityProductionLineBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityProductionLineBinding.inflate(layoutInflater)
        setContentView(binding.root)
        //RegisterStateSpinner()
        //initUI()
    }
    private fun RegisterStateSpinner(){
        ArrayAdapter.createFromResource(
            this,
            R.array.RegisterStates,
            android.R.layout.simple_spinner_item
        ).also { adapter ->
            adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
            binding.spinPLState.adapter = adapter
        }
    }
    private fun initUI() {
        binding.btnAddPLine.setOnClickListener {
            val codigo = binding.etPLCode.text.toString().toInt()
            val nombre = binding.etPLName

        }
    }

}