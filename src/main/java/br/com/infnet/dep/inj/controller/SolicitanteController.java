package br.com.infnet.dep.inj.controller;

import static java.lang.System.out;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import br.com.infnet.dep.inj.model.business.Solicitante;

@Controller
public class SolicitanteController {

	private Map<String, Solicitante> mapaSolicitante = new HashMap<>();

	public void incluir(Solicitante solicitante) {
		mapaSolicitante.put(solicitante.getCpf(), solicitante);
		out.println("[Solicitante] Inclusão realizada com sucesso: " + solicitante);
	}

	public void excluir(String cpf) {
		mapaSolicitante.remove(cpf);
	}

	public Collection<Solicitante> obterLista() {
		return mapaSolicitante.values();
	}

	@GetMapping(value = "/solicitante/lista")
	public String telaLista(Model model) {
		/*
		 * List<Solicitante> solicitantes = new ArrayList<>(); solicitantes.add(new
		 * Solicitante("Niky", "12312312312", "qa@test.com")); solicitantes.add(new
		 * Solicitante("Carlos", "99999999999", "dev@test.com")); solicitantes.add(new
		 * Solicitante("Maria", "88888888888", "po@test.com"));
		 * model.addAttribute("listaSolicitante", solicitantes);
		 */
		model.addAttribute("listaSolicitante", this.obterLista());
		return "solicitante/lista";
	}

	@GetMapping(value = "/solicitante/{cpf}/excluir")
	public String exclusao(@PathVariable String cpf) {
		excluir(cpf);
		return "redirect:/solicitante/lista";
	}
}
