package com.example.appbutton1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Actividad1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_actividad1);
    }
    public void btn1(View view){
        Intent i= new Intent(this, MainActivity.class);
        startActivity(i);
    }

    public void btn2(View view){
        Intent i= new Intent(this, Actividad2.class);
        startActivity(i);
    }

    public void btn3(View view){
        Intent i= new Intent(this, Actividad3.class);
        startActivity(i);
    }


}