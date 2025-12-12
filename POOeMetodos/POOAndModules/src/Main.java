import java.util.Scanner;

public class Main {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        Clientes pessoa1 = new Clientes();

        System.out.print("Digite o nome do cliente: ");
        pessoa1.nome = scanner.nextLine();

        System.out.print("Digite o email do cliente: ");
        pessoa1.email = scanner.nextLine();

        System.out.print("Digite a idade do cliente: ");
        pessoa1.idade = scanner.nextInt();

        System.out.print("Digite o telefone do cliente: ");
        pessoa1.telefone = scanner.nextLong();

        pessoa1.clienteCadastrado();

        Produtos celular = new Produtos();
        celular.id = 1;
        celular.nome = "Xiaomi Redmi Note 8";
        celular.preco = 1322.99f;

        pessoa1.comprar(celular.nome);
    }
}

class Clientes {
    String nome;
    String email;
    int idade;
    long telefone;

    void clienteCadastrado() {
        if(idade >= 18) {
            System.out.format("Cliente %s cadastrado com sucesso!\n", nome);
        } else {
            System.out.format("Cliente %s é menor de idade e não pode ser cadastrado.\n", nome);
            System.exit(1);
        }
    }

    void comprar(String produto) {
        System.out.format("O cliente %s comprou o produto %s\n", nome, produto);
    }
}

class Produtos {
    int id;
    String nome;
    float preco;

    void comprar() {
        System.out.format("Carro %s de id %d foi vendido por %.2fR$!", nome, id, preco);
    }

}