public class Main {
    public static void main(String[] args){

        Notebook notebook1 = new Notebook();
        notebook1.marca = "Acer";
        notebook1.nome = "Nitro 5";
        notebook1.preco = 5000.0f;
        notebook1.RAM = 8;
        notebook1.SSD = 512;

        Celular celular1 = new Celular();
        celular1.nome = "iPhoneXR";
        celular1.espacoArmazenamento = 128;
        celular1.sistemaOperacional = "iOS";
        celular1.tamanhoTela = 6.1f;


        Celular celular2 = new Celular();
        celular2.nome = "Galaxy S21";
        celular2.espacoArmazenamento = 256;
        celular2.sistemaOperacional = "Android";
        celular2.tamanhoTela = 6.9f;

        Celular celular3 = new Celular();
        celular3.nome = "Xiaomi POCO C65";
        celular3.espacoArmazenamento = 256;
        celular3.sistemaOperacional = "Android";
        celular3.tamanhoTela = 6.81f;

        System.out.format("Notebook da marca %s modelo %s, custando %.1f. %dGB de RAM e %dGB de SSD.\n", notebook1.marca, notebook1.nome, notebook1.preco, notebook1.RAM, notebook1.SSD);

        System.out.format("Celular %s com %dGB de armazenamento, sistema operacional %s e tela de %.1f polegadas.\n", celular1.nome, celular1.espacoArmazenamento, celular1.sistemaOperacional, celular1.tamanhoTela);
        System.out.format("Celular %s com %dGB de armazenamento, sistema operacional %s e tela de %.1f polegadas.\n", celular2.nome, celular2.espacoArmazenamento, celular2.sistemaOperacional, celular2.tamanhoTela);
        System.out.format("Celular %s com %dGB de armazenamento, sistema operacional %s e tela de %.2f polegadas.\n", celular3.nome, celular3.espacoArmazenamento, celular3.sistemaOperacional, celular3.tamanhoTela);

        celular2.ligarCelular();
        celular2.fazerLigacao();

    }
}

class Celular {
    String nome;
    String sistemaOperacional;
    int espacoArmazenamento;
    float tamanhoTela;

    Pessoa pessoa = new Pessoa("pedero", 2);
    String identificacao = pessoa.setNome("Pedro");

    void ligarCelular() {
        System.out.format("O celular %s foi ligado!\n", nome);
    }

    void fazerLigacao() {
        System.out.format("%s fez uma ligação com o %s\n", identificacao, nome);
    }
}

class Notebook {
    String marca;
    String nome;
    int SSD;
    int RAM;
    float preco;
}


class Pessoa {
    private String nome;
    private int idade;

    public Pessoa(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public String setNome(String nome) {
        this.nome = nome;
        return nome;
    }
}
