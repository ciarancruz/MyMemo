package com.example.mymemo;

import androidx.room.Database;
import androidx.room.RoomDatabase;

@Database(entities = {User.class, DiaryEntry.class, DiaryTag.class, Tag.class}, version = 1)
public abstract class AppDatabase extends RoomDatabase{
    public abstract UserDao userDao();
    public abstract DiaryEntryDao diaryEntryDao();
    public abstract DiaryTagDao diaryTagDao();
    public abstract TagDao tagDao();
}
