package br.com.infnet.dep.inj.model.business;

import java.time.LocalDateTime;
import java.util.List;

public class Pedido {

    private String descricao;
    private LocalDateTime data;
    private boolean web;
    private Solicitante solicitante;
    private List<Produto> produtos;

    public Pedido(Solicitante solicitante, List<Produto> produtos) {
        this.descricao = "Pedido inicial";
        this.data = LocalDateTime.now();
        this.web = true;
        this.solicitante = solicitante;
        this.produtos = produtos;
    }

    @Override
    public String toString() {
        return "Pedido{" +
                "descricao='" + this.descricao + '\'' +
                ", data=" + this.data +
                ", web=" + this.web +
                ", solicitante=" + this.solicitante +
                ", qtdProdutos=" + this.produtos.size() +
                '}';
    }
}
