package habilidades;

import javax.swing.*;

public class Sharingan{
    public Sharingan(){
        String nome = "Sharingan";
    }

    public void usarSharingan(){
        JOptionPane.showMessageDialog(null, "O personagem Sasuke usou o Sharingan!");
    }

    public void naoPermitido(){
        JOptionPane.showMessageDialog(null, "Sasuke não tem força suficiente para usar o sharingan.");
    }
}
