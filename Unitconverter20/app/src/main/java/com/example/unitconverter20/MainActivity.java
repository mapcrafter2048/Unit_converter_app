package com.example.unitconverter20;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void weight(View view){
        Toast.makeText(this, "redirecting to weights", Toast.LENGTH_SHORT).show();
        Intent intent = new Intent(this, weight.class);
        startActivity(intent);
    }
    public void area(View view){
        Toast.makeText(this, "redirecting to area", Toast.LENGTH_SHORT).show();
        Intent intent = new Intent(this, area.class);
        startActivity(intent);
    }
    public void length(View view){
        Toast.makeText(this, "redirecting to length", Toast.LENGTH_SHORT).show();
        Intent intent = new Intent(this, length.class);
        startActivity(intent);
    }
    public void speed(View view){
        Toast.makeText(this, "redirecting to speed", Toast.LENGTH_SHORT).show();
        Intent intent = new Intent(this, speed.class);
        startActivity(intent);
    }
    public void temperature(View view){
        Toast.makeText(this, "redirecting to temperature", Toast.LENGTH_SHORT).show();
        Intent intent = new Intent(this, temperature.class);
        startActivity(intent);
    }
}