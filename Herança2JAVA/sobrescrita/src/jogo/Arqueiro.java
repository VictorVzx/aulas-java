package jogo;

public class Arqueiro extends Personagem{
    private String arma;

    public Arqueiro(String nome) {
        super(nome);
        setClasse("Arqueiro");
        setNivel(1);
        this.arma = "Arco longo";
    }

    @Override
    public String toString() {
        String informacoes = String.format("%s (nivel: %d) - Classe: %s - Arma: %s",getNome(), getNivel(), getClasse(), arma);
        return informacoes;
    }
}
