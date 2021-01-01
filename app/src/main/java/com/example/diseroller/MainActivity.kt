package com.example.diseroller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import kotlin.random.Random

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // My code
        val clickDice: Button = findViewById(R.id.button)
        clickDice.setOnClickListener {
            Toast.makeText(this, "Next Turn", Toast.LENGTH_SHORT).show()

            working()

        }

    }

    private fun working() {
        // (If want to show the digits in TEXTVIEW)
//              val result: TextView = findViewById(R.id.value)
//              result.text = randomint.toString()

        // (If want to show the Images od numbers in IMAGEVIEW)
        val randomint = Random.nextInt(6) + 1
        val imagevalue = when (randomint) {
            1 -> R.drawable.dice1
            2 -> R.drawable.dice2
            3 -> R.drawable.dice3
            4 -> R.drawable.dice4
            5 -> R.drawable.dice5
            else -> R.drawable.dice6
        }
        val diceimage: ImageView = findViewById(R.id.imagee)
        diceimage.setImageResource(imagevalue)

    }
}