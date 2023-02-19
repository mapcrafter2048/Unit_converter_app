package com.example.unitconverter20;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Meter extends AppCompatActivity {
    private Button meter_acre_conversion, meter_heactre_conversion, meter_bigha_conversion;
    private TextView textview;
    private EditText edittext;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_meter);
        meter_acre_conversion = findViewById(R.id.meter_to_acre);
        meter_heactre_conversion = findViewById(R.id.meter_to_heactre);
        meter_bigha_conversion = findViewById(R.id.meter_to_bigha);
        textview = findViewById(R.id.meter_intro);
        edittext = findViewById(R.id.meter_output);

        meter_acre_conversion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String s = edittext.getText().toString();
                int meter = Integer.parseInt(s);
                double acre  = meter*0.000247105;
                textview.setText("The value of input in acre is "+ acre);
            }
        });

        meter_heactre_conversion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String s = edittext.getText().toString();
                int meter = Integer.parseInt(s);
                double heactre  = meter*0.0001;
                textview.setText("The value of input in heactre is "+ heactre);
            }
        });

        meter_bigha_conversion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String s = edittext.getText().toString();
                int meter = Integer.parseInt(s);
                double bigha  = meter*0.000398663;
                textview.setText("The value of input in bigha is "+ bigha);
            }
        });
    }
}
