package com.example.mymemo;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.OnConflictStrategy;
import androidx.room.Query;
import androidx.room.Update;
import java.util.List;

@Dao
public interface UserDao {
    @Insert
    void insertUser(List<User> ListUsers);

    @Update
    void updateUser(User user);

    @Delete
    void deleteUser(User user);

    @Query("Select * from User where user_id = :user_id")
    User getUserById(int user_id);
}
