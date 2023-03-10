package com.example.trabajofinal_glovo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Restaurante extends AppCompatActivity {

    Button ficha;
    Button menu;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.restaurante);

        ficha = (Button) findViewById(R.id.btnFicha);

        ficha.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent screenChanger = new Intent(getBaseContext(),
                        FichaDescriptiva.class
                );
                startActivity(screenChanger);
            }
        });

        menu = (Button) findViewById(R.id.btnFicha);

        menu.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent screenChanger = new Intent(getBaseContext(),
                        FichaDescriptiva.class
                );
                startActivity(screenChanger);
            }
        });
    }
}