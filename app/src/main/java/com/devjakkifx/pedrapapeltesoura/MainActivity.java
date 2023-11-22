package com.devjakkifx.pedrapapeltesoura;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void selecionarPedra(View view) {
        verificarGanhador("pedra");
    }

    public void selecionarPapel(View view) {
        verificarGanhador("papel");
    }

    public void selecionarTesoura(View view) {
        verificarGanhador("tesoura");
    }

    private String gerarEscolhaAleatoriaApp() {
        String[] opcoes = { "pedra", "papel", "tesoura" };
        int numRandom = new Random().nextInt(3); // Gerando numero aleatorio
        ImageView imagemApp = findViewById(R.id.imageApp); // Selecionando imagem por ID
        String escolhaDoApp = opcoes[numRandom]; // Recebendo valor aleatorio

        switch (escolhaDoApp) {
            case "pedra":
                imagemApp.setImageResource(R.drawable.pedra);
                break;
            case "papel":
                imagemApp.setImageResource(R.drawable.papel);
                break;
            case "tesoura":
                imagemApp.setImageResource(R.drawable.tesoura);
                break;
        }

        return escolhaDoApp;
    }

    private void verificarGanhador(String escolhaDoUsuario) {
        String escolhaDoApp = gerarEscolhaAleatoriaApp();
        TextView txtResult = findViewById(R.id.txtResult);

        if (
                escolhaDoApp == "pedra" && escolhaDoUsuario == "tesoura" ||
                escolhaDoApp == "papel" && escolhaDoUsuario == "pedra" ||
                escolhaDoApp == "tesoura" && escolhaDoUsuario == "papel"
        ) {
            txtResult.setText("Você perdeu!");
        } else if (
                escolhaDoUsuario == "pedra" && escolhaDoApp == "tesoura" ||
                escolhaDoUsuario == "papel" && escolhaDoApp == "pedra" ||
                escolhaDoUsuario == "tesoura" && escolhaDoApp == "papel"
        ) {
            txtResult.setText("Você venceu!");
        } else {
            txtResult.setText("Empatamos!");
        }

    }
}