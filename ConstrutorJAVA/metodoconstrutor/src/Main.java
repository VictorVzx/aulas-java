import classes.Personagem;
import classes.Pessoa;

import javax.swing.*;

public class Main {
    public static void main (String[] args){
        String nome  = JOptionPane.showInputDialog(null, "Nome do personagem");
        String classe  = JOptionPane.showInputDialog(null, "Classe do personagem");

        Personagem guerreiro = new Personagem(nome, classe);
        guerreiro.mostrarStatus();
    }
}