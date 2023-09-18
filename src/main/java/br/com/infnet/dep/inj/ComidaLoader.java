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

import br.com.infnet.dep.inj.model.business.Comida;

@Order(2)
@Component
public class ComidaLoader implements ApplicationRunner {

    @Override
    public void run(ApplicationArguments args) throws Exception {
        /*
         * Comida comida = new Comida("Arroz Carreteiro", 12.00f, 1234, 1234, false, "Arroz");
         * out.println("[Comida] Inclusão realizada com sucesso: " + comida);
         */

        Map<Integer, Comida> mapaComida = new HashMap<Integer, Comida>();

        FileReader file = new FileReader("arquivos/comida.txt");
        BufferedReader leitura = new BufferedReader(file);

        String linha = leitura.readLine();

        String[] campos = null;

        while (linha != null) {
            campos = linha.split(";");

            Comida comida = new Comida(
                    campos[0],
                    Float.valueOf(campos[1]),
                    Integer.valueOf(campos[2]),
                    Float.valueOf(campos[3]),
                    Boolean.valueOf(campos[4]),
                    campos[5]);

            mapaComida.put(comida.getCodigo(), comida);

            linha = leitura.readLine();
        }

        for (Comida comida : mapaComida.values()) {
            out.println("[Comida] Inclusão realizada com sucesso: " + comida);
        }

        leitura.close();
    }
}
