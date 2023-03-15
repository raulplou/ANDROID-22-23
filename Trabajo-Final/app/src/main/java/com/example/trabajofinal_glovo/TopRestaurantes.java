package com.example.trabajofinal_glovo;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.Button;
import android.widget.Toast;

import com.example.trabajofinal_glovo.entities.Index;
import com.example.trabajofinal_glovo.entities.Restaurantes;
import com.example.trabajofinal_glovo.lst_index.LstIndexContract;
import com.example.trabajofinal_glovo.lst_index.presenter.LstIndexPresenter;

import java.util.ArrayList;

public class TopRestaurantes extends AppCompatActivity implements LstIndexContract.View{

    ArrayList<Restaurantes> listaRestaurantes;
    RecyclerView recyclerRestaurantes;
    LstIndexPresenter lstIndexPresenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.top_restaurantes);

        initComponents();
        initPresenter();
        initData();

    }

    public void initComponents(){
        listaRestaurantes = new ArrayList<>();
        recyclerRestaurantes = (RecyclerView) findViewById(R.id.recyclerTop);
    }

    public void initPresenter(){
        lstIndexPresenter = new LstIndexPresenter(this);
    }

    public void initData(){
        lstIndexPresenter.lstIndex(null);
    }

    @Override
    public void successLstIndex(ArrayList<Index> lstIndex) {
        for (int i = 0; i < 10; i++) {//Restaurantes restaurantes: lstIndex.get(0).getRestaurantes()
            listaRestaurantes.add(lstIndex.get(0).getRestaurantes().get(i));
            //listaRestaurantes.add(new Restaurantes("La Mafia","Comida italiana"));
            //listaRestaurantes.add(new Restaurantes("El Churrasco","Comida aragonesa"));
            //listaRestaurantes.add(new Restaurantes("Ché","Comida argentina"));
        }
        recyclerRestaurantes.setLayoutManager(new LinearLayoutManager(this));

        AdaptadorRestaurantes adapter = new AdaptadorRestaurantes(listaRestaurantes);
        recyclerRestaurantes.setAdapter(adapter);
    }

    @Override
    public void failureLstIndex(String error) {
        Toast.makeText(this, error, Toast.LENGTH_SHORT).show();

    }
}