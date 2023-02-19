package com.example.unitconverter20;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Miles extends AppCompatActivity {

    private Button miles_inches, miles_yard, miles_feet;
    private TextView textview;
    private EditText edittext;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_miles);
        miles_inches = findViewById(R.id.parameter_1);
        miles_yard = findViewById(R.id.parameter_2);
        miles_feet = findViewById(R.id.parameter_3);
        textview = findViewById(R.id.lenght_headline);
        edittext = findViewById(R.id.lenght_outplut);

        miles_inches.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String s = edittext.getText().toString();
                int miles = Integer.parseInt(s);
                double inches  = miles*63360;
                textview.setText("The value of input in inches is "+ inches);
            }
        });

        miles_yard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String s = edittext.getText().toString();
                int miles = Integer.parseInt(s);
                double yard  = miles*1760;
                textview.setText("The value of input in yard is "+ yard);
            }
        });

        miles_feet.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String s = edittext.getText().toString();
                int miles = Integer.parseInt(s);
                double feet  = miles*5280;
                textview.setText("The value of input in inches is "+ feet);
            }
        });
    }
}