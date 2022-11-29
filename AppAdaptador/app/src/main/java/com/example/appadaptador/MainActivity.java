package com.example.appadaptador;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Datos [] datos = new  Datos[]{
                new Datos("Linea Superior 1", "Linea Inferior 1"),
                new Datos("Linea Superior 2", "Linea Inferior 2"),
                new Datos("Linea Superior 3", "Linea Inferior 3"),
                new Datos("Linea Superior 4", "Linea Inferior 4"),
                new Datos("Linea Superior 5", "Linea Inferior 5"),
                new Datos("Linea Superior 6", "Linea Inferior 6"),
                new Datos("Linea Superior ", "Linea Inferior 7"),
        };


        ListView listado = (ListView) findViewById(R.id.miLista);
        Adaptador miAdaptador = new Adaptador(this, datos);
        listado.setAdapter(miAdaptador);

        listado.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
                String seleccionado = ((Datos) adaptador.getItemAtPosition(position)).getTexto1();
                Toast.makeText(MainActivity.this, seleccionado, Toast.LENGTH_LONG);
            }
        });





    }

  /*  ArrayList<Datos> datos2 = new ArrayList<Datos>();
    datos2.add(new Datos ("Linea Superior 1", "Linea Inferior 1"));
    datos2.add(new Datos ("Linea Superior 2", "Linea Inferior 2"));
    datos2.add(new Datos ("Linea Superior 3", "Linea Inferior 3"));
    datos2.add(new Datos ("Linea Superior 4", "Linea Inferior 4"));
    */



}