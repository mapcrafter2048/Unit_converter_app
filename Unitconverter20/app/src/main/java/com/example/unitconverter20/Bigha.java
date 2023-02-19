package com.example.unitconverter20;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Bigha extends AppCompatActivity {
    private Button bigha_meter, bigha_acre, bigha_heactre;
    private TextView textview;
    private EditText edittext;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bigha);
        bigha_meter = findViewById(R.id.bigha_meter);
        bigha_acre = findViewById(R.id.bigha_acre);
        bigha_heactre = findViewById(R.id.bigha_heactre);
        textview = findViewById(R.id.bigha_intro);
        edittext = findViewById(R.id.bigha_output);

        bigha_meter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String s = edittext.getText().toString();
                int bigha = Integer.parseInt(s);
                double meter  = bigha*2508.38;
                textview.setText("The value of input in meter sqaure is "+ meter);
            }
        });

        bigha_acre.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String s = edittext.getText().toString();
                int bigha = Integer.parseInt(s);
                double acre  = bigha*0.3306;
                textview.setText("The value of input in acre is "+ acre);
            }
        });

        bigha_heactre.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String s = edittext.getText().toString();
                int bigha = Integer.parseInt(s);
                double heactre  = bigha*0.250838;
                textview.setText("The value of input in hectares is "+ heactre);
            }
        });
    }
}