package com.example.intentsproj;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class FirstActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first);
        final  EditText nbr1 = (EditText) findViewById(R.id.nbr1);
        final  EditText nbr2 = (EditText) findViewById(R.id.nbr2);

        Button ok  = (Button) findViewById(R.id.postok);
        ok.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               Intent intent = new Intent(FirstActivity.this, SecondActivity.class);

               String number1 = nbr1.getText().toString();
               String number2 = nbr2.getText().toString();

               intent.putExtra("number1", number1);
               intent.putExtra("number2", number2);
               startActivity(intent);

               Context context = getApplicationContext();
               CharSequence message = "You just clicked the OK button";

               Toast toast = Toast.makeText(FirstActivity.this,"Sending message",Toast.LENGTH_SHORT);
               toast.setGravity(Gravity.TOP|Gravity.LEFT, 0, 0);
               toast.show();

           }
       });

   }

}
