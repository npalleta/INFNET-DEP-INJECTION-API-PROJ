package br.com.infnet.dep.inj;

import static java.lang.System.out;

import java.io.BufferedReader;
import java.io.FileReader;
import java.nio.charset.StandardCharsets;
import java.util.HashMap;
import java.util.Map;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import br.com.infnet.dep.inj.model.domain.Bebida;

@Order(1)
@Component
public class BebidaLoader implements ApplicationRunner {

    @Override
    public void run(ApplicationArguments args) throws Exception {

        Map<Integer, Bebida> mapaBebida = new HashMap<>();

        FileReader arquivo = new FileReader("arquivos/bebida.txt", StandardCharsets.UTF_8);
        BufferedReader leitura = new BufferedReader(arquivo);

        String linha = leitura.readLine();

        String[] campos = null;

        while (linha != null) {
            campos = linha.split(";");

            Bebida bebida = new Bebida(
                    campos[0],
                    Float.valueOf(campos[1]),
                    Integer.valueOf(campos[2]),
                    Boolean.valueOf(campos[3]),
                    Float.valueOf(campos[4]),
                    campos[5]);
            out.println("[Bebida] Inclusão realizada com sucesso: " + bebida);

            mapaBebida.put(bebida.getCodigo(), bebida);

            linha = leitura.readLine();
        }

        for (Integer k : mapaBebida.keySet()) {
            out.println("Chave: " + k);
            out.println("Valor: " + mapaBebida.values());
        }

        // Bebida bebida = new Bebida("Fanta Uva", 5.00f, 100, true, 0.20f, "Coca-Cola");
        leitura.close();
    }
}