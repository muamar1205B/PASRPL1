package com.example.pasrpl1;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView rvClub;
    private ArrayList<Club> list = new ArrayList<>();
    ListAdapter listAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        rvClub = findViewById(R.id.rv_club);
        rvClub.setHasFixedSize(true);

        list.addAll(DataClub.getListdata());
        Recyclerviewlist();

    }

    private void Recyclerviewlist(){
        rvClub.setLayoutManager(new LinearLayoutManager(this));
    ListAdapter listAdapter = new ListAdapter(list);
    rvClub.setAdapter(listAdapter);
    }

}