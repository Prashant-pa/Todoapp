package com.example.recylerviewproject;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.Holder> {
    ArrayList<Model> data;

    public MyAdapter(ArrayList<Model> data) {
        this.data = data;
    }

    @NonNull
    @Override
    public Holder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater=LayoutInflater.from(parent.getContext());
        View view=inflater.inflate(R.layout.item_layout,parent,false);
        return new Holder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull Holder holder, int position) {
    holder.tv1.setText(data.get(position).getName());
    holder.tv2.setText(data.get(position).getEmail());
    }

    @Override
    public int getItemCount() {
        return data.size();
    }

    public class Holder extends RecyclerView.ViewHolder{
TextView tv1,tv2;
ImageView img;
        public Holder(@NonNull View itemView) {
            super(itemView);
            tv1=itemView.findViewById(R.id.textView);
            tv2=itemView.findViewById(R.id.text1);
        }
    }
}
