package com.nrc7.adapter2;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.nrc7.adapter2.model.Dog;

import java.util.List;

public class DogAdapter {

    public class MyViewHolder extends RecyclerView.ViewHolder {

        TextView nameTv, breedTv;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            nameTv = itemView.findViewById(R.id.nameTv);
            breedTv = itemView.findViewById(R.id.breedTv);
        }
    }
}
