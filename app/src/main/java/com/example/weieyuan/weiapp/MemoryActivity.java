package com.example.weieyuan.weiapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.widget.ListView;

import com.example.weieyuan.weiapp.model.CustomerAdapter;
import com.example.weieyuan.weiapp.model.MemoryItemModel;
import com.example.weieyuan.weiapp.service.MemoryService;

import java.util.ArrayList;
import java.util.List;

public class MemoryActivity extends AppCompatActivity {

    private ListView listView;

    private List<MemoryItemModel> data = new ArrayList<>();

    private MemoryService service = new MemoryService();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_memory);

        this.listView = findViewById(R.id.listView);
        initListView();
    }

    private void initListView() {
        this.data.addAll(this.service.getData());
        BaseAdapter adapter = new CustomerAdapter(this, this.data);
        this.listView.setAdapter(adapter);
    }
}
