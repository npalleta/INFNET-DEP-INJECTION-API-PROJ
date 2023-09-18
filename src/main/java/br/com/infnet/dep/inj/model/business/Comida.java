package br.com.infnet.dep.inj.model.business;

public class Comida extends Produto {

    private float peso;
    private boolean vegano;
    private String ingredientes;

    public Comida(String nome, float valor, int codigo, float peso, boolean vegano, String ingredientes) {
        super(nome, valor, codigo);
        this.peso = peso;
        this.vegano = vegano;
        this.ingredientes = ingredientes;
    }

    @Override
    public String toString() {
        return String.format("%s;%.2f;%s;%s",
                super.toString(),
                this.peso,
                this.vegano,
                this.ingredientes);
    }
}