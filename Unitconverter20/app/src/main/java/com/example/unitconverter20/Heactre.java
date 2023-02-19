package com.example.unitconverter20;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Heactre extends AppCompatActivity {
    private Button heactre_meter, heactre_acre, heactre_bigha;
    private TextView textview;
    private EditText edittext;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_heactre);
        heactre_meter = findViewById(R.id.heactre_meter);
        heactre_acre = findViewById(R.id.heactre_acre);
        heactre_bigha = findViewById(R.id.heactre_bigha);
        textview = findViewById(R.id.heactre_intro);
        edittext = findViewById(R.id.heactre_output);

        heactre_meter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String s = edittext.getText().toString();
                int heactre = Integer.parseInt(s);
                double meter = heactre*10000;
                textview.setText("The value of input in meter sqaure is "+ meter);
            }
        });

        heactre_acre.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String s = edittext.getText().toString();
                int heactre = Integer.parseInt(s);
                double acre  = heactre*2.47105;
                textview.setText("The value of input in acre is "+ acre);
            }
        });

        heactre_bigha.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String s = edittext.getText().toString();
                int heactre = Integer.parseInt(s);
                double bigha  = heactre*3.986633;
                textview.setText("The value of input in bigha is "+ bigha);
            }
        });
    }
}