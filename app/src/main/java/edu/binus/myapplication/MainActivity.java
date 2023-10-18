package edu.binus.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.util.ArrayList;
import java.util.List;

import edu.binus.myapplication.adapter.FoodtItemAdapter;
import edu.binus.myapplication.model.FoodItem;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btn_recycler_view = findViewById(R.id.btn_recycler_view);
        btn_recycler_view.setOnClickListener((view) -> {
            Intent intent = new Intent(this, RecyclerViewActivity.class);
            startActivity(intent);
        });

        Button btn_list_view = findViewById(R.id.btn_list_view);
        btn_list_view.setOnClickListener((view) -> {
            Intent intent = new Intent(this, ListViewActivity.class);
            startActivity(intent);
        });
    }
}