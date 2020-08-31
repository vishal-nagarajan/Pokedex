package com.example.pokedex;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

public class MainActivity extends AppCompatActivity {
    private RecyclerView recyclerview;
    private RecyclerView.Adapter adapter;
    private androidx.recyclerview.widget.RecyclerView.LayoutManager layoutManager;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerview= findViewById(R.id.recycler_view);
        adapter= new PokedexAdapter(getApplicationContext());
        layoutManager = new LinearLayoutManager(this);
        recyclerview.setAdapter(adapter);
        recyclerview.setLayoutManager(layoutManager);
    }
}