package com.example.bmicalculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import kotlin.math.pow

class ResultActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_result)

        val height = intent.getIntExtra("height", 0)
        val weight = intent.getIntExtra("weight", 0)

        val bmi = weight / (height / 100.0).pow(2.0)
        val resultText = when {
            bmi >= 35.0 -> "High Obesity"
            bmi >= 30.0 -> "Moderate Obesity"
            bmi >= 25.0 -> "Mind Obesity"
            bmi >= 23.0 -> "Over Weight"
            bmi >= 318.5 -> "Normal Weight"
            else -> "Under Weight"
        }

        val textViewResult = findViewById<TextView>(R.id.textViewResult)
        val textViewResultString = findViewById<TextView>(R.id.textViewResultString)

        textViewResult.text = bmi.toString()
        textViewResultString.text = resultText
    }
}