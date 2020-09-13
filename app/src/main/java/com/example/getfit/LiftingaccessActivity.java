package com.example.getfit;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class LiftingaccessActivity extends AppCompatActivity {

    List<Product> lstProduct ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_liftingaccess);

        // Making a array list in order to store value.
        lstProduct = new ArrayList<>();
        lstProduct.add(new Product("Under Armour Resistor Men's Gloves - Graphite Yellow","UA power strap supports the wrist\n" +
                "Strategic palm padding provides added protection and grip\n" +
                "Perforated palm offers breathable wear\n" +
                "Terry cloth thumb panel for easy sweat wipe-away","$24.55",R.drawable.liftingaccess1));
        lstProduct.add(new Product("Nike Strength Training Belt 3.0 Black/White","Anatomically correct, unisex design encourages proper lifting technique\n" +
                "All-over breathable mesh helps you stay cool\n" +
                "Wide hook-and-loop closure for a secure, adjustable fit", "$38.00",R.drawable.liftingaccess2));
        lstProduct.add(new Product("Body-Solid Tools Lifting Chains","Pair of 5' Long Chains\n" +
                "Each Chain is 22 lbs.\n" +
                "Offers scalable lifting resistance\n" +
                "Perfect for use in squats, deadlifts and bench presses", "$119.00",R.drawable.liftingaccess3));
        lstProduct.add(new Product("Manta Ray Squat Support Pad","Your arms no longer have to support so much of the load to keep the bar from rolling off your back!\n" +
                "Finding the center of the bar on each set is no longer a problem. Once you center and snap the Manta Ray to the bar you know your right in the middle, every set!\n" +
                "Repairing trauma from that shearing force crushing muscle and nerves against bone is no longer wasting part of your bodies limited ability to recuperate from a workout!", "$49.95",R.drawable.liftingaccess4));

        //Assigning a new reclerview variable and setting layout using grid layout with 1 product per line.
        RecyclerView recyclev = (RecyclerView) findViewById(R.id.recyclerview_id);
        RecyclerViewAdapter myAdapter = new RecyclerViewAdapter(this,lstProduct);
        recyclev.setLayoutManager(new GridLayoutManager(this,1));
        recyclev.setAdapter(myAdapter);


    }
}