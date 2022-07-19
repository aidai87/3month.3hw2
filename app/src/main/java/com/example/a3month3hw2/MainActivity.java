package com.example.a3month3hw2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private ArrayList<String> names = new ArrayList<>();
    private ArrayList<String> age = new ArrayList<>();
    private MainAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initData();
        initRecycler();
    }

    private void initData() {
        names.add("Гагарина");
        age.add("48");
        names.add("Гагарина");
        age.add("50");
        names.add("Гагарина");
        age.add("51");
        names.add("Гагарина");
        age.add("52");
        names.add("Гагарина");
        age.add("53");
    }
    private void initRecycler() {
        recyclerView = findViewById(R.id.recycler);
        adapter = new MainAdapter(names, age);
        recyclerView.setAdapter(adapter);
    }
}