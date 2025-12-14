package animais;

public class Voador extends Animal{
    private String nome;

    public Voador(String nome){
        super(nome);
    }

    public void voar(){
        System.out.format("%s voou!\n", getNome());
    }
}
