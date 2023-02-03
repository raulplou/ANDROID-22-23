package com.example.skill4parte1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity7 extends AppCompatActivity {

    EditText campoNombre;
    TextView etiNombre;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main7);

        campoNombre = (EditText) findViewById(R.id.txtNombre);
        etiNombre = (TextView) findViewById(R.id.etiNombre);

    }

    public void evento(View view) {
        switch (view.getId()){
            case R.id.btnIngresar:
                String nombre = campoNombre.getText().toString();
                etiNombre.setText("Bienvenido: " + nombre);

                Toast.makeText(this,"El nombre es: " + nombre,Toast.LENGTH_SHORT).show();

                break;
            case R.id.btnEnviar:
                Intent miIntent = new Intent(MainActivity7.this, MensajeActivity7.class);

                Bundle miBundle = new Bundle();
                miBundle.putString("nombre",campoNombre.getText().toString());

                miIntent.putExtras(miBundle);

                startActivity(miIntent);
                break;
        }
    }
}