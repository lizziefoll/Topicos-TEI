package com.example.appmapas;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

import android.widget.TextView;


import com.github.chrisbanes.photoview.PhotoView;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;


public class MainActivity extends AppCompatActivity {

    public TextInputEditText idestadinho;

    public TextView nome;

    public TextView idpopulacao;
    public TextView idarea;
    public TextView ididh;
    public TextView idmunicipios;

    public PhotoView IDmapa;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        nome = findViewById(R.id.nome);

        idestadinho = findViewById(R.id.entrada);

        idpopulacao = findViewById(R.id.idpopulacao);
        idarea = findViewById(R.id.idarea);
        ididh = findViewById(R.id.ididh);
        idmunicipios = findViewById(R.id.idmunicipios);

        IDmapa = findViewById(R.id.IDmapa);

    }
    public void Mapas(View view){

        String estado = idestadinho.getText().toString();
        estado = estado.toLowerCase();

        if (estado.equals("distrito federal")){

            nome.setText("Distrito Federal");
            nome.setVisibility(View.VISIBLE);

            IDmapa.setImageResource(R.drawable.mapadf);
            IDmapa.setVisibility(View.VISIBLE);

            idpopulacao.setText("População: 2,923 milhões.");
            idarea.setText("Area: 5.760 km².");
            ididh.setText("IDH: 0,873.");
            idmunicipios.setText("Municipios: unidade da federação.");

            idpopulacao.setVisibility(View.VISIBLE);
            idarea.setVisibility(View.VISIBLE);
            ididh.setVisibility(View.VISIBLE);
            idmunicipios.setVisibility(View.VISIBLE);


        }
        else if (estado.equals("goias")){

            nome.setText("Goiás");
            nome.setVisibility(View.VISIBLE);

            IDmapa.setImageResource(R.drawable.mapago);
            IDmapa.setVisibility(View.VISIBLE);

            idpopulacao.setText("População: 6,523 milhões.");
            idarea.setText("Area: 340.086 km².");
            ididh.setText("IDH: 0,735.");
            idmunicipios.setText("Municipios: 246.");

            idpopulacao.setVisibility(View.VISIBLE);
            idarea.setVisibility(View.VISIBLE);
            ididh.setVisibility(View.VISIBLE);
            idmunicipios.setVisibility(View.VISIBLE);

        }
        else if (estado.equals("mato grosso do sul")){

            nome.setText("Mato Grosso do Sul");
            nome.setVisibility(View.VISIBLE);

            IDmapa.setImageResource(R.drawable.mapams);
            IDmapa.setVisibility(View.VISIBLE);


            idpopulacao.setText("População: 2,62 milhões.");
            idarea.setText("Area: 357.125 km².");
            ididh.setText("IDH: 0,729.");
            idmunicipios.setText("Municipios: 79.");

            idpopulacao.setVisibility(View.VISIBLE);
            idarea.setVisibility(View.VISIBLE);
            ididh.setVisibility(View.VISIBLE);
            idmunicipios.setVisibility(View.VISIBLE);

        }
        else if (estado.equals("mato grosso")){

            nome.setText("Mato Grosso");
            nome.setVisibility(View.VISIBLE);

            IDmapa.setImageResource(R.drawable.mapams);
            IDmapa.setVisibility(View.VISIBLE);


            idpopulacao.setText("População: 3,224 milhões.");
            idarea.setText("Area: 903.357 km².");
            ididh.setText("IDH: 0.773.");
            idmunicipios.setText("Municipios: 141.");

            idpopulacao.setVisibility(View.VISIBLE);
            idarea.setVisibility(View.VISIBLE);
            ididh.setVisibility(View.VISIBLE);
            idmunicipios.setVisibility(View.VISIBLE);

        }
        else{
            nome.setText("erro");
            nome.setVisibility(View.VISIBLE);
        }
    }
}
