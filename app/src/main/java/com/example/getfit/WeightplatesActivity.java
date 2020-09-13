package com.example.getfit;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class WeightplatesActivity extends AppCompatActivity {

    List<Product> lstProduct ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_weightplates);

        // Making a array list in order to store value.
        lstProduct = new ArrayList<>();
        lstProduct.add(new Product("10lb Virgin Rubber Grip Olympic Plate","10lbs Virgin Rubber Grip Olympic Plates 2\" - Made with 100% Virgin Rubber - No Toxic Smell - Premium Black Inserts","$20.00",R.drawable.weight1));
        lstProduct.add(new Product("XM FITNESS 10lbs Crumb Rubber Bumper Plate","Crumb Rubber has the ideal durometer rating to absorb bounce and shock, preventing damage to your olympic lifting bar. Crumb Rubber technology dissipates the impact giving you 10,000 - 30,000 drops and reducing stress on the lifting bars. On the field tests have shown XM Crumb Rubber Bumpers bounce less than other high-end rubber bumper plates on the market. Less bounce equals less shock and less noise.", "$22.50",R.drawable.weight2));
        lstProduct.add(new Product("25lbs Standard Steel Plate","Available in sizes: 2.5, 5, 10 & 25lbs. - Sold Individually! ", "$31.25",R.drawable.weight3));
        lstProduct.add(new Product("XM 300lbs Steel Olympic Weight Set with Bar","MORE WEIGHT, MORE GAINS!\n" +
                "\n" +
                "\n" +
                "Bulk up with the XM 300 lb Olympic Weight Set. These training weights allow you to do a wide range of exercises from squats to bench presses to maximize your workout. This Olympic weight set includes a 45 lb 7' Olympic chrome bar, two spring clips, and several plates at various weights for a customized workout. Having multiple plate sets makes it easy to accommodate multiple users and adjust to any performance level.", "$399.99",R.drawable.weight4));

        //Assigning a new reclerview variable and setting layout using grid layout with 1 product per line.
        RecyclerView recyclev = (RecyclerView) findViewById(R.id.recyclerview_id);
        RecyclerViewAdapter myAdapter = new RecyclerViewAdapter(this,lstProduct);
        recyclev.setLayoutManager(new GridLayoutManager(this,1));
        recyclev.setAdapter(myAdapter);
    }
}