package com.example.a3month3hw2;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MainAdapter extends RecyclerView.Adapter<MainAdapter.ViewHolder> {
    private ArrayList<String> address;
    private ArrayList<String> number;

    private TextView tvAddress, tvNumber;
    public MainAdapter(ArrayList<String> address, ArrayList<String> number) {
        this.address = address;
        this.number = number;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new ViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.item, parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.onBind(address.get(position), number.get(position));
    }

    @Override
    public int getItemCount() {
        return address.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            tvAddress = itemView.findViewById(R.id.tv_name);
            tvNumber = itemView.findViewById(R.id.tv_age);
        }

        public void onBind(String s, String s1) {
            tvAddress.setText(s);
            tvNumber.setText(s1);
        }
    }
}
