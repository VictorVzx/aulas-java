package habilidades;

import javax.swing.*;

public class Hasengan {
    public Hasengan() {
        String nome = "Hasengan";
    }

    public void usarHasengan(){
        JOptionPane.showMessageDialog(null,"Naruto usou hasengan!");
    }

    public void naoPermitido(){
        JOptionPane.showMessageDialog(null,"Naruto não tem força suficiente!");
    }
}
