package com.example.getfit;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class ThanksActivity extends AppCompatActivity {

    private Button payment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_thanks);

        payment=(Button) findViewById(R.id.continue_shopping) ;

        payment.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getBaseContext(), "Payment Successful! Thanks for shopping with GetFit.", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(ThanksActivity.this, ProductActivity.class);
                startActivity(intent);
            }
        });
    }
}