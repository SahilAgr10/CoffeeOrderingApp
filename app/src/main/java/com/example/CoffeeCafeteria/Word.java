package com.example.CoffeeCafeteria;

public class Word {
    private String name;
    private String vote;
    private  String price;
    private String discription;
    private int imagee;

    public Word(String Name ,String Vote ,String Price, String Discription , int Image){
        name = Name;
        vote = Vote;
        price = Price;
        discription = Discription;
        imagee = Image;

    }

    public String getName() {
        return name;
    }

    public String getVote() {
        return vote;
    }

    public String getPrice() {
        return price;
    }

    public String getDiscription() {
        return discription;
    }

    public int getImagee() {
        return imagee;
    }
}
