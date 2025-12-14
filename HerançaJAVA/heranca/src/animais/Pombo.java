package animais;

public class Pombo extends Voador{
    private int cartasEnviadas;

    public Pombo(String nome) {
        super(nome);
    }

    public void fazerPru(){
        System.out.format("%s fez Pru!\n", getNome());
    }

    public void enviarCarta(){
        System.out.format("%s enviou uma carta!\n", getNome());
        cartasEnviadas++;
    }

    public int getCartasEnviadas() {
        return cartasEnviadas;
    }
}
