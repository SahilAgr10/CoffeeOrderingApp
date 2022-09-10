package com.example.CoffeeCafeteria;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.ArrayList;

public class WordAdapter extends ArrayAdapter<Word> {

    public WordAdapter(Context context, ArrayList<Word> words){
        super(context,0,words);


    }
    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View listView = convertView;
        if(listView == null) {
            listView = LayoutInflater.from(getContext()).inflate(
                    R.layout.xmllayout, parent, false);
        }
            Word current = getItem(position);

            TextView name = (TextView) listView.findViewById(R.id.name);
            name.setText(current.getName());
            TextView vote = (TextView) listView.findViewById(R.id.vote);
            vote.setText(current.getVote());
            TextView price = (TextView) listView.findViewById(R.id.price);
            price.setText(current.getPrice());
            TextView discription = (TextView) listView.findViewById(R.id.discription);
            discription.setText(current.getDiscription());
            ImageView imageView = (ImageView) listView.findViewById(R.id.imagethere);
            imageView.setImageResource(current.getImagee());


        return listView;


    }
}
