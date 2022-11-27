package com.example.ac_eval_241_cora;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Activity1 extends AppCompatActivity {
    Button btn1Volver;
    TextView contador;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_1);


        EditText letras = (EditText) findViewById(R.id.txtMultiline);
        contador = (TextView) findViewById(R.id.txtContador);
        btn1Volver = (Button) findViewById(R.id.btnVolver1);


        letras.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void afterTextChanged(Editable editable) {
                String longitud = String.valueOf(editable.length());

            contador.setText(String.valueOf(longitud));

            }
        });

        btn1Volver.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent mainPrincipal = new Intent(Activity1.this, MainActivity.class);
                startActivity(mainPrincipal);
            }
        });


    }
}