package com.example.listapp

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.listapp.R
import com.example.listapp.Fruits

class FruitsAdapter(
    private val fruit: ArrayList<Fruits>
) : RecyclerView.Adapter<FruitsAdapter.FruitViewHolder>() {


    class FruitViewHolder(item: View) : RecyclerView.ViewHolder(item){
        val tvName: TextView = item.findViewById<TextView>(R.id.tvName)
        val tvOrigin: TextView = item.findViewById<TextView>(R.id.tvOrigin)
        val tvQuantity: TextView = item.findViewById<TextView>(R.id.tvQuantity)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): FruitViewHolder {
        val itemView = LayoutInflater.from(parent.context).inflate(
            R.layout.list_item, parent, false
        )
        return FruitViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: FruitViewHolder, position: Int) {
        holder.tvName.text = fruit[position].name
        holder.tvOrigin.text = fruit[position].origin
        holder.tvQuantity.text = fruit[position].quantity.toString()
    }

    override fun getItemCount(): Int = fruit.size
}
