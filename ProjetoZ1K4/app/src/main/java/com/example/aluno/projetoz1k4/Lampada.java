package com.example.aluno.projetoz1k4;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.Switch;
import android.widget.TextView;

public class Lampada extends AppCompatActivity {

    Luz Luz;
    TextView Lampada;
    Switch Alternar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lampada);
        Luz = new Luz();
        Lampada = (TextView)findViewById(R.id.Lampada);
        Alternar = (Switch)findViewById(R.id.Alternar);
        Alternar.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(isChecked){
                    Luz.Ligar();
                } else{
                    Luz.Desligar();
                    MudarCor();
                }
            }
        });
    }

    public void BotaoAzul(View v){
        Luz.MudarCor("Azul");
        MudarCor();
    }
    public void BotaoVerde(View v){
        Luz.MudarCor("Verde");
        MudarCor();
    }
    public void BotaoVermelho(View v){
        Luz.MudarCor("Vermelho");
        MudarCor();
    }
    public void BotaoAmarelo(View v){
        Luz.MudarCor("Amarelo");
        MudarCor();
    }
    public void BotaoLaranja(View v){
        Luz.MudarCor("Laranja");
        MudarCor();
    }
    public void BotaoRoxo(View v){
        Luz.MudarCor("Roxo");
        MudarCor();
    }
    public void BotaoMaior(View v){
        Luz.AumentarTamanho("Maior");
        SizeMaior();
    }
    public void BotaoMenor(View v){
        Luz.DiminuirTamanho("Menor");
        SizeMenor();
    }
    public void BotaoPadrao(View v){
        Luz.NormalTamanho("Normal");
        SizeNormal();
    }

    public void MudarCor(){
        if(Luz.Ligado){
            switch (Luz.Cor){
                case "Azul":
                    Lampada.setTextColor(Color.parseColor("#008DFF"));
                    break;
                case "Verde":
                    Lampada.setTextColor(Color.parseColor("#33A200"));
                    break;
                case "Vermelho":
                    Lampada.setTextColor(Color.parseColor("#7B0000"));
                    break;
                case "Amarelo":
                    Lampada.setTextColor(Color.parseColor("#B5BF00"));
                    break;
                case "Laranja":
                    Lampada.setTextColor(Color.parseColor("#FF7C00"));
                    break;
                case "Roxo":
                    Lampada.setTextColor(Color.parseColor("#9A00FF"));
                    break;
            }
        }else{
            Lampada.setTextColor(Color.GRAY);
        }
    }
    public void SizeMaior(){
        switch (Luz.Size){
            case "Maior": Lampada.setTextSize(120);
        }
    }
    public void SizeMenor(){
        switch (Luz.Size){
            case "Menor": Lampada.setTextSize(40);
        }
    }
    public void SizeNormal(){
        switch (Luz.Size){
            case "Normal": Lampada.setTextSize(80);
        }
    }
}
