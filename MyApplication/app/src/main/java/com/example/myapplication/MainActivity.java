package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {






    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        TextView total = findViewById(R.id.Result);
        EditText hint1 = findViewById(R.id.Number1);
        EditText hint2 = findViewById(R.id.Number2);
        Button calculate = findViewById(R.id.Operate);

        calculate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int num1 = Integer.parseInt(hint1.getText().toString());
                int num2 = Integer.parseInt(hint2.getText().toString());

                int result = num1 + num2;

                total.setText(String.valueOf(result));

            }
        });


    }}