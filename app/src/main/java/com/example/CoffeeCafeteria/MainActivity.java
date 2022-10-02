package com.example.CoffeeCafeteria;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import com.example.CoffeeCafeteria.ui.login.LoginActivity;

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

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()){
            case R.id.account_balancc:
                Toast.makeText(this, "Account Balance ₹0", Toast.LENGTH_SHORT).show();
            case R.id.account:
                Intent intent = new Intent(MainActivity.this, LoginActivity.class);
                startActivity(intent);
        }
        return super.onOptionsItemSelected(item);
    }
}