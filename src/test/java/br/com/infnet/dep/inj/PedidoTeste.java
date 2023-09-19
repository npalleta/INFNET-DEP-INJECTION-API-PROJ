package br.com.infnet.dep.inj;

import static java.lang.System.out;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;

import br.com.infnet.dep.inj.model.business.Pedido;

public class PedidoTeste implements ApplicationRunner {

    public static void main(String[] args) {
        Pedido pedido = new Pedido(null, null, null);
        out.println("Inclusão de pedido realizada com sucesso: " + pedido);
    }

    @Override
    public void run(ApplicationArguments args) throws Exception {
    }
}
