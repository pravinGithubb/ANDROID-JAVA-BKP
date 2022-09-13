package com.app.androidstorageoption.dao;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

import com.app.androidstorageoption.entity.User;

import java.util.List;

@Dao
public interface UserDao {

    @Insert
    void insertRecord(User user);

    @Delete
    void deleteRecord(User user);

    @Query("select * from user_table")
    List<User> getRecords();

    @Update
    void updateRecord(User user);

    @Query("select * from user_table where id = :uid")
    User getUser(int uid);

}
