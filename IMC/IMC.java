package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    private TextView Resultado;
    private EditText textIdade;
    private EditText textAltura;
    private EditText textPeso;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Resultado = findViewById(R.id.textResultado);
        textIdade = findViewById(R.id.textIdade);
        textAltura = findViewById(R.id.textAltura);
        textPeso = findViewById(R.id.textPeso);
    }


    public void CalculaIMC(View view) {

        double Altura = Double.parseDouble(textAltura.getText().toString());
        int Idade = Integer.parseInt(textIdade.getText().toString());
        double Peso = Double.parseDouble(textPeso.getText().toString());

        double imc = Peso / (Altura * Altura);

        if (Idade <= 65) {
            if (imc < 18.5){
                Resultado.setText("Baixo peso. IMC: "+ String.format("%.2f",imc));
            }
            else if(imc <= 24.9){
                Resultado.setText("Peso normal. IMC: "+ String.format("%.2f",imc));
            }
            else if ((imc <= 29.9)){
                Resultado.setText("Excesso de peso. IMC: "+ String.format("%.2f",imc));
            }
            else if((imc <= 34.9)){
                Resultado.setText("Obesidade de Classe 1. IMC: "+ String.format("%.2f",imc));
            }
            else if((imc <=  39.9)){
                Resultado.setText("Obesidade de Classe 2. IMC: "+ String.format("%.2f",imc));
            }
            else if(imc >= 40.0) {
                Resultado.setText("Obesidade de Classe 3. IMC: "+ String.format("%.2f",imc));
            }

            }
        else{
            if (imc<=22){
                Resultado.setText("Baixo Peso. IMC: "+ String.format("%.2f",imc));
            }
            else if((imc> 22)&&(imc < 27)){
                Resultado.setText("Adequado ou Eutrófico. IMC: "+ String.format("%.2f",imc));
            }
            else if (imc>=27){
                Resultado.setText("Alto peso para idosos. IMC: "+ String.format("%.2f",imc));
            }

        }
    }
}
