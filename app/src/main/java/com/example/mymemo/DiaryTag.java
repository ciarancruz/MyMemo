package com.example.mymemo;

import androidx.room.Entity;
import androidx.room.ForeignKey;

@Entity(
        tableName = "DiaryTag", primaryKeys = {"entry_id", "tag_id"},
        foreignKeys = {
                @ForeignKey(
                        entity = DiaryEntry.class,
                        parentColumns = "entry_id",
                        childColumns = "entry_id",
                        onDelete = ForeignKey.CASCADE
                ),
                @ForeignKey(
                        entity = Tag.class,
                        parentColumns = "tag_id",
                        childColumns = "tag_id",
                        onDelete = ForeignKey.CASCADE
                )
        }
)
public class DiaryTag {

}
