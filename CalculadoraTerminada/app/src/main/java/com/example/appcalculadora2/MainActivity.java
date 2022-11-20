package com.example.appcalculadora2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    EditText edtNum1,edtNum2;
    Button btnSuma, btnResta, btnMultiplica, btnDivide;
    TextView txtResultado;
    Double num1, num2, resultado;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edtNum1 = (EditText) findViewById(R.id.edtNum1);
        edtNum2 = (EditText) findViewById(R.id.edtNum2);
        btnSuma= (Button) findViewById(R.id.btnSuma);
        btnResta= (Button) findViewById(R.id.btnResta);
        btnMultiplica= (Button) findViewById(R.id.btnMultipli);
        btnDivide= (Button) findViewById(R.id.btnDivision);
        txtResultado =(TextView) findViewById(R.id.txtResultado);

        btnSuma.setOnClickListener(this);
        btnResta.setOnClickListener(this);
        btnMultiplica.setOnClickListener(this);
        btnDivide.setOnClickListener(this);

    }

    @Override
    public void onClick(View botones) {
        switch (botones.getId()){
            case R.id.btnSuma:
                num1 = Double.parseDouble(edtNum1.getText().toString());
                num2 = Double.parseDouble(edtNum2.getText().toString());
                resultado = num1 + num2;
                txtResultado.setText(String.valueOf(resultado));
                break;

            case R.id.btnResta:
                num1 = Double.parseDouble(edtNum1.getText().toString());
                num2 = Double.parseDouble(edtNum2.getText().toString());
                resultado = num1 - num2;
                txtResultado.setText(String.valueOf(resultado));
                break;

            case R.id.btnMultipli:
                num1 =Double.parseDouble(edtNum1.getText().toString());
                num2 =Double.parseDouble(edtNum2.getText().toString());
                resultado = num1 * num2;
                txtResultado.setText(String.valueOf(resultado));
                break;

            case R.id.btnDivision:
                num1 =Double.parseDouble(edtNum1.getText().toString());
                num2 =Double.parseDouble(edtNum2.getText().toString());
                resultado = num1 /num2;
                txtResultado.setText(String.valueOf(resultado));
                break;
        }
    }
}