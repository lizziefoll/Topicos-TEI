package com.example.jokenpo01;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import android.view.View;

import android.widget.EditText;

import android.widget.ImageView;
import android.widget.TextView;


import java.util.ArrayList;
import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



    }
    public void Jokenpo(View view){
        Random random = new Random();
        ArrayList <Integer> imagens = new ArrayList<>();
        imagens.add(R.drawable.pedra);
        imagens.add(R.drawable.papel);
        imagens.add(R.drawable.tesoura);

        TextView tnome01 = findViewById(R.id.idNome01);
        TextView tnome02 = findViewById(R.id.idNome02);
        String nome01 = tnome01.getText().toString();
        String nome02 = tnome02.getText().toString();
        TextView resultado = findViewById(R.id.idResultado);
        String  cont = "";
        ImageView p1 = findViewById(R.id.papel);
        ImageView p2 = findViewById(R.id.papel01);
        p1.setVisibility(View.VISIBLE);
        p2.setVisibility(View.VISIBLE);



        int idNome01 = random.nextInt(3);
        int idNome02 = random.nextInt(3);
        p1.setImageResource(imagens.get(idNome01));
        p2.setImageResource(imagens.get(idNome02));


        //0 - pedra, 1 - papel, 2 - tesoura
        if (idNome01 == idNome02){ //caso empate
            cont = ("O jogo de empate!");

        }else if(idNome01 == 0 && idNome02 == 1){ //pedra e papel
            cont = ("O jogador"+nome02+"ganhou o jogo tirando papel!\n"+nome01+" voce tirou pedra :(");


        }else if(idNome01 == 0 && idNome02 == 2) {  //pedra e tesoura
            cont = ("O jogador "+nome01+" ganhou o jogo tirando pedra!\n"+nome02+" voce tirou tesoura :(");
        }else if(idNome01 == 1 && idNome02 == 0){ //papel e pedra
            cont = ("O jogador "+nome01+" ganhou o jogo tirando papel!\n"+nome02+" voce tirou pedra:(");
        } else if(idNome01 == 2 && idNome02 == 0){ //tesoura e pedra
            cont = ("O jogador "+nome01+" ganhou o jogo tirando pedra!\n"+nome02+" voce tirou tesoura:(");
        }else if(idNome01 == 2 && idNome02 == 1) { //tesoura e papel
            cont = ("O jogador "+nome01+" ganhou o jogo tirando tesoura!\n"+nome02+" voce tirou papel:(");
        }else if(idNome01 == 1 && idNome02 == 2) {
            cont = ("O jogador "+nome01+" ganhou o jogo tirando papel!\n"+nome02+" voce tirou tesoura:(");
        }
        resultado.setText(cont);

    }
}
