package com.desafiolatam.sismoschile.network;

import android.os.AsyncTask;
import android.util.Log;

import com.desafiolatam.sismoschile.model.EarthMovement;

import java.io.IOException;
import java.util.List;

import retrofit2.Call;
import retrofit2.Response;

public class GetInfoMovement extends AsyncTask <Void,Void,String>{


    @Override
    protected String doInBackground(Void... voids) {

        MovementService sismoService = new Interceptor().getBasic();
        Call<List<EarthMovement>> sismo = sismoService.infoSismos();
        try{
            Response<List<EarthMovement>> response = sismo.execute();
            Log.d("RESPONSE_CODE", String.valueOf(response.code()));
            if(200==response.code() && response.isSuccessful()){
                return response.body().get(0).resultInfo();
            } else{
                return null;
            }
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }

    }

}
