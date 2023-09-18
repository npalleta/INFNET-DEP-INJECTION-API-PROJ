package br.com.infnet.dep.inj;

import static java.lang.System.out;

import java.util.ArrayList;
import java.util.List;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import br.com.infnet.dep.inj.model.business.Bebida;
import br.com.infnet.dep.inj.model.business.Pedido;
import br.com.infnet.dep.inj.model.business.Produto;
import br.com.infnet.dep.inj.model.business.Solicitante;

@Order(5)
@Component
public class PedidoLoader implements ApplicationRunner {

    @Override
    public void run(ApplicationArguments args) throws Exception {
        Solicitante solicitante = new Solicitante("Maria", "12312312312", "nenhum");
        List<Produto> produtos = new ArrayList<>();
        produtos.add(new Bebida("Suco", 10.00f, 123, false, 1.00f, "Coca"));
        produtos.add(new Bebida("Água", 4.00f, 456, true, 1.00f, "Minalba"));
        Pedido pedido = new Pedido(solicitante, produtos);
        out.println("[Pedido] Inclusão de pedido realizada com sucesso: " + pedido);
    }
}
