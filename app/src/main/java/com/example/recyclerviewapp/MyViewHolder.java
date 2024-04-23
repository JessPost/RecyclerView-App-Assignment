package com.example.recyclerviewapp;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class MyViewHolder extends RecyclerView.ViewHolder {

    ImageView img;
    TextView name;
    TextView location;


    public MyViewHolder(@NonNull View itemView) {
        super(itemView);
        img = itemView.findViewById(R.id.imageview);
        name = itemView.findViewById(R.id.name);
        location = itemView.findViewById(R.id.location);
    }


}
