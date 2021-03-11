package com.example.recyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    RecyclerView recyclerView;

    String sgroup[], fname[], lname[], stitle[];
    int images[] = {R.drawable.aisulu, R.drawable.ahmad,R.drawable.avai,R.drawable.jimin,  R.drawable.melis, R.drawable.danil, R.drawable.jamal, R.drawable.pavel, R.drawable.aidai, R.drawable.oleg, R.drawable.igor, R.drawable.kirill, R.drawable.marat, R.drawable.john, R.drawable.steve, R.drawable.alia, R.drawable.asia, R.drawable.adam, R.drawable.vincent, R.drawable.rebecca, R.drawable.mark};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recyclerView);

        sgroup = getResources().getStringArray(R.array.group);
        fname = getResources().getStringArray(R.array.first_name);
        lname = getResources().getStringArray(R.array.last_name);
        stitle = getResources().getStringArray(R.array.title);

        MyAdapter myAdapter = new MyAdapter(this, sgroup, fname, lname, stitle,images );
        recyclerView.setAdapter(myAdapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
    }
}