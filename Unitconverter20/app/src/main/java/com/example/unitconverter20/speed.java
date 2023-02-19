package com.example.unitconverter20;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class speed extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_speed);
    }
    public void kmperhr(View view){
        Toast.makeText(this, "redirecting to KM/hr", Toast.LENGTH_SHORT).show();
        Intent intent = new Intent(this,kmperhr.class);
        startActivity(intent);
    }
    public void milesperhr(View view){
        Toast.makeText(this, "redirecting to Miles/hr", Toast.LENGTH_SHORT).show();
        Intent intent = new Intent(this,milesperhr.class);
        startActivity(intent);
    }

}