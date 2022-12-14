package com.example.CoffeeCafeteria;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;

import androidx.appcompat.app.AppCompatActivity;

public class softDrinks extends AppCompatActivity {
    int quantity = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_soft_drinks);
    }
    public void submitOrder(View view) {



        // Get user's name
//        EditText nameField = (EditText) findViewById(R.id.order_summary_name);
//        Editable nameEditable = nameField.getText();
//        String name = nameEditable.toString();
        String name = "sahil";


        // Figure out if the user wants whipped cream topping
        CheckBox whippedCreamCheckBox = (CheckBox) findViewById(R.id.whipped_cream_checkbox);
        boolean hasWhippedCream = whippedCreamCheckBox.isChecked();

        // Figure out if the user wants chocolate topping
        CheckBox chocolateCheckBox = (CheckBox) findViewById(R.id.chocolate_checkbox);
        boolean hasChocolate = chocolateCheckBox.isChecked();


        // Calculate the price
        int price = calculatePrice(hasWhippedCream, hasChocolate);
        String message = createOrderSummary(name, price, hasWhippedCream, hasChocolate);
        Intent i = new Intent(this,turnpage.class);
        i.putExtra("message_key", message);
        startActivity(i);

    }

    public int calculatePrice(boolean hasWhippedCream, boolean hasChocolate) {
        // First calculate the price of one cup of coffee
        int basePrice = 20;

        // If the user wants whipped cream, add 5Rs per cup
        if (hasWhippedCream) {
            basePrice = basePrice + 5;
        }
        // If the user wants chocolate, add 5Rs per cup
        if (hasChocolate) {
            basePrice = basePrice + 5;
        }

        // Calculate the total order price by multiplying by the quantity
        return quantity * basePrice;
    }
    public String createOrderSummary(String name, int price, boolean addWhippedCream,
                                     boolean addChocolate) {
        float pay = (float) ((0.05*price) + price);
        String priceMessage = "         ORDER SUMMARY          \n\n" ;
        priceMessage+=name;
        priceMessage+="\nTotal Coffee Ordered :" + quantity;
        priceMessage+="\nOrder ID : DS508";
        priceMessage+=" \nExtras :";
        priceMessage+="\nWhipped Cream added :  " + addWhippedCream;
        priceMessage+="\nCocolate added :  " + addChocolate;
        priceMessage+="\nBill :" + price;
        priceMessage+="\nGST (5%): " + (float) (0.05*price);
        priceMessage+="\nTotal payable :" + pay ;
        priceMessage+="\nThank you.!";

        return priceMessage;

    }


}