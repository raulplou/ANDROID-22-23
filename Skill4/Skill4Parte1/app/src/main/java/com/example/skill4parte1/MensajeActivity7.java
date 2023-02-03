package com.example.skill4parte1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MensajeActivity7 extends AppCompatActivity {

    TextView msj;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mensaje7);

        msj = (TextView) findViewById(R.id.txtNombreMsj);

        Bundle miBundle = this.getIntent().getExtras();

        if (miBundle != null){
            String nombre = miBundle.getString("nombre");
            msj.setText("Bienvenido: " + nombre);
        }
    }

    public void onclick(View view) {
        finish();
    }
}