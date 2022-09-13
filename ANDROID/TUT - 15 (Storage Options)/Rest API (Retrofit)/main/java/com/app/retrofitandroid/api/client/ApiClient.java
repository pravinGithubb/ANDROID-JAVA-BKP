package com.app.retrofitandroid.api.client;

import com.app.retrofitandroid.api.ApiService;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class ApiClient {

    private static Retrofit retrofit;

    public static ApiService init()
    {
        if(retrofit==null){
            retrofit = new Retrofit.Builder()
                    .baseUrl("https://www.universal-tutorial.com/api/")
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();
        }

        ApiService service = retrofit.create(ApiService.class);
        return service;
    }

}
