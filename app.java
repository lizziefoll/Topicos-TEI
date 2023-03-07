package com.example.imc;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        String Resultado = findViewById(R.id.textResultado);
        double Altura = Double.parseDouble(textAltura.getText().toString());
        int Idade = Integer.parseInt((textIdade.getText().toString));
        float Peso = Float.parseFloat((textPeso.getText().toString));


    }

    public void CalculaIMC(View view) {
            String Resultado.getText().toString();
            String Idade.getText().toString();
            String Peso.getText().toString();
            String Altura.getText().toString();

            double ALTURA = Double.parseDouble(Altura);

            double imc = Peso / (Altura * Altura);

            String idade = Idade.getText();
            int IDADE = Integer.parseInt(Idade);


            if (IDADE <= 65) {
                if (imc < 18.5){
                    Resultado.setText("Baixo peso: ", imc);
                        }
                else if((imc >= 18.5) && (imc <= 24.9)){
                    Resultado.setText("Peso normal", imc);
                }
                else if ((25.0 >= imc) && (imc <= 29.9)){
                    Resultado.setText("Excesso de peso", imc);
                }
                else if((30.0>= imc) &&(imc <= 34.9)){
                    Resultado.setText("Obesidade de Classe 1", imc);
                }
                else if((35.0 >= imc) && (imc <=  39.9)){
                    Resultado.setText("Obesidade de Classe 2", imc);
                }
                else if(imc >= 40.0) {
                    Resultado.setText("Obesidade de Classe 3", imc);
                }
            }
            
        }
    }
}
