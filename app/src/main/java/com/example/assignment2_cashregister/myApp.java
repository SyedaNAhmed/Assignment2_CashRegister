package com.example.assignment2_cashregister;

import android.app.Application;

import java.util.ArrayList;
import java.util.List;

public class myApp  extends Application {
    private static List<Product> productList = new ArrayList<>();

    public static List<Product> getProductList() {
        return productList;
    }

    @Override
    public void onCreate() {
        super.onCreate();

        // Populate the product list
        productList.add(new Product("Pants", 20.44, 10));
        productList.add(new Product("Shoes", 10.44, 100));
        productList.add(new Product("Hats", 5.9, 30));
        // Add more products as needed
    }
}
