package com.example.projeto_imc

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*
import org.w3c.dom.Text

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnCalcular = findViewById<Button>(R.id.botao)
        val etPeso = findViewById<EditText>(R.id.peso)
        val etAltura = findViewById<EditText>(R.id.altura)
        val textResultado = findViewById<TextView>(R.id.resultado)

        btnCalcular.setOnClickListener {
            val peso =  etPeso.text.toString().toInt()
            val altura = etAltura.text.toString().toDouble()

            val imc = calcularImc(peso, altura)

            textResultado.text = String.format("%.1f",imc)

        }

    }
}

