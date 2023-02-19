package com.example.unitconverter20;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class area extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_area);
    }
    public void meter(View view) {
        Toast.makeText(this, "redirecting ", Toast.LENGTH_SHORT).show();
        Intent intent = new Intent(this, Meter.class);
        startActivity(intent);
    }
    public void acre(View view) {
        Toast.makeText(this, "redirecting ", Toast.LENGTH_SHORT).show();
        Intent intent = new Intent(this, Acre.class);
        startActivity(intent);
    }
    public void heactre(View view){
        Toast.makeText(this, "redirecting ", Toast.LENGTH_SHORT).show();
        Intent intent = new Intent(this, Heactre.class);
        startActivity(intent);
    }

    public void bigha(View view) {
        Toast.makeText(this, "redirecting ", Toast.LENGTH_SHORT).show();
        Intent intent = new Intent(this, Bigha.class);
        startActivity(intent);
    }
}
