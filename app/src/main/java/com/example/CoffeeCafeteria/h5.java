package com.example.CoffeeCafeteria;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import java.text.NumberFormat;

public class h5 extends AppCompatActivity {
    int quantity =1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_h5);

        TextView textView1 = (TextView) findViewById(R.id.cup_name) ;
        textView1.setText("Hazelnut Caffe");

        TextView textView2 = (TextView) findViewById(R.id.cup1) ;
        textView2.setText("Hazelnut Caffe");

        TextView textView3 = (TextView) findViewById(R.id.cupPrice) ;
        textView3.setText("₹305");
    }
    public void increment(View view) {
        if(quantity == 9) {
            Toast.makeText(this, "9 Coffees per Order ", Toast.LENGTH_SHORT).show();
            return;
        }
        quantity = quantity + 1;
        display(quantity);
        displayPrice(quantity * 235);
    }
    public void decrement(View view) {
        if(quantity==0){
            Toast.makeText(this,"minimum 1 coffee",Toast.LENGTH_SHORT).show();
            return;
        }
        quantity -= 1;
        display(quantity);
        displayPrice(quantity*235);
    }
    public void displayMessage(String message) {
        TextView priceTextView = (TextView) findViewById(R.id.order);
        priceTextView.setText(message);
    }
    public void display(int number) {
        TextView quantityTextView = (TextView) findViewById(R.id.quantity_text_view);
        quantityTextView.setText("" + number);
    }
    public void displayPrice(int number) {
        TextView priceTextView = (TextView) findViewById(R.id.quantity_text);
        priceTextView.setText(NumberFormat.getCurrencyInstance().format(number));
    }
    public void submitOrder(View view) {
        Toast.makeText(this, "Order is placed", Toast.LENGTH_SHORT).show();
    }
}