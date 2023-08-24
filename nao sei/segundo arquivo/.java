package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button buttonEnviar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        buttonEnviar = findViewById(R.id.buttonEnviar);

        buttonEnviar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), segundaActivity.class);


                Usuario usuario = new Usuario("Elisabeth", "elisabethff.escolar@gmail.com");

                //PASSAR DADOS
                intent.putExtra("nome", "Elisabeth");
                intent.putExtra("idade", "17");
                intent.putExtra("objeto", usuario);

                startActivity(intent);
            }
        });
    }
}
