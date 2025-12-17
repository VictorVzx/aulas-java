package jogo;

import java.util.Random;

public abstract class Personagem {
    public void atacar(){}

    protected int jogarDado(){
        Random dado = new Random();
        int resultado = dado.nextInt(6);
        return resultado;
    }
}

