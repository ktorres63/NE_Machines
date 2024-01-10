package com.tutorial.ne_machinesapp.data.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.tutorial.ne_machinesapp.R
import com.tutorial.ne_machinesapp.ui.ProdLine

class ProdLineAdapter(private val PlineList: ArrayList<ProdLine>): RecyclerView.Adapter<ProdLineViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ProdLineViewHolder {
        val itemView =LayoutInflater.from(parent.context).inflate(R.layout.item_prod_line,parent,false)
        return ProdLineViewHolder(itemView)
    }

    override fun getItemCount() = PlineList.size

    override fun onBindViewHolder(holder: ProdLineViewHolder, position: Int) {
        val currentItem = PlineList[position]
        holder.code.text = currentItem.code
    }
}