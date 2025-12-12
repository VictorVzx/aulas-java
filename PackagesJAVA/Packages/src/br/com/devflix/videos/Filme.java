package br.com.devflix.videos;

public class Filme {
    public String nome;
    public float duracao;
    public int idadeMin;

    public void assistiu(String pessoa) {
        System.out.format("%s assistiu o filme %s", pessoa, nome);
    }
}
