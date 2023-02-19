package com.example.unitconverter20;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Yard extends AppCompatActivity {

    private Button yard_inches, yard_feet, yard_miles;
    private TextView textview;
    private EditText edittext;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_yard);
        yard_inches = findViewById(R.id.parameter_1);
        yard_feet = findViewById(R.id.parameter_2);
        yard_miles = findViewById(R.id.parameter_3);
        textview = findViewById(R.id.lenght_headline);
        edittext = findViewById(R.id.lenght_outplut);

        yard_feet.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String s = edittext.getText().toString();
                int yard = Integer.parseInt(s);
                double feet  = yard*3;
                textview.setText("The value of input in feet is "+ feet);
            }
        });

        yard_inches.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String s = edittext.getText().toString();
                int yard = Integer.parseInt(s);
                double inches  = yard*36;
                textview.setText("The value of input in inches is "+ inches);
            }
        });

        yard_miles.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String s = edittext.getText().toString();
                int yard = Integer.parseInt(s);
                double miles  = yard*0.000568182;
                textview.setText("The value of input in inches is "+ miles);
            }
        });
    }
}