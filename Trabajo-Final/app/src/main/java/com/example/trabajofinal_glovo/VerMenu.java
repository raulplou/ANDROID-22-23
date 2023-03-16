package com.example.trabajofinal_glovo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.example.trabajofinal_glovo.entities.Index;
import com.example.trabajofinal_glovo.lst_index.LstIndexContract;
import com.example.trabajofinal_glovo.lst_index.presenter.LstIndexPresenter;

import java.util.ArrayList;

public class VerMenu extends AppCompatActivity implements LstIndexContract.View{

    TextView txtMenu;
    Button btnCompra;
    LstIndexPresenter lstIndexPresenter;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.ver_menu);

        initComponents();
        initPresenter();
        initData();

        btnCompra.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent screenChanger = new Intent(getBaseContext(),
                        Compra.class
                );
                startActivity(screenChanger);
            }
        });

    }

    public void initComponents() {
        txtMenu = (TextView) findViewById(R.id.txtMenu);
        btnCompra = (Button) findViewById(R.id.btnCompra);
    }

    public void initPresenter() {
        lstIndexPresenter = new LstIndexPresenter(this);
    }

    public void initData() {
        lstIndexPresenter.lstIndex(null);
    }

    @Override
    public void successLstIndex(ArrayList<Index> lstIndex) {
        txtMenu.setText(lstIndex.get(0).getMenu().get(0).getMenu());
    }

    @Override
    public void failureLstIndex(String error) {

    }
}