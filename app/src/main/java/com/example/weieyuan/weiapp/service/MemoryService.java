package com.example.weieyuan.weiapp.service;

import com.example.weieyuan.weiapp.mock.MemoryMock;
import com.example.weieyuan.weiapp.model.MemoryItemModel;

import java.util.ArrayList;
import java.util.List;

public class MemoryService {

    private boolean mock = true;

    // TODO: 改造为分页获取
    public List<MemoryItemModel> getData() {
        if (this.mock) {
            return MemoryMock.getMockData();
        }
        return new ArrayList<>();
    }


}
