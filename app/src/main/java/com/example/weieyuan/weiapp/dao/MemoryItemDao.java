package com.example.weieyuan.weiapp.dao;

import com.example.weieyuan.weiapp.model.MemoryItemModel;

import java.util.List;

import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;

@Dao
public interface MemoryItemDao {

    @Query("select * from tbl_memory")
    List<MemoryItemModel> findAll();

    @Insert
    void insert(MemoryItemModel modal);
}
