package com.desafiolatam.sismoschile.network;

import com.desafiolatam.sismoschile.model.EarthMovement;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface MovementService {

    @GET("sismos")
    Call<List<EarthMovement>> infoSismos();
}
