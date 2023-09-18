package br.com.infnet.dep.inj;

import static java.lang.System.out;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import br.com.infnet.dep.inj.model.business.Sobremesa;

@Order(3)
@Component
public class SobremesaLoader implements ApplicationRunner {

    @Override
    public void run(ApplicationArguments args) throws Exception {
        Sobremesa sobremesa = new Sobremesa("Pudim", 10.00f, 123, 123, false, "Leite Condensado");
        out.println("[Sobremesa] Inclusão realizada com sucesso: " + sobremesa);
    }
}
