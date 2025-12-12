import alunos.Alunos;

import java.util.Scanner;

public class Main {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("------Cadastro de Alunos------");
        Alunos aluno1 = new Alunos();

        System.out.print("Digite o nome do aluno: ");
        aluno1.nome = scanner.nextLine();

        System.out.print("Digite a idade do aluno: ");
        aluno1.idade = scanner.nextInt();
        scanner.nextLine();


        System.out.print("Deseja alterar os dados do aluno? Y/N: ");
        String confirm = scanner.nextLine();
            if("Y".equalsIgnoreCase(confirm)){
                System.out.print("Digite o novo nome do aluno: ");
                String nomeNovo = scanner.nextLine();

                aluno1.setNome(nomeNovo);

                System.out.print("Digite a nova idade do aluno: ");
                int idadeNova = scanner.nextInt();

                aluno1.setIdade(idadeNova);

                System.out.format("Nome %s e idade %d definidos para o aluno", aluno1.getNome(), aluno1.getIdade());
            } else {
                System.out.println("Ok!");
            }


    }
}