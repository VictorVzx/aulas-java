package classes;

public class Pessoas {
    private String nome = "João";
    private int idade = 5;
    private double altura = 1.77;

    //getter
    public String getNome() {
        return nome;
    }

    //setter
    public void setNome(String nome) {
        // this se refere à variavel da classe, this.nome = variavel da classe, nome = variavel do metodo
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade){
        this.idade = idade;
    }

    public double getAltura(){
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    // resumidamente: getters pegam e setters modificam um valor

}
