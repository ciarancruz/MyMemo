package com.example.mymemo;

import androidx.annotation.NonNull;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity(tableName = "User")
public class User {
    @PrimaryKey
    @NonNull
    int user_id;

    @NonNull
    String f_name;

    @NonNull
    String l_name;

    @NonNull
    String username;

    @NonNull
    String user_email;

    @NonNull
    String user_password;

    public User(int user_id, @NonNull String f_name, @NonNull String l_name, @NonNull String username, @NonNull String user_email, @NonNull String user_password) {
        this.user_id = user_id;
        this.f_name = f_name;
        this.l_name = l_name;
        this.username = username;
        this.user_email = user_email;
        this.user_password = user_password;
    }

    public int getUser_id() {
        return user_id;
    }

    public void setUser_id(int user_id) {
        this.user_id = user_id;
    }

    @NonNull
    public String getF_name() {
        return f_name;
    }

    public void setF_name(@NonNull String f_name) {
        this.f_name = f_name;
    }

    @NonNull
    public String getL_name() {
        return l_name;
    }

    public void setL_name(@NonNull String l_name) {
        this.l_name = l_name;
    }

    @NonNull
    public String getUsername() {
        return username;
    }

    public void setUsername(@NonNull String username) {
        this.username = username;
    }

    @NonNull
    public String getUser_email() {
        return user_email;
    }

    public void setUser_email(@NonNull String user_email) {
        this.user_email = user_email;
    }

    @NonNull
    public String getUser_password() {
        return user_password;
    }

    public void setUser_password(@NonNull String user_password) {
        this.user_password = user_password;
    }
}


