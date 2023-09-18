package br.com.infnet.dep.inj;

import static java.lang.System.out;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import br.com.infnet.dep.inj.model.business.Solicitante;

@Order(4)
@Component  
public class SolicitanteLoader implements ApplicationRunner {

    @Override
    public void run(ApplicationArguments args) throws Exception {
        Solicitante solicitante = new Solicitante("Joãozinho", "12312312312", "test@test.com");
        out.println("[Solicitante] Inclusão realizada com sucesso: " + solicitante);
    }
}
