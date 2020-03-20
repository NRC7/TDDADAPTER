package com.nrc7.adapter2;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.nrc7.adapter2.model.Dog;

import java.util.List;

public class DogAdapter extends RecyclerView.Adapter<DogAdapter.MyViewHolder> {

    List<Dog> dogList;

    public DogAdapter(List<Dog> dogList) {
        this.dogList = dogList;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        // Creacion de 1 ViewHolder (Receta)
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.list_item_dog, parent, false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        // Enlace vista con info del pojo
        holder.nameTv.setText(dogList.get(position).getName());
        holder.breedTv.setText(dogList.get(position).getBreed());
        // Picasso o Glide
    }

    @Override
    public int getItemCount() {
        // Tamaño de la lista
        return dogList.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {

        TextView nameTv, breedTv;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            nameTv = itemView.findViewById(R.id.nameTv);
            breedTv = itemView.findViewById(R.id.breedTv);
        }
    }
}
