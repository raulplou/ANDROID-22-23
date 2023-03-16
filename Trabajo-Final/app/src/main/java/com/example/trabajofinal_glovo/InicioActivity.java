package com.example.trabajofinal_glovo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class InicioActivity extends AppCompatActivity {

    Button ventas,elegir;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.inicio);

        ventas = (Button) findViewById(R.id.btnVentas);

        ventas.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent screenChanger = new Intent(getBaseContext(),
                        TopRestaurantes.class
                );
                Bundle topBundle = new Bundle();
                topBundle.putString("Top", ventas.getText().toString());
                screenChanger.putExtras(topBundle);

                startActivity(screenChanger);
            }
        });

        elegir = (Button) findViewById(R.id.btnElegir);

        elegir.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent screenChanger = new Intent(getBaseContext(),
                        ListaRestaurantes.class
                );
                startActivity(screenChanger);
            }
        });


    }
}