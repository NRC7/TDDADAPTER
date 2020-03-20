package com.nrc7.adapter2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Receta
        getSupportFragmentManager().beginTransaction()
                // 3 param: 1) Container 2) Fragment 3)Tag
                .add(R.id.container, new ListFragment(), "listFragment")
                .commit();
    }
}
