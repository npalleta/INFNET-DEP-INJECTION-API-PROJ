package br.com.infnet.dep.inj;

import br.com.infnet.dep.inj.model.business.Bebida;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import static java.lang.System.out;
@Component
public class BebidaLoader implements ApplicationRunner {

    @Override
    public void run(ApplicationArguments args) throws Exception {
        Bebida bebida = new Bebida("Fanta Uva", 5.00f, 100, true, 0.20f, "Coca-Cola");
        out.println("[Bebida] Inclusão de pedido realizada com sucesso: " + bebida);
    }
}
