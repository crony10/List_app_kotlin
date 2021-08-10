package com.example.listapp

import kotlin.random.Random

data class Fruits(
    val name: String,
    val origin: String,
    val quantity: Int
) {

//    https://blog.mindorks.com/companion-object-in-kotlin
    companion object {
        @JvmField
        val FRUIT_NAMES = arrayOf(
            "apple", "apple", "apple", "apple",
            "apple", "apple", "apple", "apple"
        )

        @JvmField
        val ORIGINS = arrayOf(
            "Anand", "Anand", "Anand", "Anand",
            "Anand", "Anand", "Anand", "Anand"
        )

        @JvmStatic
        fun getRandomFruits(n: Int): ArrayList<Fruits> {
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
            return fruitArray
        }
    }
}