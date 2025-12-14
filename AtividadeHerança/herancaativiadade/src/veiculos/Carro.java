package veiculos;

public class Carro extends Veiculo{
    private String nome;
    private int velocidade;

    public Carro(String nome) {
        super(nome);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void velocidade() {
        this.velocidade = 100;
    }

    public void setVelocidade(int velocidade) {
        this.velocidade = velocidade;
    }
}
