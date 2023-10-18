package edu.binus.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import edu.binus.myapplication.adapter.FoodtItemAdapter;
import edu.binus.myapplication.model.FoodItem;

public class RecyclerViewActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recycler_view);

        RecyclerView rv = findViewById(R.id.rv_food_items);

        List<FoodItem> foodItems = new ArrayList<>();
        for (int i = 0; i < 200; i++) {
            foodItems.add(new FoodItem("Food " + (i + 1), Math.round(Math.random() * 20 * 100) / 100.00));
        }

        rv.setLayoutManager(new LinearLayoutManager(this));
        rv.setAdapter(new FoodtItemAdapter(foodItems));
    }
}