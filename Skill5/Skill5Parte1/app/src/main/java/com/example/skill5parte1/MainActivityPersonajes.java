package com.example.skill5parte1;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivityPersonajes extends AppCompatActivity {

    ArrayList<PersonajeVo> listaPersonajes;
    RecyclerView recyclerPersonajes;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_personajes);

        listaPersonajes = new ArrayList<>();
        recyclerPersonajes = (RecyclerView) findViewById(R.id.recyclerId);
        recyclerPersonajes.setLayoutManager(new LinearLayoutManager(this));
        
        llenarPersonajes();

        AdaptadorPersonajes adapter = new AdaptadorPersonajes(listaPersonajes);
        recyclerPersonajes.setAdapter(adapter);
    }

    private void llenarPersonajes() {
        listaPersonajes.add(new PersonajeVo("Krusty","",R.drawable.krusti));
        listaPersonajes.add(new PersonajeVo("Homer","",R.drawable.homero));
        listaPersonajes.add(new PersonajeVo("Marge","",R.drawable.marge));
        listaPersonajes.add(new PersonajeVo("Bart","",R.drawable.bart));
        listaPersonajes.add(new PersonajeVo("Lisa","",R.drawable.lisa));
        listaPersonajes.add(new PersonajeVo("Magie","",R.drawable.magie));
        listaPersonajes.add(new PersonajeVo("Flanders","",R.drawable.flanders));
        listaPersonajes.add(new PersonajeVo("Milhouse","",R.drawable.milhouse));
        listaPersonajes.add(new PersonajeVo("Mr. Burns","",R.drawable.burns));
    }


}