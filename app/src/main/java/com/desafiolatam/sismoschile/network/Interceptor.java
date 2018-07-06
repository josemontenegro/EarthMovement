package com.desafiolatam.sismoschile.network;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class Interceptor {

    private static final String BASE_URL = "https://gael.cl/api/";

   public MovementService getBasic(){

       Retrofit interceptor = new Retrofit.Builder()
               .baseUrl(BASE_URL)
               .addConverterFactory(GsonConverterFactory.create())
               .build();

       return interceptor.create((MovementService.class));
   }

    }





