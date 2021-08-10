package com.example.listapp

import kotlin.random.Random

data class Fruits(
    val name: String,
    val origin: String,
    val quantity: Int
) {

    companion object {
        val FRUIT_NAMES = arrayOf(
            "apple", "apple", "apple", "apple",
            "apple", "apple", "apple", "apple"
        )

        val ORIGINS = arrayOf(
            "Anand", "Anand", "Anand", "Anand",
            "Anand", "Anand", "Anand", "Anand"
        )

        fun getRandomFruits(n: Int) {
            val fruitArray = ArrayList<Fruits>(n)

            for (i in 1..n) {
                fruitArray.add(
                    Fruits(
                        FRUIT_NAMES[Random.nextInt(8)],
                        ORIGINS[Random.nextInt(8)],
                        Random.nextInt(10)*100
                        )
                )
            }
        }
    }
}