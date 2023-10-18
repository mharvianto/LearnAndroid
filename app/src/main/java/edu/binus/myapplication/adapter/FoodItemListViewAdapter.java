package edu.binus.myapplication.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import androidx.annotation.NonNull;

import java.util.ArrayList;
import java.util.List;

import edu.binus.myapplication.R;
import edu.binus.myapplication.model.FoodItem;

public class FoodItemListViewAdapter extends ArrayAdapter<FoodItem> {
    private Context context;
    private List<FoodItem> foodItems;

    public FoodItemListViewAdapter(@NonNull Context context, List<FoodItem> foodItems) {
        super(context, R.layout.item_layout, foodItems);
        this.context = context;
        this.foodItems = foodItems;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if (convertView == null) {
            LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            convertView = inflater.inflate(R.layout.item_layout, parent, false);
        }

        TextView tv_name = convertView.findViewById(R.id.tv_name);
        TextView tv_price = convertView.findViewById(R.id.tv_price);

        FoodItem currentItem = foodItems.get(position);
        tv_name.setText(currentItem.getName());
        tv_price.setText(String.format("%s", currentItem.getPrice()));

        return convertView;
    }
}
