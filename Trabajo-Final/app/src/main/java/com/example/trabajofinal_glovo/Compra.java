package com.example.trabajofinal_glovo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Compra extends AppCompatActivity {

    Button btnConfirmar;
    EditText edtTxtProducto;
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.compra);

        initComponents();

        btnConfirmar.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                String producto = edtTxtProducto.getText().toString();
                Toast.makeText(Compra.this, "COMPRA CONFIRMADA de " + producto, Toast.LENGTH_SHORT).show();
                Intent screenChanger = new Intent(getBaseContext(),
                        InicioActivity.class
                );
                startActivity(screenChanger);
            }
        });
    }

    public void initComponents(){
        btnConfirmar = (Button) findViewById(R.id.btnConfirmar);
        edtTxtProducto = (EditText) findViewById(R.id.edtTxtProducto);
    }
}