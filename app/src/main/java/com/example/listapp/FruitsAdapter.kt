package com.example.listapp

import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

class FruitsAdapter(
    val fruit: ArrayList<Fruits>
) : RecyclerView.Adapter<FruitsAdapter.FruitViewHolder>() {

    class FruitViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): FruitViewHolder {
        TODO("Not yet implemented")
    }

    override fun onBindViewHolder(holder: FruitViewHolder, position: Int) {
        TODO("Not yet implemented")
    }

    override fun getItemCount(): Int = fruit.size


}
