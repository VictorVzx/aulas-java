package classes;

import javax.swing.*;

public class Personagem {
    private String nome;
    private int nivel;
    private int forca;
    private int vida;
    private String classe;

    //metodo
    public Personagem(String nome, String classe){
        this.nome = nome;
        this.classe = classe;
        nivel = 10;
        vida = nivel * 5000;

        if(classe.equalsIgnoreCase("Guerreiro")){
            forca = nivel * 2;
        } else {
            forca = nivel;
        }
    }

    public void mostrarStatus(){
        String status = String.format("Nome: %s\nNível: %d\nForça: %d\nVida: %dHP\nClasse: %s", nome, nivel, forca, vida, classe);
        JOptionPane.showMessageDialog(null, status, "Status do personagem", JOptionPane.INFORMATION_MESSAGE);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    public int getForca() {
        return forca;
    }

    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    public void setForca(int forca) {
        this.forca = forca;
    }
}
