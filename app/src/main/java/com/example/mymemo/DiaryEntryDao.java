package com.example.mymemo;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

@Dao
public interface DiaryEntryDao {
    @Insert
    void insertDiaryEntry(DiaryEntry diaryEntry);

    @Update
    void updateDiaryEntry(DiaryEntry diaryEntry);

    @Delete
    void deleteDiaryEntry(DiaryEntry diaryEntry);

    @Query("Select * from DiaryEntry where entry_id = :entry_id")
    DiaryEntry getEntryById(int entry_id);
}
