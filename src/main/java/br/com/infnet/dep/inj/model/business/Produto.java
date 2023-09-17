package br.com.infnet.dep.inj.model.business;

public abstract class Produto {

    private String nome;
    private float valor;
    private int codigo;

    public Produto(String nome, float valor, int codigo) {
        this.nome = nome;
        this.valor = valor;
        this.codigo = codigo;
    }

    @Override
    public String toString() {
        return String.format("%s;%.2f;%d", nome, valor, codigo);
    }
}
