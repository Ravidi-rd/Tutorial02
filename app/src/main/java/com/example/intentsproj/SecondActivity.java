package com.example.intentsproj;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity  {


    TextView no1,no2,result;
    Button button_add,button_sub,button_mul,button_div;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        no1 = (TextView) findViewById(R.id.no1);
        no2 = (TextView) findViewById(R.id.no2);

        Intent intent = getIntent();
        String numb1 = intent.getStringExtra("number1");
        String numb2 = intent.getStringExtra("number2");


        final double n1 = Double.parseDouble(numb1);
        final double n2 = Double.parseDouble(numb2);


        no1.setText(numb1);
        no2.setText(numb2);

        button_add.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v) {
                result.setText(n1+"+"+n2+"="+(n1+n2));
            }

        });
        button_sub.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v) {
                result.setText(n1+"-"+n2+"="+(n1-n2));
            }

        });
        button_mul.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v) {
                result.setText(n1+"*"+n2+"="+(n1*n2));
            }

        });
        button_div.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v) {
                result.setText(n1+"/"+n2+"="+(n1/n2));
            }

        });




    }
}
