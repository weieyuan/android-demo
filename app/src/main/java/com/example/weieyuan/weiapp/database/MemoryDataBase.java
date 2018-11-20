package com.example.weieyuan.weiapp.database;


import android.arch.persistence.room.Database;
import android.arch.persistence.room.RoomDatabase;

import com.example.weieyuan.weiapp.dao.MemoryItemDao;
import com.example.weieyuan.weiapp.model.MemoryItemModel;


@Database(entities = {MemoryItemModel.class}, version = 1, exportSchema=false)
public abstract class MemoryDataBase extends RoomDatabase {
    public abstract MemoryItemDao memoryDao();
}