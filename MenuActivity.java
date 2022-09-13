package com.app.androiddialog;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.PopupMenu;

import android.app.AlertDialog;
import android.os.Bundle;
import android.util.Log;
import android.view.ContextMenu;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class MenuActivity extends AppCompatActivity {

    Button btnContext, btnPopup;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        btnContext = findViewById(R.id.btn_context);
        btnPopup = findViewById(R.id.btn_popup);

        btnContext.setOnClickListener(view -> {
            registerForContextMenu(view);
        });

        btnPopup.setOnClickListener(view -> {

            PopupMenu popupMenu = new PopupMenu(this, view);
            getMenuInflater().inflate(R.menu.my_menu, popupMenu.getMenu());
            popupMenu.show();

            popupMenu.setOnMenuItemClickListener(item -> {

                switch (item.getItemId()){

                    case R.id.action_search:
                        Toast.makeText(this, "Search Item Selected", Toast.LENGTH_SHORT).show();
                        break;
                    case R.id.action_setting:
                        Toast.makeText(this, "Settings Item Selected", Toast.LENGTH_SHORT).show();
                        break;
                    case R.id.action_add:
                        Toast.makeText(this, "Add Item Selected", Toast.LENGTH_SHORT).show();
                        break;
                    case R.id.action_logout:
                        Toast.makeText(this, "Logout Item Selected", Toast.LENGTH_SHORT).show();
                        showLogoutDialog();
                        break;

                }

                return false;

            });


        });

    }



    @Override
    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo) {
        super.onCreateContextMenu(menu, v, menuInfo);
        getMenuInflater().inflate(R.menu.my_menu, menu);
    }

    @Override
    public boolean onContextItemSelected(@NonNull MenuItem item) {

        switch (item.getItemId()){

            case R.id.action_search:
                Toast.makeText(this, "Search Item Selected", Toast.LENGTH_SHORT).show();
                break;
            case R.id.action_setting:
                Toast.makeText(this, "Settings Item Selected", Toast.LENGTH_SHORT).show();
                break;
            case R.id.action_add:
                Toast.makeText(this, "Add Item Selected", Toast.LENGTH_SHORT).show();
                break;
            case R.id.action_logout:
                Toast.makeText(this, "Logout Item Selected", Toast.LENGTH_SHORT).show();
                showLogoutDialog();
                break;

        }

        return super.onContextItemSelected(item);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.my_menu, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {

        switch (item.getItemId()){

            case R.id.action_search:
                Toast.makeText(this, "Search Item Selected", Toast.LENGTH_SHORT).show();
                break;
            case R.id.action_setting:
                Toast.makeText(this, "Settings Item Selected", Toast.LENGTH_SHORT).show();
                break;
            case R.id.action_add:

                String myDate = "23-11-2011";
//creates a formatter that parses the date in the given format
                SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
                SimpleDateFormat odf = new SimpleDateFormat("dd/MM/yyyy");

                Date date = null;
                try {
                    date = sdf.parse(myDate);
                } catch (ParseException e) {
                    e.printStackTrace();
                }
                long timeInMillis = date.getTime();
                String mDate = odf.format(timeInMillis);


                Log.d("TIMER", "onOptionsItemSelected: "+timeInMillis+","+mDate);
                Toast.makeText(this, "Add Item Selected", Toast.LENGTH_SHORT).show();
                break;
            case R.id.action_logout:
                Toast.makeText(this, "Logout Item Selected", Toast.LENGTH_SHORT).show();
                showLogoutDialog();
                break;

        }

        return super.onOptionsItemSelected(item);
    }

    private void showLogoutDialog() {

        new AlertDialog.Builder(this)
                .setTitle("Alert")
                .setMessage("Are you sure you want to logout from this application")
                .setPositiveButton("Logout", (dialogInterface, i) -> {

                }).setNegativeButton("Cancel", (dialogInterface, i) -> {

        }).show();

    }
}