package com.example.appautocompletetextview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.MultiAutoCompleteTextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        String[] opciones = {"Opción 1", "Opción 2","Opción 3", "Opción 4", "Opción 5"};

        AutoCompleteTextView textoLeido = (AutoCompleteTextView) findViewById(R.id.campo_sugerencias);
        ArrayAdapter<String> adaptador = new ArrayAdapter<String>(this,
                android.R.layout.simple_dropdown_item_1line, opciones);
        textoLeido.setAdapter(adaptador);


        MultiAutoCompleteTextView textoLeido2 = (MultiAutoCompleteTextView) this.findViewById(R.id.multi_sugerencias);
        ArrayAdapter<String> adaptador2 = new ArrayAdapter<String>(this,
                android.R.layout.simple_dropdown_item_1line, opciones);
        textoLeido2.setTokenizer(new MultiAutoCompleteTextView.CommaTokenizer());
        textoLeido2.setAdapter(adaptador2);
    }

}