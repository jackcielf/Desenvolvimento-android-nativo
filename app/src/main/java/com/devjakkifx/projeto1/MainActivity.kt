package com.devjakkifx.projeto1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import java.util.Random

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun sortear(view: View) {
        val txtResult = findViewById<TextView>(R.id.text_result); // Seleciona um elemento da interface pelo ID
        val number = Random().nextInt(10); // Gera um número inteiro aleatório, no caso, de 0 a 10
        txtResult.setText("Número gerado: $number");
    }
}