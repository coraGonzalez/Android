package com.example.ac_eval_241_cora;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    ImageButton btn1, btn2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn1 = (ImageButton) findViewById(R.id.imageButton);
        btn2 = (ImageButton) findViewById(R.id.imageButton2);
        btn1.setOnClickListener(this);
        btn2.setOnClickListener(this);
    }

    @Override
    public void onClick(View botones) {
        switch(botones.getId()){

            case R.id.imageButton:
                Intent i1 = new Intent(this,Activity1.class);
                startActivity(i1);
                break;
            case R.id.imageButton2:
                Intent i2 = new Intent(this, Activity2.class);
                startActivity(i2);
                break;

        }
        }

    }

