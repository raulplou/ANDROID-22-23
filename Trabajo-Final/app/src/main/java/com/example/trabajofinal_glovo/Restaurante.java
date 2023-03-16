package com.example.trabajofinal_glovo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.example.trabajofinal_glovo.entities.Index;
import com.example.trabajofinal_glovo.lst_index.LstIndexContract;
import com.example.trabajofinal_glovo.lst_index.presenter.LstIndexPresenter;

import java.util.ArrayList;

public class Restaurante extends AppCompatActivity{

    Button ficha,menu;
    //LstIndexPresenter lstIndexPresenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.restaurante);

        initComponents();
        /*initPresenter();
        initData();*/

        menu.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent screenChanger = new Intent(getBaseContext(),
                        VerMenu.class
                );
                startActivity(screenChanger);
            }
        });

        ficha.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent screenChanger = new Intent(getBaseContext(),
                        FichaDescriptiva.class
                );
                startActivity(screenChanger);
            }
        });


    }

    public void initComponents(){
        ficha = (Button) findViewById(R.id.btnFicha);
        menu = (Button) findViewById(R.id.btnMenu);
    }

    /*public void initPresenter(){
        lstIndexPresenter = new LstIndexPresenter(this);
    }

    public void initData(){
        lstIndexPresenter.lstIndex(null);
    }*/

}