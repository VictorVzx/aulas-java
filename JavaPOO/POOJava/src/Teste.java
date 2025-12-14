import java.util.Scanner;

public class Teste {
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite seu nome: ");
        String nome = scanner.nextLine();

        if ("victor".equalsIgnoreCase(nome)){
            System.out.println("Sou eu!");
        } else {
            System.out.println("Não sou eu!");
        }
    }
}
