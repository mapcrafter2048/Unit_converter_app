package com.example.unitconverter20;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class kilogram extends AppCompatActivity {
    private Button kilogram_ounce, kilogram_pound, kilogram_gram;
    private EditText edittext;
    private TextView textview;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kilogram);
        kilogram_ounce = findViewById(R.id.parameter_7);
        kilogram_pound = findViewById(R.id.parameter_8);
        kilogram_gram = findViewById(R.id.parameter_9);
        textview = findViewById(R.id.weight_headline);
        edittext = findViewById(R.id.weight_output);

        kilogram_ounce.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String s = edittext.getText().toString();
                int kilogram = Integer.parseInt(s);
                double ounce = kilogram*35.274;
                textview.setText("The value of input in ounce is "+ ounce);
            }
        });

        kilogram_pound.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String s = edittext.getText().toString();
                int kilogram = Integer.parseInt(s);
                double pound = kilogram*35.274;
                textview.setText("The value of input in pound is "+ pound);
            }
        });

        kilogram_gram.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String s = edittext.getText().toString();
                int kilogram = Integer.parseInt(s);
                double gram = kilogram*1000;
                textview.setText("The value of input in gram is "+ gram);
            }
        });
    }
}