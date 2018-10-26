package com.example.weieyuan.weiapp.model;

import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.example.weieyuan.weiapp.R;

import java.util.ArrayList;
import java.util.List;

public class CustomerAdapter extends BaseAdapter {

    private Activity activity;

    private List<MemoryItemModel> data = new ArrayList<>();

    public CustomerAdapter(Activity activity, List<MemoryItemModel> data) {
        this.activity = activity;
        this.data = data;
    }

    @Override
    public int getCount() {
        return this.data.size();
    }

    @Override
    public Object getItem(int i) {
        return this.data.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        if (view == null) {
            view = this.activity.getLayoutInflater().inflate(R.layout.customer_list, null, false);
        }
        TextView text1 = view.findViewById(R.id.customListView1);
        TextView text2 = view.findViewById(R.id.customListView2);

        MemoryItemModel c = this.data.get(i);
        text1.setText(c.getDate());
        text2.setText(c.getContent());
        return view;
    }
}
