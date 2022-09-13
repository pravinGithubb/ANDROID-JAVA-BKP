package com.app.androidstorageoption.database;

import androidx.room.Database;
import androidx.room.RoomDatabase;
import androidx.room.migration.Migration;
import androidx.sqlite.db.SupportSQLiteDatabase;

import com.app.androidstorageoption.dao.UserDao;
import com.app.androidstorageoption.entity.User;

@Database(entities = {User.class}, version = 3)
public abstract class AppDatabase extends RoomDatabase {

    public abstract UserDao userDao();

    public static final Migration MIGRATION_1_3 = new Migration(1,3) {
        @Override
        public void migrate(SupportSQLiteDatabase database) {
            database.execSQL("ALTER TABLE user_table"
                    + " ADD COLUMN address TEXT");
        }
    };

}
