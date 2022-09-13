package com.app.androidstorageoption;

import androidx.appcompat.app.AppCompatActivity;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.widget.Toast;

import com.app.androidstorageoption.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        readData();

        binding.btnSave.setOnClickListener(view -> {

            String message = binding.etMessage.getText().toString().trim();

            saveData(message);

        });

        binding.btnRead.setOnClickListener(view -> {

          readData();

        });

    }


    void readData()
    {
        SharedPreferences sharedPreferences = getSharedPreferences(Const.PREF_NAME, MODE_PRIVATE);
        String msg = sharedPreferences.getString(Const.KEY_MSG, "NO DATA");

        binding.tvResult.setText(msg);
    }

    private void saveData(String message) {

        SharedPreferences sharedPreferences = getSharedPreferences(Const.PREF_NAME, MODE_PRIVATE);
        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.putString(Const.KEY_MSG, message);

        /*editor.putInt("ID", 1243);
        editor.putBoolean()*/
        editor.commit();

        Toast.makeText(this, "Success", Toast.LENGTH_SHORT).show();
    }
}