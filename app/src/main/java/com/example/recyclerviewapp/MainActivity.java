package com.example.recyclerviewapp;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        RecyclerView rcv = findViewById(R.id.rcv);

        List<Items> itemsList = new ArrayList<>();
        itemsList.add(new Items("Beluga", "Arctic  Ocean", R.drawable.beluga));
        itemsList.add(new Items("Colugo", "Southeast Asia", R.drawable.colugo));
        itemsList.add(new Items("Eagle", "North America", R.drawable.eagle));
        itemsList.add(new Items("Fox", "Arctic to Desert", R.drawable.fox));
        itemsList.add(new Items("Hummingbird", "North America", R.drawable.hummingbird));
        itemsList.add(new Items("Koala", "Australia", R.drawable.koala));
        itemsList.add(new Items("Panther", "South and Southeast Asia", R.drawable.panther));
        itemsList.add(new Items("Polar Bear", "Arctic", R.drawable.polarbear));
        itemsList.add(new Items("Red Panda", "Southwest China", R.drawable.red_panda));
        itemsList.add(new Items("Tiger", "South and Southeast Asia", R.drawable.tiger));



        rcv.setLayoutManager(new LinearLayoutManager(this));
        rcv.setAdapter(new MyAdapter(getApplicationContext(),itemsList));
    }
}