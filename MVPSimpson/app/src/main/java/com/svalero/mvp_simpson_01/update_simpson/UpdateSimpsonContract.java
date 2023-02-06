package com.svalero.mvp_simpson_01.update_simpson;

import com.svalero.mvp_simpson_01.lst_simpson.LstSimpsonContract;
import com.svalero.mvp_simpson_01.lst_simpson.model.pojo.Simpson;

import java.util.ArrayList;

public interface UpdateSimpsonContract {

    public interface View{
        void successUpdateSimpson(ArrayList<Simpson> lstSimpson);
        void failureUpdateSimpson(String error);
    }

    public interface Model{
        void UpdateSimpson(Simpson simpson);
    }

    public interface Presenter{
        interface onUpdateSimpsonListener{
            void onSuccess(ArrayList<Simpson> lstSimpson);
            void onFailure(String error);
        }
        void updateSimpsonWS(Simpson simpson,
                             LstSimpsonContract.Model.OnLstSimpsonListener onLstSimpsonListener);
    }
}
