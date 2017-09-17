package com.example.aluno.projetoz1k4;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.RadioButton;
import android.widget.RatingBar;
import android.widget.TextView;
import android.widget.Toast;

import static com.example.aluno.projetoz1k4.R.id.r1;

public class Avaliar extends AppCompatActivity {

    RatingBar rb;
    RadioButton r1, r2;
    CheckBox Robs, Hilosi;
    TextView TextMemes, TextProf;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_avaliar);

        rb = (RatingBar)findViewById(R.id.rb1);
        r1 = (RadioButton)findViewById(R.id.r1);
        r2 = (RadioButton)findViewById(R.id.r2);
        Robs = (CheckBox)findViewById(R.id.primeiro);
        Hilosi = (CheckBox)findViewById(R.id.segundo);
        TextMemes = (TextView)findViewById(R.id.TextMemes);
        TextProf = (TextView)findViewById(R.id.TextProf);
    }

    public void verificar(View v){
        double quantidadeEstrelas = (double) rb.getRating();
        String mensagem;

        if(quantidadeEstrelas == 1){
            mensagem = "Horrível";
        }else if(quantidadeEstrelas == 2){
            mensagem = "Ruim";
        }else if(quantidadeEstrelas == 3){
            mensagem = "Médio";
        }else if(quantidadeEstrelas == 4){
            mensagem = "Bom";
        }else{
            mensagem = "Perfeito";
        }
        Toast.makeText(this, mensagem, Toast.LENGTH_SHORT).show();

        if(r1.isChecked()){
            TextMemes.setText("Sim!");
        }
        else if(r2.isChecked()){
            TextMemes.setText("Não!");
        }
        else{
            TextMemes.setText("Sem opinião!");
        }

        if(Robs.isChecked() && Hilosi.isChecked()){
            TextProf.setText("Você conhece os dois!");
        }
        else if(Robs.isChecked() || Hilosi.isChecked()){
            TextProf.setText("Você só conhece um!");
        }
        else{
            TextProf.setText("Nenhum!");
        }
    }

}
