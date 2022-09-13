package com.app.retrofitandroid.api;

import com.app.retrofitandroid.api.callback.CallbackResponse;
import com.app.retrofitandroid.model.Country;
import com.app.retrofitandroid.model.State;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Headers;
import retrofit2.http.Path;

public interface ApiService {

    @GET("users?page=2")
    Call<CallbackResponse> getUserList();

    @Headers({
            "Accept: application/json",
            "Authorization: Bearer eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJ1c2VyIjp7InVzZXJfZW1haWwiOiJ4eXoxMjNAZ21haWwuY29tIiwiYXBpX3Rva2VuIjoiaEtUYzBDdGRWMjhWMWdEWkhac3kwLTF3ZGFwYXBYR19QY1BnR0tUSDFBZmhCWS1vVXBKOW9CMEg4czNmdFJqdEx0VSJ9LCJleHAiOjE2NDI3NjYwOTB9.IXfKdol2WHfrnLGvP_FNDzgYP4y9AR51W2OvUl7q8qc"
    })
    @GET("countries")
    Call<List<Country>> getCountryList();

    @Headers({
            "Accept: application/json",
            "Authorization: Bearer eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJ1c2VyIjp7InVzZXJfZW1haWwiOiJ4eXoxMjNAZ21haWwuY29tIiwiYXBpX3Rva2VuIjoiaEtUYzBDdGRWMjhWMWdEWkhac3kwLTF3ZGFwYXBYR19QY1BnR0tUSDFBZmhCWS1vVXBKOW9CMEg4czNmdFJqdEx0VSJ9LCJleHAiOjE2NDI3NjYwOTB9.IXfKdol2WHfrnLGvP_FNDzgYP4y9AR51W2OvUl7q8qc"
    })
    @GET("states/{country}")
    Call<List<State>> getStateList(@Path("country") String country);


}
