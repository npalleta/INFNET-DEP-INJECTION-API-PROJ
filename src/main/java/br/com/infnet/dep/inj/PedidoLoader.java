package br.com.infnet.dep.inj;

import br.com.infnet.dep.inj.model.business.Pedido;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import static java.lang.System.out;
@Component
public class PedidoLoader implements ApplicationRunner {

    @Override
    public void run(ApplicationArguments args) throws Exception {
        Pedido pedido = new Pedido();
        out.println("[Pedido] Inclusão de pedido realizada com sucesso: " + pedido);
    }
}
