package com.example.ac_eval_241_cora;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.view.inputmethod.EditorInfo;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Activity2 extends AppCompatActivity {
Button btnvolver;
EditText edtBuscar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);

        btnvolver = (Button) findViewById(R.id.btnVolver2);
        edtBuscar = (EditText) findViewById(R.id.txtLine2);

        edtBuscar.setOnEditorActionListener(new TextView.OnEditorActionListener() {
            @Override
            public boolean onEditorAction(TextView textView, int boton, KeyEvent keyEvent) {
                if(boton == EditorInfo.IME_ACTION_SEARCH){
                    Toast.makeText(getApplicationContext(), "buscar: " + textView, Toast.LENGTH_LONG).show();
                    return true;
                }
                return false;
            }
        });



        btnvolver.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent mainPrincipal = new Intent(Activity2.this, MainActivity.class);
                startActivity(mainPrincipal);
            }
        });

    }
}