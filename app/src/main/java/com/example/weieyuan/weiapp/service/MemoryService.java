package com.example.weieyuan.weiapp.service;

import com.example.weieyuan.weiapp.database.AppContext;
import com.example.weieyuan.weiapp.mock.MemoryMock;
import com.example.weieyuan.weiapp.model.MemoryItemModel;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class MemoryService {

    private boolean mock = false;

    // TODO: 改造为分页获取
    public List<MemoryItemModel> getData() {
        if (this.mock) {
            return MemoryMock.getMockData();
        }
        else {
            List<MemoryItemModel> res = new ArrayList<>();
            Callable<List<MemoryItemModel>> callable = new Callable<List<MemoryItemModel>>(){
                @Override
                public List<MemoryItemModel> call() {
                    return AppContext.myDataBase.memoryDao().findAll();
                }
            };
            Future<List<MemoryItemModel>> future = Executors.newSingleThreadExecutor().submit(callable);
            try {
                res = future.get();
            } catch (InterruptedException e) {
                e.printStackTrace();
            } catch (ExecutionException e) {
                e.printStackTrace();
            }
            finally {
                return res;
            }
        }
    }


    public void addNewMemory(final MemoryItemModel model) {
        if (this.mock) {
            MemoryMock.addNewMemory(model);
        }
        else {
            Runnable runnable = new Runnable() {
                @Override
                public void run() {
                    AppContext.myDataBase.memoryDao().insert(model);
                }
            };
            Executors.newSingleThreadExecutor().submit(runnable);
        }
    }
}
