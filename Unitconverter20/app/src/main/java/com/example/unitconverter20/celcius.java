package com.example.unitconverter20;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class celcius extends AppCompatActivity {
    private Button celcius_farenhite, celcius_kelvin;
    private TextView textview;
    private EditText edittext;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_celcius);
        celcius_farenhite = findViewById(R.id.parameter_4);
        celcius_kelvin = findViewById(R.id.parameter_5);
        textview = findViewById(R.id.temperature_headline);
        edittext = findViewById(R.id.temperature_output);

        celcius_farenhite.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String s = edittext.getText().toString();
                int celcius = Integer.parseInt(s);
                double farenhite  = (celcius*9)/5+32;
                textview.setText("The value of input in celcius is "+ farenhite);
            }
        });

        celcius_kelvin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String s = edittext.getText().toString();
                int celcius = Integer.parseInt(s);
                double kelvin  = celcius+273.15;
                textview.setText("The value of input in kelvin is "+ kelvin);
            }
        });
    }


}