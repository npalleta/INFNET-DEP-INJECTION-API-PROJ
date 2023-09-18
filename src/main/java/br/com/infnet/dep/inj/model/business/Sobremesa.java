package br.com.infnet.dep.inj.model.business;

public class Sobremesa extends Produto {

    private float quantidade;
    private boolean doce;
    private String informacao;

    public Sobremesa(String nome, float valor, int codigo, float quantidade, boolean doce, String informacao) {
        super(nome, valor, codigo);
        this.quantidade = quantidade;
        this.doce = doce;
        this.informacao = informacao;
    }

    @Override
    public String toString() {
        return String.format("%s;%.2f;%s;%s",
                super.toString(),
                this.quantidade,
                this.doce,
                this.informacao);
    }
}
