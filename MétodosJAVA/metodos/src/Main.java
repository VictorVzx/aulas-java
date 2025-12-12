import java.util.Scanner;
import java.util.Random;

public class Main {
    public static void main (String[] args) {
        Scanner scan = new Scanner(System.in);

        Personagem heroi = new Personagem();
        heroi.nome = "Hércules";
        heroi.nivel = 2;
        heroi.forca = 16;

        System.out.format("Seu personagem é %s!\n", heroi.nome);

        heroi.mostrarStatus();

        Adversario personagem = new Adversario();

        System.out.print("Digite o nome do adversário: ");
        personagem.nome = scan.nextLine();

        System.out.print("Digite o nivel do adversario: ");
        personagem.nivel = scan.nextInt();

        System.out.print("Digite a força do adversário: ");
        personagem.forca = scan.nextInt();

        personagem.mostrarStatus();

        heroi.atacar(personagem.nome, "bosta");

        System.out.println(heroi.calcularDano());

        if (personagem.forca < heroi.forca){
            heroi.nivel++;
            System.out.format("O seu personagem atacou %s e matou! Seu nível agora é %d", personagem.nome, heroi.nivel);
        } else {
            System.out.format("O nivel do seu personagem é menor que o nível do seu adversário e não conseguiu matá-lo.");
        }

    }
}

class Personagem {
    String nome;
    int nivel;
    int forca;

    void mostrarStatus() {
        System.out.format("O personagem %s está no nivel %d e tem %d de força\n", nome, nivel, forca);
    }

    int calcularDano() {
        Random gerador = new Random();
        int dado20Faces = 1 + gerador.nextInt(19);
        int dano = forca + dado20Faces;
        return dano;

    }

    void atacar(String alvo, String habilidade) {
        int danoCausado = calcularDano();

        if (habilidade.length() == forca) {
            System.out.format("%s atacou %s e causou %d de dano\n", nome, alvo, danoCausado);
        } else {
            System.out.format("%s atacou %s com a habilidade %s e causou %d de dano\n", nome, alvo, habilidade, danoCausado);
        }
    }
}

class Adversario {
    String nome;
    int nivel;
    int forca;

    void mostrarStatus() {
        System.out.format("O personagem %s está no nivel %d e possui %d de força\n", nome, nivel, forca);
    }

    void atacar(String adv) {
        System.out.format("O personagem %s atacou o adversario %s e causou %d de dano\n", nome, adv, forca);
    }
}