package com.example.unitconverter20;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Inches extends AppCompatActivity {

    private Button inches_feet, inches_yard, inches_miles;
    private TextView textview;
    private EditText edittext;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inches);
        inches_feet = findViewById(R.id.parameter_1);
        inches_yard = findViewById(R.id.parameter_2);
        inches_miles = findViewById(R.id.parameter_3);
        textview = findViewById(R.id.lenght_headline);
        edittext = findViewById(R.id.lenght_outplut);

        inches_feet.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String s = edittext.getText().toString();
                int inches = Integer.parseInt(s);
                double feet  = inches*0.83333;
                textview.setText("The value of input in inches is "+ feet);
            }
        });

        inches_yard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String s = edittext.getText().toString();
                int inches = Integer.parseInt(s);
                double yard  = inches*0.0277778;
                textview.setText("The value of input in inches is "+ yard);
            }
        });

        inches_miles.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String s = edittext.getText().toString();
                int inches = Integer.parseInt(s);
                double miles  = inches*(1.57828e-5);
                textview.setText("The value of input in inches is "+ miles);
            }
        });

    }
}