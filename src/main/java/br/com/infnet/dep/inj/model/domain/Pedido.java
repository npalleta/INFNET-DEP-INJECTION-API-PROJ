package br.com.infnet.dep.inj.model.domain;

import java.time.LocalDateTime;
import java.util.List;

public class Pedido {

    private String descricao;
    private LocalDateTime data;
    private boolean web;
    private Solicitante solicitante;
    private List<Produto> produtos;

    public Pedido() {
        this.descricao = "Pedido inicial";
        this.data = LocalDateTime.now();
        this.web = true;
    }

    public Pedido(String descricao, Solicitante solicitante, List<Produto> produtos) {
        this();
        this.descricao = descricao;
        this.solicitante = solicitante;
        this.produtos = produtos;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public LocalDateTime getData() {
        return data;
    }

    public void setData(LocalDateTime data) {
        this.data = data;
    }

    public boolean isWeb() {
        return web;
    }

    public void setWeb(boolean web) {
        this.web = web;
    }

    public Solicitante getSolicitante() {
        return solicitante;
    }

    public void setSolicitante(Solicitante solicitante) {
        this.solicitante = solicitante;
    }

    public List<Produto> getProdutos() {
        return produtos;
    }

    public void setProdutos(List<Produto> produtos) {
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