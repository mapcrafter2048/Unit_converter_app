package com.example.unitconverter20;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class temperature extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_temperature);
    }

    public void celcius(View view){
        Toast.makeText(this, "redirecting to celcius", Toast.LENGTH_SHORT).show();
        Intent intent = new Intent(this, celcius.class);
        startActivity(intent);
    }

    public void farenhite(View view){
        Toast.makeText(this, "redirecting to farenhite", Toast.LENGTH_SHORT).show();
        Intent intent = new Intent(this, farenhite.class);
        startActivity(intent);
    }
    public void kelvin(View view){
        Toast.makeText(this, "redirecting to kelvin", Toast.LENGTH_SHORT).show();
        Intent intent = new Intent(this, kelvin.class);
        startActivity(intent);
    }
}