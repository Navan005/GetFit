/**
 * This activity confirms user about successful payment.
 *
 * @author Navandeep Singh
 * @version 4.0.1
 */

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

        //Here payment button is defined .
        payment=(Button) findViewById(R.id.continue_shopping) ;


        //Here on being this button being clicked, it will first show a toast message then it will send the user to product activity.
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