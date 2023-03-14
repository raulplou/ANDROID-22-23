package com.example.trabajofinal_glovo.lst_index.presenter;

import com.example.trabajofinal_glovo.entities.Index;
import com.example.trabajofinal_glovo.lst_index.LstIndexContract;
import com.example.trabajofinal_glovo.lst_index.model.LstIndexModel;

import java.util.ArrayList;

public class LstIndexPresenter implements LstIndexContract.Presenter {
    private LstIndexModel lstIndexModel;
    private LstIndexContract.View view;

    public LstIndexPresenter(LstIndexContract.View view){
        this.view = view;
        this.lstIndexModel = new LstIndexModel();
    }

    @Override
    public void lstIndex(Index index) {
        lstIndexModel.lstIndexWS(null, new LstIndexContract.Model.OnLstIndexListener() {
            @Override
            public void onSuccess(ArrayList<Index> lstIndex) {
                if (lstIndex != null && lstIndex.size()>0){
                    view.successLstIndex(lstIndex);
                }else{
                    view.failureLstIndex("Error en la lista de datos. ");
                }
            }

            @Override
            public void onFailure(String error) {
                view.failureLstIndex(error);
            }
        });
    }
}
