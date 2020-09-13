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

    private Button payment,exitBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_thanks);

        //Here payment button is defined .
        payment=(Button) findViewById(R.id.continue_shopping) ;
        exitBtn=(Button) findViewById(R.id.exit_btn) ;


        //Here on being this button being clicked, it will first show a toast message then it will send the user to product activity.
        payment.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ThanksActivity.this, ProductActivity.class);
                startActivity(intent);
            }
        });

        exitBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ThanksActivity.this, MainActivity.class);
                startActivity(intent);
            }
        });
    }
}