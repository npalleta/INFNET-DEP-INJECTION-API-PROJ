package br.com.infnet.dep.inj;

import java.io.BufferedReader;
import java.io.FileReader;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import br.com.infnet.dep.inj.controller.SolicitanteController;
import br.com.infnet.dep.inj.model.business.Solicitante;

@Order(4)
@Component
public class SolicitanteLoader implements ApplicationRunner {

	@Autowired
	private SolicitanteController solicitanteController;

	@Override
	public void run(ApplicationArguments args) throws Exception {

		FileReader file = new FileReader("arquivos/solicitante.txt");

		BufferedReader leitura = new BufferedReader(file);

		String linha = leitura.readLine();

		String[] campos = null;

		while (linha != null) {
			campos = linha.split(";");
			Solicitante solicitante = new Solicitante(campos[0], campos[1], campos[2]);
			solicitanteController.incluir(solicitante);
			linha = leitura.readLine();
		}

		leitura.close();
	}
}
