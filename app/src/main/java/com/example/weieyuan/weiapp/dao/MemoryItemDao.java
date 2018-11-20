package com.example.weieyuan.weiapp.dao;

import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.Query;

import com.example.weieyuan.weiapp.model.MemoryItemModel;

import java.util.List;

@Dao
public interface MemoryItemDao {

    @Query("select * from tbl_memory")
    List<MemoryItemModel> findAll();

    @Insert
    void insert(MemoryItemModel modal);
}
