package com.example.weieyuan.weiapp.model;

import android.arch.persistence.room.Entity;
import android.arch.persistence.room.PrimaryKey;


@Entity(tableName = "tbl_memory")
public class MemoryItemModel {

    @PrimaryKey(autoGenerate=true)
    private int id;

    private String date;

    private String content;

    public MemoryItemModel(String date, String content) {
        this.date = date;
        this.content = content;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
