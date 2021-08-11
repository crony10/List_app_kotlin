package com.example.listapp
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.listapp.databinding.ListItemBinding

//  Implemented the binding feature form : https://stackoverflow.com/questions/60423596/how-to-use-viewbinding-in-a-recyclerview-adapter
class FruitsAdapter(
    private val fruit: ArrayList<Fruits>
) : RecyclerView.Adapter<FruitsAdapter.FruitViewHolder>() {
//    private lateinit var binding: ListItemBinding

    class FruitViewHolder(private val itemBinding: ListItemBinding) :
        RecyclerView.ViewHolder(itemBinding.root) {
//        val tvName: TextView = item.findViewById<TextView>(R.id.tvName)
//        val tvOrigin: TextView = item.findViewById<TextView>(R.id.tvOrigin)
//        val tvQuantity: TextView = item.findViewById<TextView>(R.id.tvQuantity)
        fun bind(fruit: Fruits) {
            itemBinding.tvName.text = fruit.name
            itemBinding.tvOrigin.text = fruit.origin
            itemBinding.tvQuantity.text = fruit.quantity.toString()
        }
    }

//    Inner class: https://www.geeksforgeeks.org/kotlin-nested-class-and-inner-class/
//    inner class FruitViewHolder(val binding: SingleItemBinding): RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): FruitViewHolder {
//        val itemView = LayoutInflater.from(parent.context).inflate(
//            R.layout.list_item, parent, false
//        )
//        return FruitViewHolder(itemView)
        val itemBinding =
            ListItemBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return FruitViewHolder(itemBinding)
    }

    override fun onBindViewHolder(holder: FruitViewHolder, position: Int) {
//        holder.tvName.text = fruit[position].name
//        holder.tvOrigin.text = fruit[position].origin
//        holder.tvQuantity.text = fruit[position].quantity.toString()
        val fruit: Fruits = fruit[position]
        holder.bind(fruit)
    }

    override fun getItemCount(): Int = fruit.size
}
