import javax.swing.*;

public class Main {
    public static void main (String[] args){
        Sasuke sasuke = new Sasuke();
        int forca = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite a força do personagem sasuke"));
        sasuke.setForca(forca);

        if(sasuke.getForca() >= 20){
            sasuke.usarSharingan();
            System.out.println("Sasuke usou sharingan.");
        } else {
            sasuke.naoPermitido();
            System.out.println("Sasuke não pode usar o sharingan.");
        }

        Naruto naruto = new Naruto();
        int narutoF = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite a força do personagem naruto"));
        naruto.setForca(narutoF);

        if(naruto.getForca() >= 20){
            naruto.usarHasengan();
            System.out.println("Naruto usou hasengan.");
        } else {
            naruto.naoPermitido();
            System.out.println("Naruto não pode usar o hasengan.");
        }

    }
}