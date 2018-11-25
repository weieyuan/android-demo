package com.example.weieyuan.weiapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.example.weieyuan.weiapp.model.MemoryItemModel;
import com.example.weieyuan.weiapp.service.MemoryService;

import java.util.Calendar;

public class NewMemoryActivity extends AppCompatActivity {

    private Button btn;

    private EditText editText;

    private MemoryService service = new MemoryService();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new_memory);

        this.btn = findViewById(R.id.button4);
        this.editText = findViewById(R.id.editText);

        init();
    }

    private void init() {
        this.btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String strContent = NewMemoryActivity.this.editText.getText().toString();
                System.out.println(strContent);
                // 抽成工具类
                Calendar rightNow = Calendar.getInstance();
                int year = rightNow.get(Calendar.YEAR);
                int month = rightNow.get(Calendar.MONTH);
                int day = rightNow.get(Calendar.DAY_OF_MONTH);
                String strDate = String.valueOf(year) + '-' + String.valueOf(month) + '-' + String.valueOf(day);
                MemoryItemModel model = new MemoryItemModel(strDate, strContent);
                NewMemoryActivity.this.service.addNewMemory(model);
                // 销毁当前的activity
                finish();
            }
        });
    }
}
