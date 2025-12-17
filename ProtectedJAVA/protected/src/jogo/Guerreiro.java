package jogo;

public class Guerreiro extends Personagem {
    @Override
    public void atacar() {
        int valorDado = this.jogarDado();
        System.out.printf("Você acertou um %d no dado ", valorDado);
        if(valorDado < 3){
            System.out.println("O guerreiro errou o ataque!");
        } else if (valorDado == 6) {
            System.out.println("O guerreiro acertou um golpe especial!");
        } else {
            System.out.println("O guerreiro acertou o inimigo!");
        }
    }
}
