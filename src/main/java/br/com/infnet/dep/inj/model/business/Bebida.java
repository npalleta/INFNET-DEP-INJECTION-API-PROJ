package br.com.infnet.dep.inj.model.business;

public class Bebida extends Produto {

    private boolean gelada;
    private float tamanho;
    private String marca;


    public Bebida(String nome, float valor, int codigo, boolean gelada, float tamanho, String marca) {
        super(nome, valor, codigo);
        this.gelada = gelada;
        this.tamanho = tamanho;
        this.marca = marca;
    }

    @Override
    public String toString() {
        return String.format("%s;%s;%.2f;%s", super.toString(), gelada, tamanho, marca);
    }
}
