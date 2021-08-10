package com.example.listapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val fruits = Fruits.getRandomFruits(100)
        val fruitAdapter = FruitsAdapter(fruits)

        val rvTextView = findViewById<RecyclerView>(R.id.rvFruits)
        rvTextView.layoutManager = LinearLayoutManager(this)
        rvTextView.adapter = fruitAdapter
    }
}