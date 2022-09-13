package com.app.retrofitandroid;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Toast;

import com.app.retrofitandroid.api.client.ApiClient;
import com.app.retrofitandroid.databinding.ActivityPlaceBinding;
import com.app.retrofitandroid.model.Country;
import com.app.retrofitandroid.model.State;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class PlaceActivity extends AppCompatActivity {

    ActivityPlaceBinding binding;
    ArrayAdapter countryAdapter, stateAdapter;

    List<Country> countryList = new ArrayList<>();
    List<State> stateList = new ArrayList<>();
    private String country="", state = "";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityPlaceBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        loadCountryList();

    }

    private void loadCountryList() {

        Call<List<Country>> call = ApiClient.init().getCountryList();
        call.enqueue(new Callback<List<Country>>() {
            @Override
            public void onResponse(Call<List<Country>> call, Response<List<Country>> response) {

                if(response.isSuccessful()){
                    countryList.clear();
                    countryList = response.body();
                    updateCoutry(countryList);
                }

            }

            @Override
            public void onFailure(Call<List<Country>> call, Throwable t) {
                Log.d("TAG", "onFailure: ");
            }
        });
    }

    private void updateCoutry(List<Country> countryList) {
        countryAdapter = new ArrayAdapter(getApplicationContext(), android.R.layout.simple_list_item_1, countryList);
        binding.spinnerCountry.setAdapter(countryAdapter);

        binding.spinnerCountry.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                country = countryList.get(i).getName();

                loadStateList(country);

            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });

    }

    private void updateState(List<State> stateList) {
        stateAdapter = new ArrayAdapter(getApplicationContext(), android.R.layout.simple_list_item_1, stateList);
        binding.spinnerState.setAdapter(stateAdapter);

        binding.spinnerState.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                state = stateList.get(i).getStateName();

            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });

    }

    private void loadStateList(String country) {

        Call<List<State>> call = ApiClient.init().getStateList(country);

        call.enqueue(new Callback<List<State>>() {
            @Override
            public void onResponse(Call<List<State>> call, Response<List<State>> response) {

                if(response.isSuccessful()){
                    stateList.clear();
                    stateList = response.body();
                    updateState(stateList);
                }

            }

            @Override
            public void onFailure(Call<List<State>> call, Throwable t) {
                Log.d("TAG", "onFailure: ");
            }
        });

    }

}