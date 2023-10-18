package edu.binus.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

import edu.binus.myapplication.adapter.FoodItemListViewAdapter;
import edu.binus.myapplication.model.FoodItem;

public class ListViewActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_view);

        List<FoodItem> foodItems = new ArrayList<>();
        for (int i = 0; i < 200; i++) {
            foodItems.add(new FoodItem("Food " + (i + 1), Math.round(Math.random() * 20 * 100) / 100.00));
        }

        FoodItemListViewAdapter adapter = new FoodItemListViewAdapter(this, foodItems);
        ListView listView = findViewById(R.id.lv_food_items);
        listView.setAdapter(adapter);
    }
}