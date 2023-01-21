package com.example.componentesbasicos;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    Button btn1, btn2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn1 = (Button) findViewById(R.id.btnIngresar); //Con clase anónima
        btn2 = (Button) findViewById(R.id.btnCancelar); //Con implements

        btn2.setOnClickListener(this); //Le ponemos el escuchador al botón

        //CLASE ANÓNIMA -> BOTÓN DE INGRESAR
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(), "Desde la clase anónima", Toast.LENGTH_LONG).show();
            }
        });
    }

    //CON IMPLEMENTS -> BOTÓN DE CANCELAR
    @Override
    public void onClick(View view) {
        Toast.makeText(getApplicationContext(), "Desde el onClick del implements", Toast.LENGTH_LONG).show();
    }

    //CON ONCLICK -> BOTÓN DE REGISTRARSE
    public void conOnclick(View view){
        Toast.makeText(getApplicationContext(), "Desde el onClick del método", Toast.LENGTH_LONG).show();
    }

    /*SE PODRÍA REUTILIZAR EL MÉTODO onClick() PARA EL BOTÓN DE REGISTRARSE
    Y SE HARÍA UN SWITCH PARA VALIDAR Y COMPROBAR SI ES UN BOTÓN U OTRO*/

    /*@Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.btnCancelar:
                Toast.makeText(getApplicationContext(), "Desde el onClick del implements", Toast.LENGTH_LONG).show();
                break;
            case R.id.btnRegistrarse:
                Toast.makeText(getApplicationContext(), "Desde el onClick del método", Toast.LENGTH_LONG).show();
                break;
        }
    }*/

}