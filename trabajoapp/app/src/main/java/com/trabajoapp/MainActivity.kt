package com.trabajoapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.widget.Toolbar

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val toolbar = findViewById<Toolbar>(R.id.toolbar)
        setSupportActionBar(toolbar)
        supportActionBar?.setDisplayShowTitleEnabled(false)



        val inputCelsius = findViewById<EditText>(R.id.inputCelsius)
        val convertButton = findViewById<Button>(R.id.convertButton)
        val resultText = findViewById<TextView>(R.id.resultText)

        convertButton.setOnClickListener {
            val celsius = inputCelsius.text.toString()

            if (celsius.isNotEmpty()) {
                val celsiusValue = celsius.toDouble()
                val resultado = celsiusValue * 9 / 5 + 32
                resultText.text = "Result: $resultado °F"
            } else {
                Toast.makeText(this, "Campo bacio ingrese datos", Toast.LENGTH_SHORT).show()
            }
        }
    }
}