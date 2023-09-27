package br.com.infnet.dep.inj;

import static java.lang.System.out;

import java.io.BufferedReader;
import java.io.FileReader;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import br.com.infnet.dep.inj.model.domain.Bebida;
import br.com.infnet.dep.inj.model.domain.Comida;
import br.com.infnet.dep.inj.model.domain.Pedido;
import br.com.infnet.dep.inj.model.domain.Produto;
import br.com.infnet.dep.inj.model.domain.Sobremesa;
import br.com.infnet.dep.inj.model.domain.Solicitante;

@Order(5)
@Component
public class PedidoLoader implements ApplicationRunner {

    @Override
    public void run(ApplicationArguments args) throws Exception {
        /*
         * Solicitante solicitante = new Solicitante("Maria", "12312312312", "nenhum");
         * List<Produto> produtos = new ArrayList<>();
         * produtos.add(new Bebida("Suco", 10.00f, 123, false, 1.00f, "Coca"));
         * produtos.add(new Bebida("Água", 4.00f, 456, true, 1.00f, "Minalba"));
         * Pedido pedido = new Pedido(solicitante, produtos);
         * out.println("[Pedido] Inclusão de pedido realizada com sucesso: " + pedido);
         */

        Map<LocalDateTime, Pedido> mapaPedido = new HashMap<LocalDateTime, Pedido>();

        FileReader file = new FileReader("arquivos/pedido.txt");
        BufferedReader leitura = new BufferedReader(file);

        String linha = leitura.readLine();

        String[] campos = null;

        Pedido pedido = null;

        while (linha != null) {
            campos = linha.split(";");

            switch (campos[0]) {
                case "P":
                    pedido = new Pedido(
                            campos[1],
                            new Solicitante(campos[2], campos[3], campos[4]),
                            new ArrayList<Produto>());
                    mapaPedido.put(pedido.getData(), pedido);
                    break;
                case "B":
                    Bebida bebida = new Bebida(
                            campos[1],
                            Float.valueOf(campos[2]),
                            Integer.valueOf(campos[3]),
                            Boolean.valueOf(campos[4]),
                            Float.valueOf(campos[5]),
                            campos[6]);
                    pedido.getProdutos().add(bebida);
                    break;
                case "C":
                    Comida comida = new Comida(
                            campos[1],
                            Float.valueOf(campos[2]),
                            Integer.valueOf(campos[3]),
                            Float.valueOf(campos[4]),
                            Boolean.valueOf(campos[5]),
                            campos[6]);
                    pedido.getProdutos().add(comida);
                    break;
                case "S":
                    Sobremesa sobremesa = new Sobremesa(
                            campos[1],
                            Float.valueOf(campos[2]),
                            Integer.valueOf(campos[3]),
                            Float.valueOf(campos[4]),
                            Boolean.valueOf(campos[5]),
                            campos[6]);
                    pedido.getProdutos().add(sobremesa);
                    break;
                default:
                    break;
            }

            linha = leitura.readLine();
        }

        for (Pedido $pedido : mapaPedido.values()) {
            out.println("[Pedido] Inclusão realizada com sucesso: " + $pedido);
        }

        leitura.close();
    }
}