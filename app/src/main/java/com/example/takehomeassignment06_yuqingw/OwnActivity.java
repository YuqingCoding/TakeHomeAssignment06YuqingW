package com.example.takehomeassignment06_yuqingw;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class OwnActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_own);

        Intent intent = getIntent();

        double amount = intent.getDoubleExtra(Keys.AMOUNT,0.0);
        double taxP = intent.getDoubleExtra(Keys.TAX,0.00);
        double tipP = intent.getDoubleExtra(Keys.TIP,0.0);

        double tax = amount * taxP;
        double tip = amount * tipP;
        double total = amount + tax + tip;

        TextView textView = findViewById(R.id.show_text_view);
        String show = "Total: "+amount+"\nSales Tax: "+tax+"\nTip: "+tip+"\nGrand Total: "+total;
        textView.setText(show);


    }
}
