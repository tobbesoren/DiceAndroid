package com.example.dice

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import kotlin.properties.Delegates

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val randomNumberText = findViewById<TextView>(R.id.randomNumberText)
        val button = findViewById<Button>(R.id.button)
        var numberOfSides : Int

        button.setOnClickListener {
            if(findViewById<EditText>(R.id.numberOfSidesEdit).text.toString().toIntOrNull() != null
                && findViewById<EditText>(R.id.numberOfSidesEdit).text.toString().toInt() > 0  ) {
                numberOfSides = findViewById<EditText>(R.id.numberOfSidesEdit)
                    .text.toString().toInt()
                randomNumberText.text = randomNumber(numberOfSides).toString()
            }

        }
    }
    private fun randomNumber(sides : Int): Int {
        val randomNumber = (1..sides).random()
        Log.d("randomNumber: ", randomNumber.toString())
        return randomNumber
    }
}