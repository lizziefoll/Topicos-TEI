package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    TextView Resultado = findViewById(R.id.textResultado);
    EditText textIdade = findViewById(R.id.textIdade);
    EditText textAltura = findViewById(R.id.textAltura);
    EditText textPeso = findViewById(R.id.textPeso);

    double Altura = Double.parseDouble(textAltura.getText().toString());
    int Idade = Integer.parseInt(textIdade.getText().toString());
    double Peso = Double.parseDouble(textPeso.getText().toString());
    public void CalculaIMC(View view) {

        double imc = Peso / (Altura * Altura);

        if (Idade <= 65) {
            if (imc < 18.5){
                Resultado.setText("Baixo peso. IMC: "+ imc);
            }
            else if((imc >= 18.5) && (imc <= 24.9)){
                Resultado.setText("Peso normal. IMC: "+imc);
            }
            else if ((25.0 >= imc) && (imc <= 29.9)){
                Resultado.setText("Excesso de peso. IMC: "+imc);
            }
            else if((30.0>= imc) &&(imc <= 34.9)){
                Resultado.setText("Obesidade de Classe 1. IMC: "+imc);
            }
            else if((35.0 >= imc) && (imc <=  39.9)){
                Resultado.setText("Obesidade de Classe 2. IMC: "+imc);
            }
            else if(imc >= 40.0) {
                Resultado.setText("Obesidade de Classe 3. IMC: "+imc);
            }

            else{
                if (imc<=22){
                    Resultado.setText("Baixo Peso. IMC: "+imc);
                }
                else if((imc> 22)&&(imc < 27)){
                    Resultado.setText("Adequado ou Eutrófico. IMC: "+imc);
                }
                else if (imc>=27){
                    Resultado.setText("Alto peso para idosos. IMC: "+imc);
                }
            }

        }
    }
}
