package com.example.trabajofinal_glovo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class BusquedaActivity extends AppCompatActivity {

    Button buscar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.filtros_busqueda);

        buscar = (Button) findViewById(R.id.btnBuscar);

        buscar.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent screenChanger = new Intent(getBaseContext(),
                        RestaurantesFiltrados.class
                );
                startActivity(screenChanger);
            }
        });

    }
}