import habilidades.Hasengan;

public class Naruto extends Hasengan {
    private String nome;
    private int idade;
    private int forca;

    public Naruto(){
        nome = "Naruto";
        idade = 20;
    }

    public String getNome(){
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
