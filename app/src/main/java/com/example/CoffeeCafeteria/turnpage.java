package com.example.CoffeeCafeteria;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class turnpage extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_turnpage);

        TextView msg = (TextView) findViewById(R.id.order);
        Intent i = getIntent();
        String name = i.getStringExtra("message_key");
        // display the string into textView
        msg.setText(name);
    }

    public void orderThis(View view) {
        Toast.makeText(this, "Your order is placed", Toast.LENGTH_SHORT).show();
    }
}