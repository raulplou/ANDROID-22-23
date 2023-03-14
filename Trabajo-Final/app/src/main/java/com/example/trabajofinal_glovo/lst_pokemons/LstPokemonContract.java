package com.example.trabajofinal_glovo.lst_pokemons;

import com.example.trabajofinal_glovo.entities.Index;

import java.util.ArrayList;

public interface LstPokemonContract {
    public interface View {
        void successLstPokemon(ArrayList<Index> lstIndex);
        void failureLstPokemon(String error);

    }
    public interface Presenter{
        // CASO DE USO
        void lstPokemon(Index index);
    }
    public interface Model{
        interface OnLstPokemonListener{
            void onSuccess(ArrayList<Index> lstIndex);
            void onFailure(String error);
        }
        void lstPokemonWS(Index index,
                          OnLstPokemonListener onLstPokemonListener);
    }
}
