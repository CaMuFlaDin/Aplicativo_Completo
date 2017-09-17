package com.example.aluno.projetoz1k4;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Nome extends AppCompatActivity {

    EditText nome;
    TextView erro;
    String mensagemErro;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nome);

        nome = (EditText) findViewById(R.id.nome);
        erro = (TextView) findViewById(R.id.erro);
        mensagemErro = "Erro! Digite algo! :)";
    }

    public void MostrarNome(View v){
        String name = nome.getText().toString().trim();
        Intent mudar = new Intent(this, MostrarNome.class);
        Bundle extra = new Bundle();
        if(name.equals("")) {
            erro.setText(mensagemErro);
        }else{
            extra.putString("name", name);
            mudar.putExtras(extra);
            startActivity(mudar);
        }
    }
}
