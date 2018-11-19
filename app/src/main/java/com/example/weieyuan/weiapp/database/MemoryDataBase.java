package com.example.weieyuan.weiapp.database;


import com.example.weieyuan.weiapp.dao.MemoryItemDao;
import com.example.weieyuan.weiapp.model.MemoryItemModel;

import androidx.room.Database;
import androidx.room.RoomDatabase;

@Database(entities = {MemoryItemModel.class}, version = 1)
public abstract class MemoryDataBase extends RoomDatabase {
    public abstract MemoryItemDao memoryDao();
}