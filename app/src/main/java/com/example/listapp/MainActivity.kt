package com.example.listapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.listapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding : ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        val fruits = Fruits.getRandomFruits(100)
        val fruitAdapter = FruitsAdapter(fruits)

//        val rvTextView = findViewById<RecyclerView>(R.id.rvFruits)
        binding.rvFruits.layoutManager = LinearLayoutManager(this)
        binding.rvFruits.adapter = fruitAdapter
    }
}