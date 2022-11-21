package com.example.appcheckbox;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        CheckBox miBox = (CheckBox) findViewById(R.id.Box);

        miBox.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean pulsado) {

                if(pulsado){
                    Toast.makeText(MainActivity.this,"pulsado", Toast.LENGTH_LONG).show();
                }else{
                    Toast.makeText(MainActivity.this,"sin pulsar", Toast.LENGTH_LONG).show();
                }

            }
        });
    }
}