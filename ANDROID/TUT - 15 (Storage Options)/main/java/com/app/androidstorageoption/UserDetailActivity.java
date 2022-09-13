package com.app.androidstorageoption;

import androidx.appcompat.app.AppCompatActivity;
import androidx.room.Room;

import android.os.Bundle;
import android.widget.TextView;

import com.app.androidstorageoption.database.AppDatabase;
import com.app.androidstorageoption.entity.User;

public class UserDetailActivity extends AppCompatActivity {

    AppDatabase database;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_detail);

        database = Room.databaseBuilder(getApplicationContext(), AppDatabase.class, "tops.db")
                .addMigrations(AppDatabase.MIGRATION_1_3)
                .allowMainThreadQueries().build();

        int id = getIntent().getIntExtra("ID", -1);

        if(id!=-1)
        {
            readUserDetail(id);
        }

    }

    private void readUserDetail(int id) {

        User user = database.userDao().getUser(id);
        if(user!=null)
        {
            TextView tvResult = findViewById(R.id.tv_result);
            tvResult.setText(user.getId()+"\n"+user.getName());
        }
    }
}