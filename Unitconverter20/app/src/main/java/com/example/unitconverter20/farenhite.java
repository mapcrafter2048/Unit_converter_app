package com.example.unitconverter20;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class farenhite extends AppCompatActivity {

    private Button farenhite_celcius, farenhite_kelvin;
    private TextView textview;
    private EditText edittext;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_farenhite);

        farenhite_celcius = findViewById(R.id.parameter_4);
        farenhite_kelvin = findViewById(R.id.parameter_5);
        textview = findViewById(R.id.temperature_headline);
        edittext = findViewById(R.id.temperature_output);

        farenhite_celcius.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String s = edittext.getText().toString();
                int farenhite = Integer.parseInt(s);
                double celcius  = (32-farenhite)*(5/9);
                textview.setText("The value of input in celcius is "+ celcius);
            }
        });

        farenhite_kelvin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String s = edittext.getText().toString();
                int  farenhite = Integer.parseInt(s);
                double kelvin  = ((32-farenhite)*(5/9))+273.15;
                textview.setText("The value of input in kelvin is "+ kelvin);
            }
        });
    }
}