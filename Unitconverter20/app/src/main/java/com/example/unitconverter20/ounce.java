package com.example.unitconverter20;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class ounce extends AppCompatActivity {
    private Button ounce_pound, ounce_kilogram, ounce_gram;
    private EditText edittext;
    private TextView textview;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ounce);
        ounce_pound = findViewById(R.id.parameter_7);
        ounce_kilogram = findViewById(R.id.parameter_8);
        ounce_gram = findViewById(R.id.parameter_9);
        textview = findViewById(R.id.weight_headline);
        edittext = findViewById(R.id.weight_output);

        ounce_pound.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String s = edittext.getText().toString();
                int ounce = Integer.parseInt(s);
                double pound = ounce*0.0625;
                textview.setText("The value of input in pound is "+ pound);
            }
        });

        ounce_kilogram.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String s = edittext.getText().toString();
                int ounce = Integer.parseInt(s);
                double kilogram = ounce*0.02834;
                textview.setText("The value of input in kilogram is "+ kilogram);
            }
        });

        ounce_gram.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String s = edittext.getText().toString();
                int ounce = Integer.parseInt(s);
                double gram = ounce*28.3495;
                textview.setText("The value of input in gram is "+ gram);
            }
        });
    }
}