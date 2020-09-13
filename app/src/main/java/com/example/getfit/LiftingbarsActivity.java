package com.example.getfit;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class LiftingbarsActivity extends AppCompatActivity {

    List<Product> lstProduct ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_liftingbars);

        // Making a array list in order to store value.
        lstProduct = new ArrayList<>();
        lstProduct.add(new Product("OB 47 Olympic Curl Bar","Olympic Curl Bar develops upper arm mass, strength and definition. This bar isolates and intensifies development of the bicep and forearm muscles while decreasing discomfort to the elbows and wrists.\n" +
                "Knurled Handgrips\n" +
                "Revolving Sleeves","$59.99",R.drawable.bars1));
        lstProduct.add(new Product("34 Olympic Style Tricep Bar","34\" Olympic style Triceps Bar is designed specifically for maximum concentration of the triceps muscles. This bar allows for unrestricted arm movement and eliminates discomfort to elbows, forearms and wrists.\n" +
                "Accommodates all 2\" OLYMPIC Plates\n" +
                "with diamond knurled hand grips\n" +
                "rotating sleeves\n" +
                "bar weighs 20 lbs", "$79.99",R.drawable.bars2));
        lstProduct.add(new Product("Element Fitness 2\" Solid 20\" Dumbbell Handle","Olympic Dumbbell Handles are the most durable in its class. Perfect for heavy-duty workouts and are an important addition to any strength-conditioning program that requires a variety of exercises.\n" +
                "\n" +
                "Straight Handgrip\n" +
                "Solid Steel w/ Chromed Finish\n" +
                "19 1/2\" Total Length w/ 6 1/2\" Collars", "$39.99",R.drawable.bars3));
        lstProduct.add(new Product("XM Fitness Black Farmer's Walk Bars - Athletic Series","6' total length\n" +
                "Sleeves: 9\" long\n" +
                "Each bar weighs ~ 15 lb\n" +
                "Max Weight: up to 500 lb per bar", "$199.00",R.drawable.bars4));

        //Assigning a new reclerview variable and setting layout using grid layout with 1 product per line.
        RecyclerView recyclev = (RecyclerView) findViewById(R.id.recyclerview_id);
        RecyclerViewAdapter myAdapter = new RecyclerViewAdapter(this,lstProduct);
        recyclev.setLayoutManager(new GridLayoutManager(this,1));
        recyclev.setAdapter(myAdapter);

    }
}