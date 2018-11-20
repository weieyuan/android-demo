package com.example.weieyuan.weiapp.database;

import android.app.Application;
import android.arch.persistence.room.Room;


public class AppContext extends Application {

    public static MemoryDataBase myDataBase;

    @Override
    public void onCreate() {
        super.onCreate();

        initDataBase();
    }

    /* 初始化 数据库 */
    private void initDataBase() {
        myDataBase = Room
                .databaseBuilder(getApplicationContext(), MemoryDataBase.class, "memory.db")
                .build();
    }

}
