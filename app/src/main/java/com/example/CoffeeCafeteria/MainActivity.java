package com.example.CoffeeCafeteria;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;





public class MainActivity extends AppCompatActivity {

    int quantity = 1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    public void hotCoffee(View view) {
        Intent i = new Intent(this,hotCoffee.class);
        startActivity(i);

    }

    public void coldCoffee(View view) {
        Intent i = new Intent(this,coldCoffee.class);
        startActivity(i);
    }

    public void indianTea(View view) {
        Intent i = new Intent(this,indianTea.class);
        startActivity(i);
    }

    public void softDrinks(View view) {
        Intent i = new Intent(this,softDrinks.class);
        startActivity(i);
    }

    public void zomato(View view) {
        Intent i = new Intent(
                Intent.ACTION_VIEW,
                Uri.parse("http://www.zomato.com")
        );
        startActivity(i);
    }
    public void Swiggy(View view) {
        Intent i = new Intent(
                Intent.ACTION_VIEW,
                Uri.parse("http://www.swiggy.com")
        );
        startActivity(i);
    }
    public void MacD(View view) {
        Intent i = new Intent(
                Intent.ACTION_VIEW,
                Uri.parse("http://www.mcdindia.com")
        );
        startActivity(i);
    }
    public void Starbuks(View view) {
        Intent i = new Intent(
                Intent.ACTION_VIEW,
                Uri.parse("http://www.starbuks.com")
        );
        startActivity(i);
    }
    public void Baristo(View view) {
        Intent i = new Intent(
                Intent.ACTION_VIEW,
                Uri.parse("http://www.barista.com")
        );
        startActivity(i);
    }
    public void Dominoz(View view) {
        Intent i = new Intent(
                Intent.ACTION_VIEW,
                Uri.parse("http://www.dominos.com")
        );
        startActivity(i);
    }

    public void Additem(View view) {
        Intent intent = new Intent(MainActivity.this,GreenLatte.class);
        startActivity(intent);
    }

    public void orderMeal(View view) {
        Intent intent = new Intent(this,DayMeal.class);
        startActivity(intent);

    }
}