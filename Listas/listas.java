package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private ListView listlocais;
    private String[] itens ={
            "Angra dos Reis", "Caldas Novas",
            "Campos do Jordão", "Florianopolis",
            "Sao Paulo", "Rio de Janeiro", "Gramado",
            "Bonito", "Foz do Iguaçu", "Salvador", "Porto Seguro",
            "Belo Horizonte", "Porto Alegre", "Maceio"
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listlocais = findViewById(R.id.listlocais);

        //cria adaptador para a lista

        ArrayAdapter<String> adaptador = new ArrayAdapter<String>(
                getApplicationContext(),
                android.R.layout.simple_list_item_1, //layout da lista
                android.R.id.text1, //id do layout
                itens //a lista a ser passada
        );

        //adiciona adapter para a lista
        listlocais.setAdapter(adaptador);

        //adiciona clique na lista
        listlocais.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String valorSelecionado = listlocais.getItemAtPosition(position).toString();
                Toast.makeText(getApplicationContext(),valorSelecionado, Toast.LENGTH_LONG).show();

            }
        });
    }
}
