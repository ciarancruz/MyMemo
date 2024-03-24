package com.example.mymemo;

import android.content.Context;

import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;

@Database(entities = {User.class, DiaryEntry.class, DiaryTag.class, Tag.class}, version = 1)
public abstract class AppDatabase extends RoomDatabase{
    public abstract UserDao userDao();
    public abstract DiaryEntryDao diaryEntryDao();
    public abstract DiaryTagDao diaryTagDao();
    public abstract TagDao tagDao();

    private static volatile AppDatabase INSTANCE;
    static AppDatabase getInstance(Context context) {
        if (INSTANCE == null) {
            synchronized (AppDatabase.class) {
                if (INSTANCE == null) {
                    INSTANCE = Room
                            .databaseBuilder(context.getApplicationContext()
                            , AppDatabase.class, "APP_DB")
                            .build();
                }
            }
        }
        return INSTANCE;
    }
}
