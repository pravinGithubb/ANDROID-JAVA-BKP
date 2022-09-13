package com.app.firstapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

public class HomeActivity extends AppCompatActivity {

    String TAG = "MainActivity";

    String name, email;
    int id;
    TextView tvResult;
    User user;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        tvResult = findViewById(R.id.tv_result);

        //name = getIntent().getStringExtra("NAME");
        //email = getIntent().getStringExtra("EMAIL");
        //id = getIntent().getIntExtra("ID", -1);

        user = getIntent().getParcelableExtra("USER");

        if(user!=null){
            tvResult.setText(user.getId()+"\n"+user.getName()+"\n"+user.getEmail());
        }


        //Log.d(TAG, "onCreate: called");

    }


    @Override
    protected void onStart() {
        super.onStart();

        Log.d(TAG, "onStart: Called");
        
    }

    @Override
    protected void onResume() {
        super.onResume();

        Log.d(TAG, "onResume: Called");
    }

    @Override
    protected void onRestart() {
        super.onRestart();

        Log.d(TAG, "onRestart: Called");
        
    }

    @Override
    protected void onStop() {
        super.onStop();

        Log.d(TAG, "onStop: Called");
    }

    @Override
    protected void onPause() {
        super.onPause();

        Log.d(TAG, "onPause: Called");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();

        Log.d(TAG, "onDestroy: Called");
    }
}