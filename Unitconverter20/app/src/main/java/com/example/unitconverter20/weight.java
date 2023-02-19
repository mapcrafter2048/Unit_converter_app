package com.example.unitconverter20;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class weight extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_weight);
    }
    public void pound(View view){
        Toast.makeText(this, "redirecting", Toast.LENGTH_SHORT).show();
        Intent intent = new Intent(this,pound.class);
        startActivity(intent);
    }

    public void ounce(View view){
        Toast.makeText(this, "redirecting", Toast.LENGTH_SHORT).show();
        Intent intent = new Intent(this,ounce.class);
        startActivity(intent);
    }

    public void kilogram(View view){
        Toast.makeText(this, "redirecting", Toast.LENGTH_SHORT).show();
        Intent intent = new Intent(this,kilogram.class);
        startActivity(intent);
    }

    public void gram(View view){
        Toast.makeText(this, "redirecting", Toast.LENGTH_SHORT).show();
        Intent intent = new Intent(this,gram.class);
        startActivity(intent);
    }
}