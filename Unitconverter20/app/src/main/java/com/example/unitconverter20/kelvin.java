package com.example.unitconverter20;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class kelvin extends AppCompatActivity {
    private Button kelvin_farenhite, kelvin_celcius;
    private TextView textview;
    private EditText edittext;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kelvin);
        kelvin_farenhite = findViewById(R.id.parameter_4);
        kelvin_celcius = findViewById(R.id.parameter_5);
        textview = findViewById(R.id.temperature_headline);
        edittext = findViewById(R.id.temperature_output);

        kelvin_farenhite.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String s = edittext.getText().toString();
                int kelvin = Integer.parseInt(s);
                double farenhite  = (kelvin-273.15)*(9/5)+32;
                textview.setText("The value of input in farenhite is "+ farenhite);
            }
        });

        kelvin_celcius.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String s = edittext.getText().toString();
                int kelvin = Integer.parseInt(s);
                double celcius  = kelvin-273.15;
                textview.setText("The value of input in celcius is "+ celcius);
            }
        });
    }

}