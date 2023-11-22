package com.devjakkifx.frasesdodia;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    // Atributos
    String[] frases = {
            "Frase 01",
            "Frase 02",
            "Frase 03",
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void gerarFrase(View view) {
        TextView texto = findViewById(R.id.txtFrase);
        int numRamdom = new Random().nextInt(3);
        String frase = frases[numRamdom];
        texto.setText( frase );
    }

    public void exibirTodas(View view) {
        TextView texto = findViewById(R.id.txtFrase);

        String txtFrase = "";
        for (String frase : frases) {
            txtFrase += frase;
        }

        texto.setText(txtFrase);
    }
}