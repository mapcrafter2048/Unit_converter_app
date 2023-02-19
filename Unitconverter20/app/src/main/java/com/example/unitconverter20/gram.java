package com.example.unitconverter20;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class gram extends AppCompatActivity {
    private Button gram_ounce, gram_kilogram, gram_pounds;
    private EditText edittext;
    private TextView textview;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gram);
        gram_ounce = findViewById(R.id.parameter_7);
        gram_kilogram = findViewById(R.id.parameter_8);
        gram_pounds = findViewById(R.id.parameter_9);
        textview = findViewById(R.id.weight_headline);
        edittext = findViewById(R.id.weight_output);

        gram_ounce.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String s = edittext.getText().toString();
                int gram = Integer.parseInt(s);
                double ounce = gram*0.03527;
                textview.setText("The value of input in ounce is "+ ounce);
            }
        });

        gram_kilogram.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String s = edittext.getText().toString();
                int gram = Integer.parseInt(s);
                double kilogram = gram*0.001;
                textview.setText("The value of input in kilogram is "+ kilogram);
            }
        });

        gram_pounds.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String s = edittext.getText().toString();
                int gram = Integer.parseInt(s);
                double pound = gram*0.00220462;
                textview.setText("The value of input in pound is "+ pound);
            }
        });

    }
}