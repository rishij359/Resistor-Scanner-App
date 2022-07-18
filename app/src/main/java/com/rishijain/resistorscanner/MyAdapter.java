package com.rishijain.resistorscanner;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.ArrayList;

public class MyAdapter extends ArrayAdapter<String> {

    private final String[] arr;
    private final Context context;
    private final ArrayList cls;

    public MyAdapter(@NonNull Context context, int resource, @NonNull String[] arr, ArrayList cls) {
        super(context, resource, arr);
        this.arr = arr;
        this.context = context;
        this.cls = cls;
    }

    @Nullable
    @Override
    public String getItem(int position) {
        return arr[position];
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        convertView = LayoutInflater.from(getContext()).inflate(R.layout.list_layout, parent, false);
        TextView t = convertView.findViewById(R.id.textView2);
        Button b = convertView.findViewById(R.id.button2);
        t.setText(getItem(position));
        b.setOnClickListener(v -> openActivity(v, position));
        return convertView;
    }
    public void openActivity(View v, int position)
    {
        Intent intent = new Intent(context, (Class<?>) cls.get(position));
        context.startActivity(intent);
    }
}
