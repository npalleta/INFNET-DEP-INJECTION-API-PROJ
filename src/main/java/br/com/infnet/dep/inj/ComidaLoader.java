package br.com.infnet.dep.inj;

import static java.lang.System.out;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import br.com.infnet.dep.inj.model.business.Comida;

@Order(2)
@Component
public class ComidaLoader implements ApplicationRunner {

    @Override
    public void run(ApplicationArguments args) throws Exception {
        Comida comida = new Comida("Arroz Carreteiro", 12.00f, 1234, 1234, false, "Arroz");
        out.println("[Comida] Inclusão realizada com sucesso: " + comida);
    }
}
