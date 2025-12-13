package classes;

public class Circulo {

    //Atributos
    private int raio;

    //Construtor
    public Circulo(int raio){
        this.raio = raio;
    }
    //Metodos especificos da classe
    public double calcularArea(){
        return Math.PI * Math.pow(raio, 2);
    }

    //Getters e Setters
    public int getRaio() {
        return raio;
    }

    public void setRaio(int raio) {
        this.raio = raio;
    }
}
