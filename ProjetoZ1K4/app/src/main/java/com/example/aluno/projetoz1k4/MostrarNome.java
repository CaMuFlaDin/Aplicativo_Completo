package com.example.aluno.projetoz1k4;

import android.content.Intent;
import android.media.MediaPlayer;
import android.provider.MediaStore;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MostrarNome extends AppCompatActivity {

    TextView seuNome;
    String definido;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mostrar_nome);
        seuNome = (TextView) findViewById(R.id.seuNome);
        Intent recebidos = getIntent();
        if(recebidos != null){
            Bundle nome = recebidos.getExtras();
            if(nome != null){
                String nomeRecebido = nome.getString("name");
                if(nomeRecebido != null){
                    switch(nomeRecebido){ //MEMES
                        case "Bom dia":
                            definido = "Boa Noite :)";
                            break;
                        case "Boa tarde":
                            definido = "Bom Dia :)";
                            break;
                        case "Boa noite":
                            definido = "Boa Tarde :)";
                            break;
                        case "The Game":
                            definido = "Perdi :(";
                            break;
                        case "O Jogo":
                            definido = "Perdi :(";
                            break;
                        case "Suco":
                            definido = "Suco de Maracujá";
                            MediaPlayer ring = MediaPlayer.create(MostrarNome.this,R.raw.maracuja);
                            ring.start();
                            break;
                        case "Yoda":
                            definido = "Fon";
                            MediaPlayer ring1 = MediaPlayer.create(MostrarNome.this,R.raw.fon);
                            ring1.start();
                            break;
                        case "Irineu":
                            definido = "Você não sabe e nem eu";
                            MediaPlayer ring2 = MediaPlayer.create(MostrarNome.this,R.raw.irineu);
                            ring2.start();
                            break;
                        case "Duvido":
                            definido = "Meu pau no seu ouvido";
                            break;
                        case "Gemidao":
                            definido = "Ops! >:)";
                            MediaPlayer ring3 = MediaPlayer.create(MostrarNome.this,R.raw.gemidao);
                            ring3.start();
                            break;
                        case "Caio":
                            definido = "Closer";
                            MediaPlayer ring4 = MediaPlayer.create(MostrarNome.this,R.raw.closer);
                            ring4.start();
                            break;
                        case "Foca":
                            definido = "Lucas Neto?";
                            MediaPlayer ring5 = MediaPlayer.create(MostrarNome.this,R.raw.foca);
                            ring5.start();
                            break;
                        default:
                            definido = nomeRecebido;
                            break;
                    }
                    setNome(definido);
                }
            }
        }
    }
    public void setNome(String nomePego){
        seuNome.setText(nomePego);
    }
}
