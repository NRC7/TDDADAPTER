package com.nrc7.adapter2;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.nrc7.adapter2.model.DataSource;
import com.nrc7.adapter2.model.Dog;

import java.util.List;

public class ListFragment extends Fragment {

    RecyclerView recyclerView;
    DogAdapter adapter;

    public ListFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_list, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        // Recycler
        recyclerView = view.findViewById(R.id.dogsRv);
        // param1 = contexto ; param2 = Direccion; param3 = orden ASC o DESC
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext(), RecyclerView.VERTICAL, false));
        recyclerView.setHasFixedSize(true);

        // Adapter
        List<Dog> dogList = new DataSource().getDogs();
        adapter = new DogAdapter(dogList);

        // Union
        recyclerView.setAdapter(adapter);
    }
}
