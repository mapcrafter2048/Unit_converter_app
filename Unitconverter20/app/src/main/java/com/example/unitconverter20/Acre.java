package com.example.unitconverter20;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Acre extends AppCompatActivity {
    private Button meter_conversion, heactre_conversion, bigha_conversion;
    private TextView textview;
    private EditText edittext;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_acre);
        meter_conversion = findViewById(R.id.acre_meter);
        heactre_conversion = findViewById(R.id.acre_heactre);
        bigha_conversion = findViewById(R.id.acre_bigha);
        textview = findViewById(R.id.acre_intro);
        edittext = findViewById(R.id.acre_output);
        meter_conversion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String s = edittext.getText().toString();
                int acre = Integer.parseInt(s);
                double meter  = acre*4046.86;
                textview.setText("The value of input in meter sqaure is "+ meter);
            }
        });

        heactre_conversion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String s = edittext.getText().toString();
                int acre = Integer.parseInt(s);
                double heactre  = acre*0.404686;
                textview.setText("The value of input in heactre is "+ heactre);
            }
        });

        bigha_conversion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String s = edittext.getText().toString();
                int acre = Integer.parseInt(s);
                double bigha  = acre*1.613334;
                textview.setText("The value of input in bigha is "+ bigha);
            }
        });

    }
}