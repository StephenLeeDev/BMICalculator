package com.example.bmicalculator

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val editTextHeight : EditText = findViewById(R.id.editTextHeight)
        val editTextWeight : EditText = findViewById(R.id.editTextWeight)
        val buttonCalculate : Button = findViewById(R.id.buttonCalculate)

        buttonCalculate.setOnClickListener {
            val height = editTextHeight.text.toString()
            val weight = editTextWeight.text.toString()

            if (height.isEmpty()) {
                Toast.makeText(this, "Please Enter Height", Toast.LENGTH_SHORT).show()
                return@setOnClickListener
            } else if (weight.isEmpty()) {
                Toast.makeText(this, "Please Enter Weight", Toast.LENGTH_SHORT).show()
                return@setOnClickListener
            }

            val intent = Intent(this, ResultActivity::class.java)
            startActivity(intent)
        }
    }
}