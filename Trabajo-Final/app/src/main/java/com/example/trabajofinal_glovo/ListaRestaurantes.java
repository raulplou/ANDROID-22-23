package com.example.trabajofinal_glovo;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.trabajofinal_glovo.entities.Restaurantes;

import java.util.ArrayList;

public class ListaRestaurantes extends AppCompatActivity {

    ArrayList<Restaurantes> listaRestaurantes;
    RecyclerView recyclerRestaurantes;
    Button busqueda;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.lista_restaurantes);

        listaRestaurantes = new ArrayList<>();
        recyclerRestaurantes = (RecyclerView) findViewById(R.id.recyclerId);
        recyclerRestaurantes.setLayoutManager(new LinearLayoutManager(this));
        busqueda = (Button) findViewById(R.id.btnPersonalizada);

        busqueda.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent screenChanger = new Intent(getBaseContext(),
                        BusquedaActivity.class
                );
                startActivity(screenChanger);
            }
        });

        llenarRestaurantes();

        AdaptadorRestaurantes adapter = new AdaptadorRestaurantes(listaRestaurantes);
        recyclerRestaurantes.setAdapter(adapter);
    }

    private void llenarRestaurantes() {
        listaRestaurantes.add(new Restaurantes("La Mafia","Comida italiana"));
        listaRestaurantes.add(new Restaurantes("El Churrasco","Comida aragonesa"));
        listaRestaurantes.add(new Restaurantes("Ché","Comida argentina"));
    }
}