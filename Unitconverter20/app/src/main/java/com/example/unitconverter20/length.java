package com.example.unitconverter20;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class length extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_length);
    }
    public void feet(View view){
        Toast.makeText(this, "redirecting  ", Toast.LENGTH_SHORT).show();
        Intent intent = new Intent(this,Feet.class);
        startActivity(intent);
    }

    public void inch(View view){
        Toast.makeText(this, "redirecting  ", Toast.LENGTH_SHORT).show();
        Intent intent = new Intent(this,Inches.class);
        startActivity(intent);
    }

    public void yard(View view){
        Toast.makeText(this, "redirecting  ", Toast.LENGTH_SHORT).show();
        Intent intent = new Intent(this,Yard.class);
        startActivity(intent);
    }

    public void miles(View view){
        Toast.makeText(this, "redirecting ", Toast.LENGTH_SHORT).show();
        Intent intent = new Intent(this,Miles.class);
        startActivity(intent);
    }
}