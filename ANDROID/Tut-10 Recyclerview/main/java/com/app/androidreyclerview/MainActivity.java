package com.app.androidreyclerview;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.app.androidreyclerview.adapter.CustomRecyclerAdapter;
import com.app.androidreyclerview.databinding.ActivityMainBinding;
import com.app.androidreyclerview.databinding.CustomLayoutBinding;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ActivityMainBinding binding;
    ArrayList<Item> itemList;
    CustomRecyclerAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());


        prepareDataList();

        // Pass data to adapter class using constructor
        adapter = new CustomRecyclerAdapter(this, itemList);
        adapter.setOnItemClickListener(new CustomRecyclerAdapter.OnItemClickListener() {
            @Override
            public void onItemClicked(Item item, int pos) {
               // showRemoveDialog(item);
            }

            @Override
            public void onRemoveMenuItemClicked(Item item) {
                showRemoveDialog(item);
            }

            @Override
            public void onEditMenuItemClicked(Item item) {
                showUpdateDialog(item);
            }

            @Override
            public void onCancelMenuItemClicked() {
                Toast.makeText(MainActivity.this, "Cancel Button Clicked", Toast.LENGTH_SHORT).show();
            }
        });
        // LinearLayoutManager  (vertical or horizontal)
        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        // LinearLayoutManager layoutManager = new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false);

        // GridLayoutManager
        //GridLayoutManager layoutManager = new GridLayoutManager(this, 2);

        //StaggeredGridLayoutManager layoutManager = new StaggeredGridLayoutManager(2, StaggeredGridLayoutManager.VERTICAL);

        binding.recyclerView.setLayoutManager(layoutManager);
        binding.recyclerView.setAdapter(adapter);

    }

    private void showUpdateDialog(Item item) {

        AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this);
        CustomLayoutBinding binding = CustomLayoutBinding.inflate(getLayoutInflater());
        builder.setView(binding.getRoot());

        binding.etTitle.setText(item.getTitle());
        binding.etDesc.setText(item.getDesc());

        AlertDialog dialog = builder.create();
        dialog.show();

        binding.btnUpdate.setOnClickListener(view -> {
            //TODO implement logic to insert new object in itemlist

            String title = binding.etTitle.getText().toString().trim();
            String desc = binding.etDesc.getText().toString().trim();

            Item updatedItem = new Item(item.getId(), title, desc, item.getRating(), item.getImageId() );
            adapter.updateItem(updatedItem);

        });

        binding.btnCancel.setOnClickListener(view -> {
            dialog.dismiss();
        });



    }

    private void showRemoveDialog(Item item) {

        new AlertDialog.Builder(MainActivity.this)
                .setTitle("Alert")
                .setMessage("Are you sure you want to remove this item?")
                .setPositiveButton("Remove", (dialogInterface, i) -> {
                    adapter.removeItem(item);
                }).setNegativeButton("Cancel", (dialogInterface, i) -> {

        }).show();

    }

    private void prepareDataList() {

        itemList = new ArrayList<>();
        itemList.add(new Item(1, "Whatsapp", "whatsapp", 4.5f, R.drawable.whatsapp));
        itemList.add(new Item(2, "Facebook", "facebookfdfdff", 4.0f, R.drawable.facebook));
        itemList.add(new Item(3, "Instagram", "instagram ", 3.5f, R.drawable.instagram));
        itemList.add(new Item(4, "Mx Player", "mx-player", 5.0f, R.drawable.mx_player));
        itemList.add(new Item(5, "twitter", "twitter", 4.5f, R.drawable.twitter));
        itemList.add(new Item(6, "Whatsapp", "whatsapp", 4.5f, R.drawable.whatsapp));
        itemList.add(new Item(7, "Facebook", "facebook", 4.0f, R.drawable.facebook));
        itemList.add(new Item(8, "Instagram", "instagram", 3.5f, R.drawable.instagram));
        itemList.add(new Item(9, "Mx Player", "mx-player", 5.0f, R.drawable.mx_player));
        itemList.add(new Item(10, "twitter", "twitter", 4.5f, R.drawable.twitter));

    }
}