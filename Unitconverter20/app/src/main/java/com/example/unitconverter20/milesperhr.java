package com.example.unitconverter20;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class milesperhr extends AppCompatActivity {
    private Button milesperhr_kmperhr;
    private EditText edittext;
    private TextView textview;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_milesperhr);
        milesperhr_kmperhr = findViewById(R.id.parameter_6);
        textview = findViewById(R.id.speed_headline);
        edittext = findViewById(R.id.speed_output);

        milesperhr_kmperhr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String s = edittext.getText().toString();
                int milesperhr = Integer.parseInt(s);
                double kmperhr  = milesperhr*1.60934;
                textview.setText("The value of input in km/hr is "+ kmperhr);
            }
        });
    }
}