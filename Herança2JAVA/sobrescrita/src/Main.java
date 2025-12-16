import jogo.Arqueiro;
import jogo.Personagem;

public class Main {
    public static void main (String[] args){
        Personagem personagem = new Personagem("João");
        System.out.println(personagem);

        Arqueiro arqueiro = new Arqueiro("Robin");
        System.out.println(arqueiro);
    }
}