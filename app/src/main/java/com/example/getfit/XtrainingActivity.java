package com.example.getfit;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class XtrainingActivity extends AppCompatActivity {

    List<Product> lstProduct ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_xtraining);

        // Making a array list in order to store value.
        lstProduct = new ArrayList<>();
        lstProduct.add(new Product("Assault AirBike","Having forged the path to bringing the air bike into the Elite Fitness space, our original Assault AirBike classic is best known for creating love-hate relationships with those that have been bold enough to give it a try. Found in boxes and gyms across the globe, this badboy’s reputation precedes itself. As with all Assault products, the AirBike classic is forged from the highest quality, most durable materials. This old favorite will leave you burning for days.","$1099.00",R.drawable.xtraining1));
        lstProduct.add(new Product("XM FITNESS ST Drive HIIT Trainer Manual Treadmill","The dual training system offers different levels training for runner's cardiovascular and muscular endurance. The total training could reach to 64 quick response diversification levels.", "$3299.00",R.drawable.xtraining2));
        lstProduct.add(new Product("XM Pro Slam Balls 08lbs","The Xtreme Pro Slam Ball is a great conditioning tool for all fitness levels that works the entire body with explosive, functional training movements. Also known as ‘dead balls’, slam balls feature a dead-bounce and don’t roll away. The hard shell, made of thick rubber, is designed to be used against rubber surfaces in high velocity impact exercises such as throwing. Advantages to using a slam ball over free weights include flexibility and a greater range of dynamic exercises which increase cardiovascular systems, muscle mass and hand-eye coordination.", "$17.99",R.drawable.xtraining3));
        lstProduct.add(new Product("Element Fitness Pro-Grip Seated Row/Chin Bar Double D Rubber","Super heavy-duty welded flange ensures a lifetime of usage even under extreme conditions. All ends are precision-ground and polished to an exact radius. Perfectly balanced with comfortable rubber #18 diamond knurl-textures grips. Solid steel, 5 lbs.", "$19.99",R.drawable.xtraining4));

        //Assigning a new reclerview variable and setting layout using grid layout with 1 product per line.
        RecyclerView recyclev = (RecyclerView) findViewById(R.id.recyclerview_id);
        RecyclerViewAdapter myAdapter = new RecyclerViewAdapter(this,lstProduct);
        recyclev.setLayoutManager(new GridLayoutManager(this,1));
        recyclev.setAdapter(myAdapter);
    }
}