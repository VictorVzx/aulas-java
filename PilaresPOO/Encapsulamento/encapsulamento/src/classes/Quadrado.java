package classes;

public class Quadrado {
    //Atributo
    private int lado;


    //Construtor
    public Quadrado(int lado){
        this.lado = lado;
    }

    //Metodo especifico
    public double gerarArea(){
        return Math.pow(lado, 2);

    }
    //Getter e setter

    public int getLado() {
        return lado;
    }

    public void setLado(int lado) {
        this.lado = lado;
    }
}
