package com.example.trabajofinal_glovo.lst_index.model;



import com.example.trabajofinal_glovo.entities.Index;
import com.example.trabajofinal_glovo.entities.Restaurantes;
import com.example.trabajofinal_glovo.lst_index.LstIndexContract;
import com.example.trabajofinal_glovo.utils.ApiClient;
import com.example.trabajofinal_glovo.utils.ApiInterface;

import java.util.ArrayList;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class LstIndexModel implements LstIndexContract.Model {
    @Override
    public void lstIndexWS(Index index, OnLstIndexListener onLstIndexListener) {
        ApiInterface apiService = ApiClient.getClient().create(ApiInterface.class);
        Call<Index> indexRespuestaCall = apiService.getApi();
        indexRespuestaCall.enqueue(new Callback<Index>() {
            @Override
            public void onResponse(Call<Index> call, Response<Index> response) {
                Index indexRespuesta = response.body();
                ArrayList<Index> listaIndex = new ArrayList<Index>();
                listaIndex.add(indexRespuesta);
                onLstIndexListener.onSuccess(listaIndex);
            }

            @Override
            public void onFailure(Call<Index> call, Throwable t) {
                onLstIndexListener.onFailure(t.getMessage());
            }
        });
    }
}
