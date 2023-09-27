package br.com.infnet.dep.inj.model.service;

import static java.lang.System.out;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Service;

import br.com.infnet.dep.inj.model.domain.Solicitante;

@Service
public class SolicitanteService {

	// private Map<String, Solicitante> mapaSolicitante = new HashMap<>();

	private Map<Integer, Solicitante> mapa = new HashMap<>();

	private Integer id = 0;

	public void incluir(Solicitante solicitante) {
		// mapaSolicitante.put(solicitante.getCpf(), solicitante);
		id++;
		solicitante.setId(id);
		mapa.put(solicitante.getId(), solicitante);
		out.println("[Solicitante] Inclusão realizada com sucesso: " + solicitante);
	}

	public void excluir(Integer id) {
		// mapaSolicitante.remove(cpf);
		mapa.remove(id);
	}

	public Collection<Solicitante> obterLista() {
		// return mapaSolicitante.values();
		return mapa.values();
	}
}