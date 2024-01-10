package com.tutorial.ne_machinesapp.ui

import android.nfc.Tag
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.ArrayAdapter
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.tutorial.ne_machinesapp.R
import com.tutorial.ne_machinesapp.data.adapters.ProdLineAdapter
import com.tutorial.ne_machinesapp.data.adapters.ProdPlantAdapter
import com.tutorial.ne_machinesapp.databinding.ActivityProductionLineBinding

class ProductionLineActivity : AppCompatActivity() {
    private lateinit var binding: ActivityProductionLineBinding

    private lateinit var rvProdLine: RecyclerView
    private lateinit var prodLineAdapter: ProdLineAdapter

    private lateinit var pLines: ArrayList<ProdLine>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityProductionLineBinding.inflate(layoutInflater)
        setContentView(binding.root)
        RegisterStateSpinner()
        dataInitialized()
        initUI()
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

            binding.rvPLines.layoutManager = LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false)

            prodLineAdapter = ProdLineAdapter(pLines)
            rvProdLine.adapter = prodLineAdapter
        }
    }
    private fun dataInitialized(){
        pLines = arrayListOf(
            ProdLine("00001","Jhon Doe","A"),
            ProdLine("00002","Dan Smith","I"),
            ProdLine("00003","Donnie Darko","*"),

        )
//        pLines.add(ProdLine("0001","asdd","A"))
//        pLines.add(ProdLine("0002","asdssdd","A"))

    }

}