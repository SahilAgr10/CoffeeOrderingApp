package com.example.CoffeeCafeteria;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class coldCoffee extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cold_coffee);

        ArrayList<Word> words = new ArrayList<>();
        words.add(new Word("White Mocha Frappuccino","52 votes","₹350","\"White chocolate Frappuccino is a blend of coffee, white chocolate sauce, milk and ice. .",R.drawable.c1));
        words.add(new Word("Caramel Frappuccino","38 votes","₹355","\"A blend of coffee, sweet caramel syrup, milk and ice topped with whipped cream and a swirl of caramel drizzle",R.drawable.c2));
        words.add(new Word("Java Chip Frappuccino","11 votes","₹335","We blend mocha sauce and Frappuccino chips with frappuccino roast coffee and milk and ice.",R.drawable.c3));
        words.add(new Word("Vanilla Cream Frappuccino","10 votes","₹340",
                "\"This rich and creamy blend of vanilla, milk and ice topped with whipped cream takes vanilla flavor to another leve",R.drawable.c4));
        words.add(new Word("Iced Caramel Macchiato","5 votes","₹350","Freshly steamed milk with vanilla-flavored syrup is marked with espresso and topped with caramel drizzle. Iced ",R.drawable.c5));

        WordAdapter adapter = new WordAdapter(this,words);
        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
                for(int i =0;i < 1;i++){
                    if(position==0){
                        Intent intent = new Intent(coldCoffee.this,c1.class);
                        startActivity(intent);
                    }
                    if(position==1){
                        Intent intent = new Intent(coldCoffee.this,c2.class);
                        startActivity(intent);
                    }
                    if(position==2){
                        Intent intent = new Intent(coldCoffee.this,c3.class);
                        startActivity(intent);
                    }
                    if(position==3){
                        Intent intent = new Intent(coldCoffee.this,c4.class);
                        startActivity(intent);
                    }
                    if(position==4){
                        Intent intent = new Intent(coldCoffee.this,c5.class);
                        startActivity(intent);
                    }
                }

            }
        });
    }

}