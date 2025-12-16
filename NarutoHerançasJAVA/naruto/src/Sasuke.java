import habilidades.Sharingan;

public class Sasuke extends Sharingan {
    private String nome;
    private int idade;
    private int forca;

    public Sasuke(){
        nome = "Sasuke";
        idade = 18;
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public int getForca() {
        return forca;
    }

    public void setForca(int forca) {
        this.forca = forca;
    }
}
