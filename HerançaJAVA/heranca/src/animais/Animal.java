package animais;

public class Animal {
    private String nome;

    public Animal(String nome){
        this.nome = nome;
    }

    public void comer(){
        System.out.format("%s comeu\n", nome);
    }

    public void beber(){
        System.out.format("%s comeu\n", nome);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
