package com.example.assignment2_cashregister;

import static java.security.AccessController.getContext;

import android.widget.BaseAdapter;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class productBaseAdapter extends BaseAdapter {

    private final Context context;
    private final ArrayList<Product> products;
    private OnProductClickListener onProductClickListener;

    public interface OnProductClickListener {
        void onProductClick(Product product);
    }

    public void setOnProductClickListener(OnProductClickListener listener) {
        this.onProductClickListener = listener;
    }

    public productBaseAdapter(ArrayList<Product> products, Context context) {
        this.products = products;
        this.context = context;
    }

    @Override
    public int getCount() {
        return products.size();
    }

    @Override
    public Object getItem(int position) {
        return products.get(position);
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if (convertView == null)
            convertView = LayoutInflater.from(context).inflate(R.layout.product_row, parent, false);

        TextView nameTextView = convertView.findViewById(R.id.product_name);
        TextView priceTextView = convertView.findViewById(R.id.product_price);
        TextView quantityTextView = convertView.findViewById(R.id.product_quantity);

        Product product = (Product) getItem(position);

        if (product != null) {
            nameTextView.setText(product.getName());
            priceTextView.setText("$" + String.valueOf(product.getPrice()));
            quantityTextView.setText(String.valueOf(product.getQuantity()));
        }
        // Return product name
        convertView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (onProductClickListener != null) {
                    onProductClickListener.onProductClick((Product) getItem(position));
                }
            }
        });
        return convertView;
    }
}
