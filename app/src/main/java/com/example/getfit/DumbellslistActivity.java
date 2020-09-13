package com.example.getfit;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class DumbellslistActivity extends AppCompatActivity {

    List<Product> lstProduct ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dumbellslist);

        // Making a array list in order to store value.
        lstProduct = new ArrayList<>();
        lstProduct.add(new Product("10lb Virgin Rubber Hex Dumbbell No Odour","Made with 100% Virgin rubber, No Toxic Smell, Premium Black Handles.","$20",R.drawable.dumbell1));
        lstProduct.add(new Product("Element Fitness 85lbs Platinum Dumbbell","85lbs Dumbbell SOLD INDIVIDUALLY\n" +
                "\n" +
                "Element Commercial Round Dumbbells Gun Metal have been designed to meet the requirements of commercial gyms and elite training facilities.", "$297.50",R.drawable.dumbell2));
        lstProduct.add(new Product("Neoprene 05lbs Dumbbell","he neoprene covered dumbbells are perfect for light weight training, and ideal for training in 1lb progressive increments.\n" +
                "\n" +
                "This makes Neoprene dumbbells great for rehabilitation, and novice athletes, and even incorporating into aerobics, cardio routines, and HIIT ", "$11.25",R.drawable.dumbell3));
        lstProduct.add(new Product("XM 6 Pair Vertical Dumbbell Rack SET","Holds 6 Pairs of dumbbells, from 5 lb up to 30 lb (5, 10, 15, 20, 25 and 30 lb). Larger increments may cause issues with spacing.\n" +
                "\n" +
                "Black Powder Coat finish frame", "$399.00",R.drawable.dumbell4));

        //Assigning a new reclerview variable and setting layout using grid layout with 1 product per line.
        RecyclerView recyclev = (RecyclerView) findViewById(R.id.recyclerview_id);
        RecyclerViewAdapter myAdapter = new RecyclerViewAdapter(this,lstProduct);
        recyclev.setLayoutManager(new GridLayoutManager(this,1));
        recyclev.setAdapter(myAdapter);

    }
}