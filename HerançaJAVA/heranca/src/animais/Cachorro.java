package animais;

public class Cachorro extends Animal{

    public Cachorro(String nome){
        super(nome);
    }

    public void latir() {
        System.out.format("%s latiu!\n", getNome());
    }

    public void lamber(){
        System.out.format("%s lambeu!\n", getNome());
    }
}
