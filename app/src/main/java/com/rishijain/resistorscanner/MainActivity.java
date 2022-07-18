package com.rishijain.resistorscanner;

import android.os.Bundle;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ListView listView;
    String[] arr = {"Resistor Scanner", "Calculate Minimum resistors required"};
    ArrayList<Class> list_class = new ArrayList<>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        list_class.add(MainActivity2.class);
        list_class.add(MinResistor.class);
        listView = findViewById(R.id.listview);
        MyAdapter ad = new MyAdapter(this, R.layout.list_layout, arr, list_class);
        listView.setAdapter(ad);


    }
}
