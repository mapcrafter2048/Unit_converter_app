package com.example.unitconverter20;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class kmperhr extends AppCompatActivity {
    private Button kmperhr_milesperhr;
    private EditText edittext;
    private TextView textview;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kmperhr);
        kmperhr_milesperhr = findViewById(R.id.parameter_6);
        textview = findViewById(R.id.speed_headline);
        edittext = findViewById(R.id.speed_output);

        kmperhr_milesperhr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String s = edittext.getText().toString();
                int kmperhr = Integer.parseInt(s);
                double milesperhr  = kmperhr*0.621371;
                textview.setText("The value of input in Miles/hr is "+ milesperhr);
            }
        });



    }
}