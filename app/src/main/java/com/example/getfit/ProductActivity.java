package com.example.getfit;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class ProductActivity extends AppCompatActivity {

private CardView cardview0, cardview1, cardview3, cardview4, cardview5, cardview6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_product);

        cardview0=(CardView) findViewById(R.id.cardview_id);
        cardview1=(CardView) findViewById(R.id.cardview_id1);
        cardview3=(CardView) findViewById(R.id.cardview_id3);
        cardview4=(CardView) findViewById(R.id.cardview_id4);
        cardview5=(CardView) findViewById(R.id.cardview_id5);
        cardview6=(CardView) findViewById(R.id.cardview_id6);

        cardview0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(ProductActivity.this, DumbellslistActivity.class);
                startActivity(intent);
            }
        });

        cardview1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(ProductActivity.this, KettlebellActivity.class);
                startActivity(intent);
            }
        });

        cardview3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(ProductActivity.this, LiftingbarsActivity.class);
                startActivity(intent);
            }
        });

        cardview4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(ProductActivity.this, WeightplatesActivity.class);
                startActivity(intent);
            }
        });

        cardview5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(ProductActivity.this, XtrainingActivity.class);
                startActivity(intent);
            }
        });

        cardview6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(ProductActivity.this, LiftingaccessActivity.class);
                startActivity(intent);
            }
        });

    }
}