/**
 * This activity asks user for shipping and payment regarding information.
 * User have to input his shipping address and his card information.
 *
 * @author Navandeep Singh
 * @version 4.0.1
 */

package com.example.getfit;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class ShippingActivity extends AppCompatActivity{

    private Button payment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shipping);

//This is payment button defined.
        payment=(Button) findViewById(R.id.pay_btn) ;

        //This is clickListener event for payment button which will send the user to thanks activity.
        payment.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getBaseContext(), "Payment Successful! Thanks for shopping with GetFit.", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(ShippingActivity.this, ThanksActivity.class);
                startActivity(intent);
            }
        });
    }
}