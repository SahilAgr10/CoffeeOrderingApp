package com.example.CoffeeCafeteria;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import java.text.NumberFormat;

public class DayMeal extends AppCompatActivity {
    int quantity = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_day_meal);
    }
    public void increment(View view) {
        if(quantity == 5) {
            Toast.makeText(this, "Accepts only 5 Orders  ", Toast.LENGTH_SHORT).show();
            return;
        }
        quantity = quantity + 1;
        display(quantity);
        displayPrice(quantity * 425);
    }


    public void decrement(View view) {
        if(quantity==0){
            Toast.makeText(this,"Select atleast 1 combo",Toast.LENGTH_SHORT).show();
            return;
        }

        quantity = quantity - 1;
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
    /**
     * This method displays the given price on the screen.
     */
    public void displayPrice(int number) {
        TextView priceTextView = (TextView) findViewById(R.id.quantity_text);
        priceTextView.setText(NumberFormat.getCurrencyInstance().format(number));
    }
    public void submitOrder(View view) {
        Toast.makeText(this, "Your Order is placed", Toast.LENGTH_SHORT).show();
    }
}