package com.example.weieyuan.weiapp.mock;

import com.example.weieyuan.weiapp.model.MemoryItemModel;

import java.util.ArrayList;
import java.util.List;

public class MemoryMock {

    private static List<MemoryItemModel> data = new ArrayList<>();

    private MemoryMock() {

    }

    public static List<MemoryItemModel> getMockData() {
        for(int i = 0; i < 15; i++) {
            MemoryItemModel model = new MemoryItemModel("2018-10-18", "以产品的形态做技术，以创业的心态做产品。要证明自己的价值，要将自己的能力体现在产品中。");
            data.add(model);
        }
        return data;
    }

    public static void addNewMemory(MemoryItemModel model) {
        List<MemoryItemModel> res = new ArrayList<>();
        res.add(model);
        res.addAll(data);
        data = res;
    }
}
