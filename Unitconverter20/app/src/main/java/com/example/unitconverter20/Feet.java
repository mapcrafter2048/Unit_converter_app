package com.example.unitconverter20;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Feet extends AppCompatActivity {
    private Button feet_inches, feet_yard, feet_miles;
    private TextView textview;
    private EditText edittext;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_feet);
        feet_inches = findViewById(R.id.parameter_1);
        feet_yard = findViewById(R.id.parameter_2);
        feet_miles = findViewById(R.id.parameter_3);
        textview = findViewById(R.id.lenght_headline);
        edittext = findViewById(R.id.lenght_outplut);

        feet_inches.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String s = edittext.getText().toString();
                int feet = Integer.parseInt(s);
                double inches  = feet*12;
                textview.setText("The value of input in inches is "+ inches);
            }
        });

        feet_yard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String s = edittext.getText().toString();
                int feet = Integer.parseInt(s);
                double yard  = feet*0.33333333;
                textview.setText("The value of input in yard is "+ yard);
            }
        });

        feet_miles.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String s = edittext.getText().toString();
                int feet = Integer.parseInt(s);
                double miles  = feet*0.0001893;
                textview.setText("The value of input in miles is "+ miles);
            }
        });



    }
}