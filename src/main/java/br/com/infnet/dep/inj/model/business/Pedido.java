package br.com.infnet.dep.inj.model.business;

import java.time.LocalDateTime;

public class Pedido {

    private String descricao;
    private LocalDateTime data;
    private boolean web;

    public Pedido() {
        this.descricao = "Pedido inicial";
        this.data = LocalDateTime.now();
        this.web = true;
    }

    @Override
    public String toString() {
        return "Pedido{" +
                "descricao='" + this.descricao + '\'' +
                ", data=" + this.data +
                ", web=" + this.web +
                '}';
    }
}
