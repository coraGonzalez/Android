package com.example.appmanejobotones;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    Button btn1, btn2, btn3;
    TextView txtMensaje;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn1= (Button) findViewById(R.id.btn1);
        btn2= (Button) findViewById(R.id.btn2);
        btn3= (Button) findViewById(R.id.btn3);

        txtMensaje = (TextView) findViewById(R.id.txtMensaje);

        // Hago que el propio botón escuche su evento onclic

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txtMensaje.setText("Boton 2");
            }
        });

        // Hago que la activity implemente el escuchador

        btn3.setOnClickListener(this);
    }
    // Creo metodo para asociarle la funcionalidad al boton en el diseño  (XML -> onClic)
    public void pulsarBoton1 (View btn){
        txtMensaje.setText("Boton 1");
    }

    @Override
    public void onClick(View botones) {
            switch (botones.getId()){

                case R.id.btn3:
                    txtMensaje.setText("Boton 3");
                    break;

            }
    }
}