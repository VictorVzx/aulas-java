import java.util.ArrayList;

public class Main {
    public static void main (String[] args){

        String[] arrayEstatico = new String[5];
        arrayEstatico[0] = "Carlos";
        arrayEstatico[1] = "Maria";
        arrayEstatico[2] = "Joao";
        arrayEstatico[3] = "Marcos";
        arrayEstatico[4] = "Junior";

        //Arraylist <Tipo> nome = new ArrayList <Tipo>();
        ArrayList<String> arrayDinamico = new ArrayList<String>();
        arrayDinamico.add("Joaozinho");
        arrayDinamico.add("Maria");
        arrayDinamico.add("Pedro");
        arrayDinamico.add("Carlos");
        arrayDinamico.add("Quasar");
        arrayDinamico.add("Bigger");
        arrayDinamico.add("Sab");

        System.out.println("Array normal\n");
        for(int indice = 0; indice < arrayEstatico.length; indice++){
            System.out.println(arrayEstatico[indice]);
        }


        System.out.println("\nArrayList\n");
        for(int indice = 0; indice < arrayDinamico.size(); indice++){
            System.out.println(arrayDinamico.get(indice));
        }


    }
}