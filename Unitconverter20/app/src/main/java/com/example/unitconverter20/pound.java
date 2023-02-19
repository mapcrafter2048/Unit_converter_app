package com.example.unitconverter20;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class pound extends AppCompatActivity {
    private Button pound_ounce, pound_kilogram, pound_gram;
    private EditText edittext;
    private TextView textview;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pound);
        pound_ounce = findViewById(R.id.parameter_7);
        pound_kilogram = findViewById(R.id.parameter_8);
        pound_gram = findViewById(R.id.parameter_9);
        textview = findViewById(R.id.weight_headline);
        edittext = findViewById(R.id.weight_output);

        pound_ounce.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String s = edittext.getText().toString();
                int pound = Integer.parseInt(s);
                double ounce = pound*16;
                textview.setText("The value of input in ounce is "+ ounce);
            }
        });

        pound_kilogram.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String s = edittext.getText().toString();
                int pound = Integer.parseInt(s);
                double kilogram = pound*0.4535;
                textview.setText("The value of input in kilogram is "+ kilogram);
            }
        });

        pound_gram.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String s = edittext.getText().toString();
                int pound = Integer.parseInt(s);
                double gram = pound*453.592;
                textview.setText("The value of input in kilogram is "+ gram);
            }
        });
    }
}