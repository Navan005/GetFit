package com.example.getfit;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class KettlebellActivity extends AppCompatActivity {

    List<Product> lstProduct ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kettlebell);

        // Making a array list in order to store value.
        lstProduct = new ArrayList<>();
        lstProduct.add(new Product("CAP Barbell Enamel Coated Cast Iron Kettlebell","Weighs 10 pounds\n" +
                "Made of solid cast iron\n" +
                "Black with machined finish\n" +
                "30 Day Manufacture's Warranty","$22.97",R.drawable.kettlebells1));
        lstProduct.add(new Product("Bionic Body Bionic Body Soft Kettle Bell with Handle","Made of soft materials to prevent damages and injuries\n" +
                "Large comfortable handle for easy grip\n" +
                "Hard handle holds weight in place during workouts\n" +
                "Comes in a variety of weights including 10 lbs, 15 lbs, 20 lbs, 25 lbs and 30 lbs (sold separately)\n" +
                "It Comes with 2-year limited Manufacturer Warranty", "$61.10",R.drawable.kettlebells2));
        lstProduct.add(new Product("Kettle Gryp - Kettlebell Adjustable Portable Weight Grip","IMAGINE NEVER HAVING TO MISS YOUR KETTLEBELL WORKOUT WHILE TRAVELING | KettleGryp is the perfect workout accessory for your travel needs, or to keep in your everyday gym bag. At less than 1 pound, this grip can hold most standard dumbbells up to 55# and instantly turn it into a kettlebell.", "$49.95",R.drawable.kettlebells3));
        lstProduct.add(new Product("Bowflex 840 SelectTech Kettlebell","With the turn of a dial, automatically change your resistance from 8 lbs. all the way up to 40 lbs.\n" +
                "Rapidly switch from one exercise to the next, and perform a wide variety of full-body exercises\n" +
                "Space-efficient design replaces up to 6 kettlebells", "$399.99",R.drawable.kettlebells4));

        //Assigning a new reclerview variable and setting layout using grid layout with 1 product per line.
        RecyclerView recyclev = (RecyclerView) findViewById(R.id.recyclerview_id);
        RecyclerViewAdapter myAdapter = new RecyclerViewAdapter(this,lstProduct);
        recyclev.setLayoutManager(new GridLayoutManager(this,1));
        recyclev.setAdapter(myAdapter);


    }
}