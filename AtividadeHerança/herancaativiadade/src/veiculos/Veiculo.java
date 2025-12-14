package veiculos;

public class Veiculo {
    private String nome;
    private int velocidade;

    public Veiculo(String nome){
        this.nome = nome;
        this.velocidade = 100;
    }

    public void andar(){
        System.out.format("%s andou numa velocidade de %dKM/h", nome, velocidade);
    }
}
