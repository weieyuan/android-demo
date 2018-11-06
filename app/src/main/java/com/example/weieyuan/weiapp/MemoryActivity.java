package com.example.weieyuan.weiapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.ListView;

import com.example.weieyuan.weiapp.model.CustomerAdapter;
import com.example.weieyuan.weiapp.model.MemoryItemModel;
import com.example.weieyuan.weiapp.service.MemoryService;

import java.util.ArrayList;
import java.util.List;

public class MemoryActivity extends AppCompatActivity {

    private ListView listView;

    private Button createBtn;

    private List<MemoryItemModel> data = new ArrayList<>();

    private MemoryService service = new MemoryService();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_memory);

        this.listView = findViewById(R.id.listView);
        initListView();

        this.createBtn = findViewById(R.id.button3);
        initCreateBtn();
    }

    private void initListView() {
        this.data.addAll(this.service.getData());
        BaseAdapter adapter = new CustomerAdapter(this, this.data);
        this.listView.setAdapter(adapter);
    }

    private void initCreateBtn() {
        this.createBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MemoryActivity.this, NewMemoryActivity.class);
                MemoryActivity.this.startActivity(intent);
            }
        });
    }
}
