package com.example.sixteenpersonalties;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class AdapterClass extends RecyclerView.Adapter<AdapterClass.ViewHolder> { // we have to make the adapter class a child of recycler view
    // THIS IS THE CONTROLLER OF MVC Architecture
    // In Andriod its called as an Adapter class

    ArrayList <PersonalityModel> data = new ArrayList<>(); // HERE WE CAN'T USE AN ARRAY AS IT STORES THE SAME TYPE OF DATA, SO WE HAVE TO USE AN ARRAYLIST WHICH CAN HAVE DIFFERENT TYPE OF DATA.

    public AdapterClass(ArrayList<PersonalityModel> data) {
        this.data = data;
    }

    @NonNull
    @Override
    public AdapterClass.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new ViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.personality_view, null));
    }

    @Override
    public void onBindViewHolder(@NonNull AdapterClass.ViewHolder holder, int position) {
        holder.img.setImageResource(data.get(position).image);
        holder.desc.setText(data.get(position).desc);
    }

    @Override
    public int getItemCount() {
        return data.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        ImageView img;
        TextView desc;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            img = itemView.findViewById(R.id.imgPersonality);
            desc = itemView.findViewById(R.id.personalityFact);
        }
    }
}
