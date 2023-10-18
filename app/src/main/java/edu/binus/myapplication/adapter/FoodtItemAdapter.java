package edu.binus.myapplication.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

import edu.binus.myapplication.R;
import edu.binus.myapplication.model.FoodItem;

public class FoodtItemAdapter extends RecyclerView.Adapter<FoodtItemAdapter.ViewHolder> {
    private final List<FoodItem> foodItemList;

    public FoodtItemAdapter(List<FoodItem> foodItemList) {
        this.foodItemList = foodItemList;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_layout, parent, false);
        return new ViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.tv_name.setText(foodItemList.get(position).getName());
        holder.tv_price.setText(String.format("%s", foodItemList.get(position).getPrice()));
    }

    @Override
    public int getItemCount() {
        return foodItemList.size();
    }

    // inner class
    public static class ViewHolder extends RecyclerView.ViewHolder {
        public TextView tv_name;
        public TextView tv_price;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            this.tv_name = itemView.findViewById(R.id.tv_name);
            this.tv_price = itemView.findViewById(R.id.tv_price);
        }
    }
}
