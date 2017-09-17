package com.example.aluno.projetoz1k4;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Triangulo extends AppCompatActivity {

    EditText Triangulo1;
    EditText Triangulo2;
    EditText Triangulo3;
    TextView ResultadoTriangulo;
    Button BtnTriangulo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_triangulo);

        Triangulo1 = (EditText) findViewById(R.id.edtTriangulo1);
        Triangulo2 = (EditText) findViewById(R.id.edtTriangulo2);
        Triangulo3 = (EditText) findViewById(R.id.edtTriangulo3);
        BtnTriangulo = (Button) findViewById(R.id.btnTriangulo);
        ResultadoTriangulo = (TextView) findViewById(R.id.ResultadoTriangulo);
    }

    public void Triangulo(View v){
        Double f1, f2, f3;
        f1 = Double.parseDouble(Triangulo1.getText().toString().trim());
        f2 = Double.parseDouble(Triangulo2.getText().toString().trim());
        f3 = Double.parseDouble(Triangulo3.getText().toString().trim());

        if((f1 < (f2 + f3)) && (f2 < ( f1 + f3)) && (f3 < (f1 + f2))){
            if((f1 .equals (f2)) && (f2 .equals (f3))){
                ResultadoTriangulo.setText("Essas medidas formam um triângulo equilátero");
            }
            else if((f1 .equals (f2)) || (f2 .equals (f3)) || (f1 .equals (f3))){
                ResultadoTriangulo.setText("Essas medidas formam um triângulo isósceles");
            }
            else {
                ResultadoTriangulo.setText("Essas medidas formam um triângulo escaleno");
            }
        }else{
            ResultadoTriangulo.setText("Não é um triângulo");
        }
    }
}
