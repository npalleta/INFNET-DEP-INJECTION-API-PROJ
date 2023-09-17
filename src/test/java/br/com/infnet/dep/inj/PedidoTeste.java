package br.com.infnet.dep.inj;

import br.com.infnet.dep.inj.model.business.Pedido;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;

import static java.lang.System.out;

public class PedidoTeste  implements ApplicationRunner {

    public static void main(String[] args) {
        Pedido pedido = new Pedido();
        out.println("Inclusão de pedido realizada com sucesso: " + pedido);
    }

    @Override
    public void run(ApplicationArguments args) throws Exception {

    }
}
