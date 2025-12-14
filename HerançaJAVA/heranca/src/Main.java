import animais.Cachorro;
import animais.Dragao;
import animais.Gato;
import animais.Pombo;

public class Main {
    public static void main (String[] args){
        Cachorro cachorro = new Cachorro("Caramelo");

        cachorro.comer();
        cachorro.latir();

        Gato bixin = new Gato("Overhand");

        bixin.comer();
        bixin.miar();

        Dragao dragao = new Dragao("Brancao");
        dragao.voar();
        dragao.soltarFogo();

        Pombo pombinho = new Pombo("Sedex");
        pombinho.enviarCarta();
        pombinho.fazerPru();
        pombinho.voar();
    }
}