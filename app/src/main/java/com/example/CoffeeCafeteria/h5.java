package com.example.CoffeeCafeteria;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class h5 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_h5);

        ImageView textView = (ImageView) findViewById(R.id.cup);
        textView.setImageResource(R.drawable.hazelnut);

        TextView textView1 = (TextView) findViewById(R.id.cup_name) ;
        textView1.setText("Hazelnut Caffe");

        TextView textView2 = (TextView) findViewById(R.id.cup1) ;
        textView2.setText("Hazelnut Caffe");

        TextView textView3 = (TextView) findViewById(R.id.cupPrice) ;
        textView3.setText("₹305");
    }
}