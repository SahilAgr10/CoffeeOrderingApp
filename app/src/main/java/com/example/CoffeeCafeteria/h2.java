package com.example.CoffeeCafeteria;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class h2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_h2);

        ImageView textView = (ImageView) findViewById(R.id.cup);
        textView.setImageResource(R.drawable.capecinco);

        TextView textView1 = (TextView) findViewById(R.id.cup_name) ;
        textView1.setText("Cappuccino");

        TextView textView2 = (TextView) findViewById(R.id.cup1) ;
        textView2.setText("Cappuccino");

        TextView textView3 = (TextView) findViewById(R.id.cupPrice) ;
        textView3.setText("₹255");
    }
}