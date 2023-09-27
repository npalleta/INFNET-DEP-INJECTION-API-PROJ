package br.com.infnet.dep.inj;

import static java.lang.System.out;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import br.com.infnet.dep.inj.model.domain.Solicitante;

@Order(6)
@Component
public class MapLoader implements ApplicationRunner {

    @Override
    public void run(ApplicationArguments args) throws Exception {
        Solicitante s1 = new Solicitante("Mariana", "111", "mariana.test@test.com");
        Solicitante s2 = new Solicitante("Diogo", "222", "diogo.test@test.com");
        Solicitante s3 = new Solicitante("Ana", "222", "ana.test@test.com");
        List<Solicitante> lista = new ArrayList<>();
        Map<String, String> mapa = new HashMap<>();
        mapa.put("111", "maria");
        mapa.put("222", "diogo");
        mapa.put("234", "ana");

        for (String k : mapa.keySet()) {
            out.println("k: " + k);
        }

        for (String v : mapa.values()) {
            out.println("v: " + v);
        }

        mapa.keySet();
        out.println("keyset: " + mapa.keySet());
        out.println("values: " + mapa.values());
        out.println("get: " + mapa.get("111"));
        out.println("get: " + mapa.get("222"));
        out.println("get: " + mapa.get("234"));
        // out.println("get: " + mapa.get("999"));
        mapa.remove("234");
        out.println("get: " + mapa.get("234"));

        Map<String, Solicitante> novoMapa = new HashMap<>();
        novoMapa.put("111", s1);
        novoMapa.put("222", s2);
        novoMapa.put("234", s3);

        for (Solicitante v : novoMapa.values()) {
            out.println("v: " + v.getEmail());
        }

    }
}