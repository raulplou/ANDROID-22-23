package com.example.trabajofinal_glovo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.example.trabajofinal_glovo.entities.Index;
import com.example.trabajofinal_glovo.lst_index.LstIndexContract;
import com.example.trabajofinal_glovo.lst_index.presenter.LstIndexPresenter;

import java.util.ArrayList;

public class BusquedaActivity extends AppCompatActivity implements LstIndexContract.View {

    Button buscar;
    EditText filtroCategoria;
    LstIndexPresenter lstIndexPresenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.filtros_busqueda);

        initComponents();
        initPresenter();
        initData();

        buscar.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent screenChanger = new Intent(getBaseContext(),
                        RestaurantesFiltrados.class
                );
                Bundle categoryBundle = new Bundle();
                categoryBundle.putString("Categoria", filtroCategoria.getText().toString());
                screenChanger.putExtras(categoryBundle);

                startActivity(screenChanger);
            }
        });

    }

    public void initComponents(){
        buscar = (Button) findViewById(R.id.btnBuscar);
        filtroCategoria = (EditText) findViewById(R.id.edtTxtFilCat);
    }

    public void initPresenter(){
        lstIndexPresenter = new LstIndexPresenter(this);
    }

    public void initData(){
        lstIndexPresenter.lstIndex(null);
    }

    @Override
    public void successLstIndex(ArrayList<Index> lstIndex) {
        for (Index index: lstIndex) {
            filtroCategoria.setText(index.getRestaurantes().get(0).getCategoria());
        }
    }

    @Override
    public void failureLstIndex(String error) {
        Toast.makeText(this, error, Toast.LENGTH_SHORT).show();
    }
}