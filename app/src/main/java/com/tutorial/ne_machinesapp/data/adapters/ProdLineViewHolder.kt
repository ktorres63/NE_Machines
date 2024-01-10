package com.tutorial.ne_machinesapp.data.adapters

import android.view.View
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.tutorial.ne_machinesapp.R


class ProdLineViewHolder(itemView: View): RecyclerView.ViewHolder(itemView){
    val code: TextView = itemView.findViewById(R.id.tvCode_ItemPL)
    val name: TextView = itemView.findViewById(R.id.tvName_ItemPL)
    val state: TextView = itemView.findViewById(R.id.tvState_ItemPL)

}