package com.example.bmicalculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val editTextHeight : EditText = findViewById(R.id.editTextHeight);
        val editTextWeight : EditText = findViewById(R.id.editTextWeight);
        val buttonCalculate : Button = findViewById(R.id.buttonCalculate);
    }
}