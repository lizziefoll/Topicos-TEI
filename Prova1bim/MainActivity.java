package com.example.jokenpo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import android.view.View;

import android.widget.EditText;

import android.widget.TextView;


import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Random random = new Random();
        TextView nome01 = findViewById(R.id.idNome01);
        TextView nome02 = findViewById(R.id.idNome02);
        TextView resultado = findViewById(R.id.idResultado);
        String  cont;
        int idNome01 = random.nextInt(3);
        int idNome02 = random.nextInt(3);

        //0 - pedra, 1 - papel, 2 - tesoura
        if(idNome01 == 0 && idNome02 == 1){
            cont = ("O jogador"+nome02+"ganhou o jogo tirando papel!"+nome01+"Voce tirou pedra :(");

        }
    }

}
