package com.example.skill4parte1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity8 extends AppCompatActivity {

    TextView estado;
    Spinner comboDias;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main8);

        estado = (TextView) findViewById(R.id.etiSeleccion);
        comboDias = (Spinner) findViewById(R.id.idSpinnerDias);

        ArrayList<String> comboDiasList = new ArrayList<String>();

        comboDiasList.add("Seleccione!!! ");
        for (int i=0;i<=10;i++){
            comboDiasList.add("Opcion: " + i);
        }


        ArrayAdapter<CharSequence> adapter = new ArrayAdapter(this,
                android.R.layout.simple_spinner_item,comboDiasList);

        comboDias.setAdapter(adapter);

        comboDias.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener(){

            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(parent.getContext(),"Seleccionado: " + parent.getItemAtPosition(position).toString(), Toast.LENGTH_LONG).show();
                estado.setText("Selección: " + parent.getItemAtPosition(position).toString());
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
    }
}