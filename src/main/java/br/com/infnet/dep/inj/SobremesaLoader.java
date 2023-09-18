package br.com.infnet.dep.inj;

import static java.lang.System.out;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.HashMap;
import java.util.Map;

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
        /*
         * Sobremesa sobremesa = new Sobremesa("Pudim", 10.00f, 123, 123, false, "Leite Condensado");
         * out.println("[Sobremesa] Inclusão realizada com sucesso: " + sobremesa);
         */

        Map<Integer, Sobremesa> mapaSobremesa = new HashMap<Integer, Sobremesa>();

        FileReader file = new FileReader("arquivos/sobremesa.txt");
        BufferedReader leitura = new BufferedReader(file);

        String linha = leitura.readLine();

        String[] campos = null;

        while (linha != null) {
            campos = linha.split(";");

            Sobremesa sobremesa = new Sobremesa(
                    campos[0],
                    Float.valueOf(campos[1]),
                    Integer.valueOf(campos[2]),
                    Float.valueOf(campos[3]),
                    Boolean.valueOf(campos[4]),
                    campos[5]);

            mapaSobremesa.put(sobremesa.getCodigo(), sobremesa);

            linha = leitura.readLine();
        }

        for (Sobremesa sobremesa : mapaSobremesa.values()) {
            out.println("[Sobremesa] Inclusão realizada com sucesso: " + sobremesa);
        }

        leitura.close();
    }
}
