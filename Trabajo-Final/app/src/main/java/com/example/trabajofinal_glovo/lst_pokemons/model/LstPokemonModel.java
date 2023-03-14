package com.example.trabajofinal_glovo.lst_pokemons.model;

import com.example.pokemon_api_01.entities.Pokemon;
import com.example.pokemon_api_01.entities.PokemonRespuesta;
import com.example.pokemon_api_01.lst_pokemons.LstPokemonContract;
import com.example.pokemon_api_01.utils.ApiClient;
import com.example.pokemon_api_01.utils.ApiInterface;

import java.util.ArrayList;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class LstPokemonModel implements LstPokemonContract.Model {
    @Override
    public void lstPokemonWS(Pokemon pokemon, OnLstPokemonListener onLstPokemonListener) {
        ApiInterface apiService = ApiClient.getClient().create(ApiInterface.class);
        Call<PokemonRespuesta> pokemonRespuestaCall = apiService.getPokemons(10,10);
        pokemonRespuestaCall.enqueue(new Callback<PokemonRespuesta>() {
            @Override
            public void onResponse(Call<PokemonRespuesta> call, Response<PokemonRespuesta> response) {
                PokemonRespuesta pokemonRespuesta = response.body();
                ArrayList<Pokemon> listaPokemon = pokemonRespuesta.getResults();
                onLstPokemonListener.onSuccess(listaPokemon);
            }

            @Override
            public void onFailure(Call<PokemonRespuesta> call, Throwable t) {
                onLstPokemonListener.onFailure("Error de Pokemons. ");
            }
        });
       /*
        onLstPokemonListener.onSuccess();
        onLstPokemonListener.onFailure();
        */

    }
}
