package com.example.assignment2_cashregister;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    TextView product_tV, qnt_tV, total_tV;
    Button manager_btn_pushed, buy_btn_pushed, c_btn_pushed;
    Button btn1_pushed, btn2_pushed, btn3_pushed,btn4_pushed,btn5_pushed,btn6_pushed,
            btn7_pushed,btn8_pushed,btn9_pushed,btn0_pushed;
    ListView listView;
    //ListView product_list_display;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        List<Product> productList = myApp.getProductList(); // Replace myApp with the correct way of getting the product list

        // Create and set up the adapter
        productBaseAdapter adapter = new productBaseAdapter((ArrayList<Product>) productList, this);
//        adapter.setOnProductClickListener(new productBaseAdapter.OnProductClickListener() {
//            @Override
//            public void onProductClick(Product product) {
//                if (product_tV != null) {
//                    product_tV.setText("Selected Product: " + product.getName());
//                    // You can update other TextViews as needed
//                } else {
//                    Log.e("cashregister", "product_tV is null");
//                }
//            }
//        });
        // Fix this for showing the item clicked.
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                index =1;

            }
        });
        // Find the ListView in your layout
        listView = findViewById(R.id.product_list);

        // Set the adapter to the ListView
        listView.setAdapter(adapter);

        product_tV = findViewById(R.id.product_name);
        qnt_tV = findViewById(R.id.quantity_textview);
        total_tV = findViewById(R.id.total_amount_Textview);
        manager_btn_pushed = findViewById(R.id.manager_btn);
        buy_btn_pushed = findViewById(R.id.buy_btn);
        c_btn_pushed = findViewById(R.id.c_btn);
        btn1_pushed = findViewById(R.id.btn_1);
        btn2_pushed = findViewById(R.id.btn_2);
        btn3_pushed = findViewById(R.id.btn_3);
        btn4_pushed = findViewById(R.id.btn_4);
        btn5_pushed = findViewById(R.id.btn_5);
        btn6_pushed = findViewById(R.id.btn_6);
        btn7_pushed = findViewById(R.id.btn_7);
        btn8_pushed = findViewById(R.id.btn_8);
        btn9_pushed = findViewById(R.id.btn_9);
        btn0_pushed = findViewById(R.id.btn_0);

        btn1_pushed.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d("cashregister","Button 1 has been pushed.");
                String buttonText = ((Button) v).getText().toString();
                qnt_tV.setText(buttonText);
            }
        });
        btn2_pushed.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d("cashregister","Button 2 has been pushed.");
                String buttonText = ((Button) v).getText().toString();
                qnt_tV.setText(buttonText);
            }
        });
        btn3_pushed.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d("cashregister","Button 3 has been pushed.");
                String buttonText = ((Button) v).getText().toString();
                qnt_tV.setText(buttonText);
            }
        });
        btn4_pushed.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d("cashregister","Button 4 has been pushed.");
                String buttonText = ((Button) v).getText().toString();
                qnt_tV.setText(buttonText);
            }
        });
        btn5_pushed.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d("cashregister","Button 5 has been pushed.");
                String buttonText = ((Button) v).getText().toString();
                qnt_tV.setText(buttonText);
            }
        });
        btn6_pushed.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d("cashregister","Button 6 has been pushed.");
                String buttonText = ((Button) v).getText().toString();
                qnt_tV.setText(buttonText);
            }
        });
        btn7_pushed.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d("cashregister","Button 7 has been pushed.");
                String buttonText = ((Button) v).getText().toString();
                qnt_tV.setText(buttonText);
            }
        });
        btn8_pushed.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d("cashregister","Button 8 has been pushed.");
                String buttonText = ((Button) v).getText().toString();
                qnt_tV.setText(buttonText);
            }
        });
        btn9_pushed.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d("cashregister","Button 9 has been pushed.");
                String buttonText = ((Button) v).getText().toString();
                qnt_tV.setText(buttonText);
            }
        });
        btn0_pushed.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d("cashregister","Button 0 has been pushed.");
                String buttonText = ((Button) v).getText().toString();
                qnt_tV.setText(buttonText);
            }
        });
        c_btn_pushed.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d("cashregister","Button C has been pushed.");
                qnt_tV.setText("");
            }
        });
        manager_btn_pushed.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d("cashregister","Manager has been pushed.");
            }
        });
        buy_btn_pushed.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d("cashregister","Buy button has been pushed.");
            }
        });



    }
}



















