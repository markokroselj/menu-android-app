package com.markokroselj.menu_app;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ListView dailyMenuLV = findViewById(R.id.dailyMenuLV);

        String[] sampleMenuItems = {
                "dnevna juha",
                "bujta repa",
                "piščančji zrezek v naravni omaki, cvetačni pire",
                "mesna lazanja s parmezanom",
                "zelenjavna lazanja s parmezanom",
                "pica klasika, margerita, suha salama, tuna",
                "mešana solata"
        };

        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, R.layout.list_view, sampleMenuItems);
        dailyMenuLV.setAdapter(adapter);

    }



}