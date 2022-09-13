package com.app.androidstorageoption;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.room.Room;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Toast;

import com.app.androidstorageoption.database.AppDatabase;
import com.app.androidstorageoption.databinding.CustomDialogBinding;
import com.app.androidstorageoption.entity.User;
import com.app.androidstorageoption.databinding.ActivityUserBinding;

import java.util.List;

public class UserActivity extends AppCompatActivity {

    ActivityUserBinding binding;
    AppDatabase database;

    ArrayAdapter adapter;
    List<User> userList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityUserBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        database = Room.databaseBuilder(this, AppDatabase.class, "tops.db").addMigrations(AppDatabase.MIGRATION_1_3).allowMainThreadQueries().build();

        readRecord();

        binding.btnSave.setOnClickListener(view -> {

            String name = binding.etName.getText().toString().trim();
            String email = binding.etEmail.getText().toString().trim();
            String contact = binding.etContact.getText().toString().trim();

            insertRecord(name, email , contact);

        });

        binding.btnRead.setOnClickListener(view -> {

            readRecord();

        });

    }

    private void readRecord() {

        userList = database.userDao().getRecords();
        adapter = new ArrayAdapter(getApplicationContext(), android.R.layout.simple_list_item_1, userList);
        binding.listView.setAdapter(adapter);

        binding.listView.setOnItemClickListener((adapterView, view, i, l) -> {

            User user  = userList.get(i);

            Intent intent = new Intent(UserActivity.this,UserDetailActivity.class);
            intent.putExtra("ID", user.getId());

            startActivity(intent);


        });

        binding.listView.setOnItemLongClickListener((adapterView, view, i, l) -> {
            User user = userList.get(i);

            showCustomDialog(user);

            return true;
        });

    }

    private void showCustomDialog(User user) {

        CustomDialogBinding binding = CustomDialogBinding.inflate(getLayoutInflater());

        AlertDialog.Builder builder= new AlertDialog.Builder(UserActivity.this);
        builder.setView(binding.getRoot());

        binding.etName.setText(user.getName());
        binding.etEmail.setText(user.getEmail());
        binding.etContact.setText(user.getContact());

        AlertDialog dialog = builder.create();
        dialog.show();

        binding.btnDelete.setOnClickListener(view -> {
            database.userDao().deleteRecord(user);
            Toast.makeText(this, "Record Delete", Toast.LENGTH_SHORT).show();

            readRecord();
            dialog.dismiss();
        });

        binding.btnUpdate.setOnClickListener(view -> {

            String name = binding.etName.getText().toString().trim();
            String email = binding.etEmail.getText().toString().trim();
            String contact = binding.etContact.getText().toString().trim();

            User mUser = new User(user.getId(), name, email, contact);

            database.userDao().updateRecord(mUser);
            Toast.makeText(this, "Record updated", Toast.LENGTH_SHORT).show();

            readRecord();
            dialog.dismiss();


        });
    }

    private void insertRecord(String name, String email, String contact) {

        User user = new User(name, email , contact);

        database.userDao().insertRecord(user);
        Toast.makeText(this, "Record Saved", Toast.LENGTH_SHORT).show();
        resetFields();
        readRecord();
    }

    private void resetFields() {
        binding.etName.setText("");
        binding.etEmail.setText("");
        binding.etContact.setText("");
    }
}