package com.example.trabajofinal_glovo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ListaRestaurantes extends AppCompatActivity {

    Button busqueda;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.lista_restaurantes);

        busqueda = (Button) findViewById(R.id.btnPersonalizada);

        busqueda.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent screenChanger = new Intent(getBaseContext(),
                        BusquedaActivity.class
                );
                startActivity(screenChanger);
            }
        });
    }
}