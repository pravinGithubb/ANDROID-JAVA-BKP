package com.app.firstapplication;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class FirstActivity extends AppCompatActivity {

    Button btnSubmit;
    EditText etName, etEmail;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first);

        btnSubmit = findViewById(R.id.btn_submit);
        etName = findViewById(R.id.et_name);
        etEmail = findViewById(R.id.et_email);

        // click event of button
        btnSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String name = etName.getText().toString().trim();
                String email = etEmail.getText().toString().trim();

                //Toast.makeText(FirstActivity.this, name+"\n"+email, Toast.LENGTH_SHORT).show();

                User user = new User(111, name, email);

                // start new Activity
                Intent intent = new Intent(FirstActivity.this, HomeActivity.class);
             /*   intent.putExtra("ID", 123);
                intent.putExtra("NAME", name);
                intent.putExtra("EMAIL", email);*/
                intent.putExtra("USER", user);
                startActivity(intent);

                // statement
                //Toast.makeText(getApplicationContext(), "Button Clicked", Toast.LENGTH_SHORT).show();
                //Toast.makeText(FirstActivity.this, "Button Clicked", Toast.LENGTH_SHORT).show();
            }
        });

        /*btnSubmit.setOnClickListener(view -> {

        });*/

    }
}
