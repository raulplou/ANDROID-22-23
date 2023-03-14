package com.example.trabajofinal_glovo.lst_index;

import com.example.trabajofinal_glovo.entities.Index;

import java.util.ArrayList;

public interface LstIndexContract {
    public interface View {
        void successLstIndex(ArrayList<Index> lstIndex);
        void failureLstIndex(String error);
    }
    public interface Presenter{
        // CASO DE USO -> DISTINTOS APARTADOS DEL TRABAJO
        void lstIndex(Index index);
    }
    public interface Model{
        interface OnLstIndexListener{
            void onSuccess(ArrayList<Index> lstIndex);
            void onFailure(String error);
        }
        void lstIndexWS(Index index,
                          OnLstIndexListener onLstIndexListener);
    }
}
