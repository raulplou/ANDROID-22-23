package com.example.trabajofinal_glovo;

import android.os.Bundle;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.trabajofinal_glovo.entities.Index;
import com.example.trabajofinal_glovo.entities.Restaurantes;
import com.example.trabajofinal_glovo.lst_index.LstIndexContract;
import com.example.trabajofinal_glovo.lst_index.presenter.LstIndexPresenter;

import java.util.ArrayList;

public class TopPuntuacion extends AppCompatActivity implements LstIndexContract.View{

    ArrayList<Restaurantes> listaRestaurantes;
    RecyclerView recyclerRestaurantes;
    LstIndexPresenter lstIndexPresenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.top_puntuacion);

        initComponents();
        initPresenter();
        initData();

    }

    public void initComponents(){
        listaRestaurantes = new ArrayList<>();
        recyclerRestaurantes = (RecyclerView) findViewById(R.id.recyclerTopPuntuacion);
    }

    public void initPresenter(){
        lstIndexPresenter = new LstIndexPresenter(this);
    }

    public void initData(){
        lstIndexPresenter.lstIndex(null);
    }

    @Override
    public void successLstIndex(ArrayList<Index> lstIndex) {
        listaRestaurantes = lstIndex.get(0).getTopDiez();

        recyclerRestaurantes.setLayoutManager(new LinearLayoutManager(this));

        AdaptadorRestaurantes adapter = new AdaptadorRestaurantes(listaRestaurantes);
        recyclerRestaurantes.setAdapter(adapter);
    }

    @Override
    public void failureLstIndex(String error) {
        Toast.makeText(this, error, Toast.LENGTH_SHORT).show();
    }
}
