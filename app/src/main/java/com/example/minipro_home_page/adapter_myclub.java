package com.example.minipro_home_page;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class adapter_myclub extends RecyclerView.Adapter<com.example.minipro_home_page.myviewholder>{
    ArrayList<com.example.minipro_home_page.Model> data;
    public adapter_myclub (ArrayList<com.example.minipro_home_page.Model> data) {
        this.data = data;
    }
    @NonNull
    @Override
    public com.example.minipro_home_page.myviewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater=LayoutInflater.from(parent.getContext());
        View view=inflater.inflate(R.layout.custom_grid_layout,parent,false);
        return  new com.example.minipro_home_page.myviewholder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull com.example.minipro_home_page.myviewholder holder, int position) {
        holder.t1.setText(data.get(position).getHeader());
        holder.t2.setText(data.get(position).getDesc());
        holder.img.setImageResource(data.get(position).getImgname());
    }

    @Override
    public int getItemCount() {
        return data.size();
    }
}
