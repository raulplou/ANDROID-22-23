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

public class RestaurantesFiltrados extends AppCompatActivity implements LstIndexContract.View{

    ArrayList<Restaurantes> listaFiltrados;
    RecyclerView recyclerFiltrados;
    LstIndexPresenter lstIndexPresenter;
    String filtro;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.restaurantes_filtrados);

        initComponents();
        initPresenter();
        initData();
    }

    public void initComponents(){
        listaFiltrados = new ArrayList<>();
        recyclerFiltrados = (RecyclerView) findViewById(R.id.recyclerFiltro);
    }

    public void initPresenter(){
        lstIndexPresenter = new LstIndexPresenter(this);
    }

    public void initData(){
        lstIndexPresenter.lstIndex(null);
    }

    @Override
    public void successLstIndex(ArrayList<Index> lstIndex) {
        Bundle filtroCategoriaBundle = this.getIntent().getExtras();
        if(filtroCategoriaBundle != null){
            filtro = filtroCategoriaBundle.getString("Categoria");

            if (filtro.equals("Comida italiana")){
                listaFiltrados = lstIndex.get(0).getByCategoria();

                Toast.makeText(this, "Comida italiana", Toast.LENGTH_SHORT).show();
            }
        }



        recyclerFiltrados.setLayoutManager(new LinearLayoutManager(this));

        AdaptadorRestaurantes adapter = new AdaptadorRestaurantes(listaFiltrados);
        recyclerFiltrados.setAdapter(adapter);
    }

    @Override
    public void failureLstIndex(String error) {
        Toast.makeText(this, error, Toast.LENGTH_SHORT).show();
    }
}