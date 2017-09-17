package com.example.aluno.projetoz1k4;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Calculadora extends AppCompatActivity {

    EditText n1;
    EditText n2;
    TextView Resultado;
    Button BtnSoma;
    Button BtnSub;
    Button BtnMulti;
    Button BtnDiv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculadora);

        n1 = (EditText) findViewById(R.id.edtNumero1);
        n2 = (EditText) findViewById(R.id.edtNumero2);
        BtnSoma = (Button) findViewById(R.id.btnSomar);
        BtnSub = (Button) findViewById(R.id.btnSubtrair);
        BtnMulti = (Button) findViewById(R.id.btnMultiplicar);
        BtnDiv = (Button) findViewById(R.id.btnDividir);
        Resultado = (TextView) findViewById(R.id.Resultado);
    }

    public void Somar(View v){
        Float f1, f2, f3;
        f1 = Float.parseFloat(n1.getText().toString().trim());
        f2 = Float.parseFloat(n2.getText().toString().trim());

        f3 = f1 + f2;
        Resultado.setText(f3.toString());
    }
    public void Subtrair(View v){
        Float f1, f2, f3;
        f1 = Float.parseFloat(n1.getText().toString().trim());
        f2 = Float.parseFloat(n2.getText().toString().trim());

        f3 = f1 - f2;
        Resultado.setText(f3.toString());
    }
    public void Multiplicar(View v){
        Float f1, f2, f3;
        f1 = Float.parseFloat(n1.getText().toString().trim());
        f2 = Float.parseFloat(n2.getText().toString().trim());

        f3 = f1 * f2;
        Resultado.setText(f3.toString());
    }
    public void Dividir(View v){
        Float f1, f2, f3;
        f1 = Float.parseFloat(n1.getText().toString().trim());
        f2 = Float.parseFloat(n2.getText().toString().trim());

        f3 = f1 / f2;
        Resultado.setText(f3.toString());
    }

}