import classes.Pessoas;

public class Main{
    public static void main (String[] args){

        Pessoas pessoa = new Pessoas();
        pessoa.setNome("Bob esponja");
        pessoa.setIdade(10);
        pessoa.setAltura(1.78);

        System.out.println("Nome: " + pessoa.getNome());
        System.out.println("Idade: " + pessoa.getIdade());
        System.out.println("Altura: " + pessoa.getAltura() );


    }
}