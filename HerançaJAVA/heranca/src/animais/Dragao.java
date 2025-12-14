package animais;

public class Dragao extends Voador{
    public Dragao(String nome) {
        super(nome);
    }

    public void soltarFogo(){
        System.out.format("%s soltou fogo!\n", getNome());
    }
}
