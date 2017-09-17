package com.example.aluno.projetoz1k4;

/**
 * Created by CaMuFlaDin on 20/08/2017.
 */

public class Luz {
    String Cor = "Cinza";
    String Size = "Size";
    Boolean Ligado = true;


    public void MudarCor(String Alterar){
        this.Cor = Alterar;
    }
    public void AumentarTamanho(String Size){
        this.Size = Size;
    }
    public void DiminuirTamanho(String Size){
        this.Size = Size;
    }
    public void NormalTamanho(String Size){

        this.Size = Size;
    }
    public void Ligar(){
        this.Ligado = true;
    }
    public void Desligar(){
        this.Ligado = false;
    }
}

