package com.app.apiexample;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.ArrayAdapter;
import android.widget.Toast;

import com.app.apiexample.model.User;
import com.google.gson.Gson;

import org.jetbrains.annotations.NotNull;
import com.app.apiexample.databinding.ActivityMainBinding;
import java.io.IOException;
import java.util.ArrayList;

import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

public class MainActivity extends AppCompatActivity {

    ActivityMainBinding binding;
    String url = "https://reqres.in/api/users?page=2";
    private ArrayList<User> userList = new ArrayList<User>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        callApi();

    }

    private void callApi() {

        OkHttpClient client = new OkHttpClient();


        Request request = new Request.Builder()
                .url(url)
                .build();

        client.newCall(request).enqueue(new Callback() {
            @Override
            public void onFailure(@NotNull Call call, @NotNull IOException e) {
                // on failure
                Log.d("FAILURE", "onFailure: "+e.getMessage());
            }

            @Override
            public void onResponse(@NotNull Call call, @NotNull Response response) throws IOException {

                if(response.isSuccessful())
                {
                    String body = response.body().string();

                    Gson gson = new Gson();
                    CallbackResponse res = gson.fromJson(body, CallbackResponse.class);

                    userList = (ArrayList<User>) res.getUserList();

                    if(userList.size()> 0)
                    {
                        runOnUiThread(() -> {
                            if(userList.size()>0)
                            {
                                ArrayAdapter adapter = new ArrayAdapter(getApplicationContext(), android.R.layout.simple_list_item_1, userList);
                                binding.listItem.setAdapter(adapter);
                            }

                            Toast.makeText(MainActivity.this, "", Toast.LENGTH_SHORT).show();

                        });
                    }

                    /*try {

                        JSONObject object = new JSONObject(res);        // convert json string into json object

                        int page = object.getInt("page");

                        JSONArray array = object.getJSONArray("data");

                        if(array.length()>0)
                        {
                            for(int i =0; i<array.length();  i++)
                            {
                                JSONObject jsonObject = array.getJSONObject(i);

                                User user = new User();
                                user.setId(jsonObject.getInt("id"));
                                user.setEmail(jsonObject.getString("email"));
                                user.setfName(jsonObject.getString("first_name"));
                                user.setlName(jsonObject.getString("last_name"));
                                user.setImageUrl(jsonObject.getString("avatar"));

                                userList.add(user);


                            }

                            runOnUiThread(() -> {
                                if(userList.size()>0)
                                {
                                    ArrayAdapter adapter = new ArrayAdapter(getApplicationContext(), android.R.layout.simple_list_item_1, userList);
                                    binding.listItem.setAdapter(adapter);
                                }

                                Toast.makeText(MainActivity.this, "", Toast.LENGTH_SHORT).show();

                            });



                        }


                    } catch (JSONException e) {
                        e.printStackTrace();
                    }*/

                }



            }
        });

    }
}