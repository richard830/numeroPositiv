package com.juego.numeropositivo

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

        val cajaInput = findViewById<EditText>(R.id.inputNumber)
        val boton = findViewById<Button>(R.id.evaluateButton)
        val resultado = findViewById<TextView>(R.id.resultText)

        boton.setOnClickListener {
            val numero = cajaInput.text.toString()

            if (numero.isNotEmpty()) {
                val num = numero.toInt()
                val result = when {
                    num > 0 -> "Positivo"
                    num < 0 -> "Negativo"
                    else -> "Cero"
                }
                resultado.text = "Result: $result"
            } else {
                Toast.makeText(this, "Campo Bacio", Toast.LENGTH_SHORT).show()
            }
        }
    }
}