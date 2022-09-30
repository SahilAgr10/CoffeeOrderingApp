package com.example.CoffeeCafeteria;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class hotCoffee extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hot_coffee);

        ArrayList<Word> words = new ArrayList<>();
        words.add(new Word("Caffe Americano","52 votes","₹235","Rich, full-bodied espresso with hot water in true European style.",R.drawable.images__2_));
        words.add(new Word("Cappuccino","38 votes","₹255","Dark, Rich in flavour espresso lies in wait under a smoothed and stretched layer of thick foam.",R.drawable.capecinco));
        words.add(new Word("Caramel Macchiato","11 votes","₹320","\"Freshly steamed milk with vanilla-flavored syrup is marked with espresso and topped with caramel drizzle.",R.drawable.mochiyato));
        words.add(new Word("Green Tea Latte","10 votes","₹265","\"Smooth and creamy matcha is lightly sweetened and served with steamed milk Hot",R.drawable.greenlatte));
        words.add(new Word("Hazelnut Caffe Latte","5 votes","₹305","\"Our dark, rich espresso balanced with Hazelnut flavored syrup, steamed milk and a light layer of foam.",R.drawable.hazelnut));

        WordAdapter adapter = new WordAdapter(this,words);
        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {

                for(int i =0;i < 1;i++){
                    if(position==0){
                        Intent intent = new Intent(hotCoffee.this,CaffeAmerico.class);
                        startActivity(intent);
                    }
                    if(position==1){
                        Intent intent = new Intent(hotCoffee.this,h2.class);
                        startActivity(intent);
                    }
                    if(position==1){
                        Intent intent = new Intent(hotCoffee.this,h3.class);
                        startActivity(intent);
                    }
                    if(position==1){
                        Intent intent = new Intent(hotCoffee.this,h4.class);
                        startActivity(intent);
                    }
                    if(position==4){
                        Intent intent = new Intent(hotCoffee.this,h5.class);
                        startActivity(intent);
                    }



                }
            }
        });


    }



}
