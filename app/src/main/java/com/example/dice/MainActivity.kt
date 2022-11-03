package com.example.dice

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import android.widget.ImageView
import android.widget.TextView
import kotlin.properties.Delegates

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //val randomNumberText = findViewById<TextView>(R.id.randomNumberText)
        val button = findViewById<Button>(R.id.button)
        //var numberOfSides : Int
        val dieImageView = findViewById<ImageView>(R.id.dieImageView)

        button.setOnClickListener {
            /*if(findViewById<EditText>(R.id.numberOfSidesEdit).text.toString().toIntOrNull() != null
                && findViewById<EditText>(R.id.numberOfSidesEdit).text.toString().toInt() > 0  ) {
                numberOfSides = findViewById<EditText>(R.id.numberOfSidesEdit)
                    .text.toString().toInt()
                randomNumberText.text = randomNumber(numberOfSides).toString()
            }*/
            rollDie(dieImageView)

        }
    }
    private fun randomNumber(sides : Int): Int {
        val randomNumber = (1..sides).random()
        Log.d("randomNumber: ", randomNumber.toString())
        return randomNumber
    }

    private fun rollDie(dieImageView : ImageView) {
        val randomNumber = (1..6).random()
        when(randomNumber) {
            1 -> dieImageView.setImageResource(R.drawable.die1)
            2 -> dieImageView.setImageResource(R.drawable.die2)
            3 -> dieImageView.setImageResource(R.drawable.die3)
            4 -> dieImageView.setImageResource(R.drawable.die4)
            5 -> dieImageView.setImageResource(R.drawable.die5)
            6 -> dieImageView.setImageResource(R.drawable.die6)
        }
    }
}