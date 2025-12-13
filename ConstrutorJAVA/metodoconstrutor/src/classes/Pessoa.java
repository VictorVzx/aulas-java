package classes;

public class Pessoa {
    int id;
    private String nome;
    private int idade;
    private float altura;

    //construtor
    public Pessoa(String nome, int idade, float altura) {
        System.out.println("Uma pessoa acaba de nascer! Parabéns!");
        this.nome = nome;
        this.idade = idade;
        this.altura = altura;
    }


    public void imprimirDados() {
        System.out.format("Nome: %s, Idade: %d, Altura: %.2fm", nome, idade, altura);
    }

    // getters e setters


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }
}
