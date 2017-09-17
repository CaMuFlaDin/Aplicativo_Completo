package com.example.aluno.projetoz1k4;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Toast toast;
    long lastBackPressTime = 0;
    Button btnTriangulo;
    Button btnNome;
    Button btnCalculadora;
    Button btnLuz;
    Button btnSobre;
    Button btnAvaliar;
    Button btnVibrar;
    Button btnConversor;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnTriangulo = (Button)findViewById(R.id.btnTriangulo);
        btnNome = (Button)findViewById(R.id.btnNome);
        btnCalculadora = (Button)findViewById(R.id.btnCalculadora);
        btnLuz = (Button)findViewById(R.id.btnLuz);
        btnSobre = (Button)findViewById(R.id.btnSobre);
        btnAvaliar = (Button)findViewById(R.id.btnAvaliar);
        btnVibrar = (Button)findViewById(R.id.btnVibrar);
        btnConversor = (Button)findViewById(R.id.btnConversor);
    }

    public void TrianguloActivity(View v) {
        Intent irTela = new Intent(MainActivity.this, Triangulo.class);
        startActivity(irTela);
    }

    public void btnNome(View v) {
        Intent irTela = new Intent(MainActivity.this, Nome.class);
        startActivity(irTela);
    }

    public void btnCalculadora(View v) {
        Intent irTela = new Intent(MainActivity.this, Calculadora.class);
        startActivity(irTela);
    }

    public void btnLuz(View v) {
        Intent irTela = new Intent(MainActivity.this, Lampada.class);
        startActivity(irTela);
    }

    public void btnSobre(View v) {
        Intent irTela = new Intent(MainActivity.this, Sobre.class);
        startActivity(irTela);
    }

    public void btnAvaliar(View v) {
        Intent irTela = new Intent(MainActivity.this, Avaliar.class);
        startActivity(irTela);
    }

    public void btnVibrar(View v) {
        Intent irTela = new Intent(MainActivity.this, Vibrar_Lanterna.class);
        startActivity(irTela);
    }
    public void btnConversor(View v) {
        Intent irTela = new Intent(MainActivity.this, Conversor.class);
        startActivity(irTela);
    }

    public void onBackPressed() {
        if (this.lastBackPressTime < System.currentTimeMillis() - 4000) {
            toast = Toast.makeText(this, "Pressione o Botão Voltar novamente para fechar o Aplicativo.", Toast.LENGTH_LONG);
            toast.show();
            this.lastBackPressTime = System.currentTimeMillis();
        } else {
            if (toast != null) {
                toast.cancel();
            }
            super.onBackPressed();
        }
    }
}
