package com.example.takehomeassignment06_yuqingw;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import static java.lang.Double.parseDouble;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void launchActivity(View view){
        EditText amountText = findViewById(R.id.amount);
        double amount = parseDouble(amountText.getText().toString());

        EditText taxText = findViewById(R.id.tax);
        double tax = parseDouble(taxText.getText().toString());

        EditText tipText = findViewById(R.id.tip);
        double tip = parseDouble(tipText.getText().toString());

        Intent intent = new Intent(this,OwnActivity.class);
        intent.putExtra(Keys.AMOUNT,amount);
        intent.putExtra(Keys.TAX,tax);
        intent.putExtra(Keys.TIP,tip);
        startActivity(intent);
    }
}
