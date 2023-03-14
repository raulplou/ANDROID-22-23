package com.example.trabajofinal_glovo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

import com.example.trabajofinal_glovo.entities.Index;
import com.example.trabajofinal_glovo.lst_index.LstIndexContract;
import com.example.trabajofinal_glovo.lst_index.presenter.LstIndexPresenter;

import java.util.ArrayList;

public class FichaDescriptiva extends AppCompatActivity implements LstIndexContract.View {

    TextView txtNombre,txtCategoria,txtDescripcion,txtMenu;
    LstIndexPresenter lstIndexPresenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.ficha_descriptiva);

        initComponents();
        initPresenter();
        initData();
    }

    public void initComponents(){
        txtNombre = (TextView) findViewById(R.id.txtNombre);
        txtCategoria = (TextView) findViewById(R.id.txtCategoria);
        txtDescripcion = (TextView) findViewById(R.id.txtDescripcion);
        txtMenu = (TextView) findViewById(R.id.txtMenu);
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
            txtNombre.setText(index.getRestaurantes().get(0).getNombreRestaurante());
            txtCategoria.setText(index.getRestaurantes().get(0).getCategoria());
            txtDescripcion.setText(index.getRestaurantes().get(0).getDescripcion());
            txtMenu.setText(index.getRestaurantes().get(0).getMenu());

        }
    }

    @Override
    public void failureLstIndex(String error) {
        Toast.makeText(this, error, Toast.LENGTH_SHORT).show();
    }
}