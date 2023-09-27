package br.com.infnet.dep.inj.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import br.com.infnet.dep.inj.model.domain.Solicitante;
import br.com.infnet.dep.inj.model.service.SolicitanteService;

@Controller
public class SolicitanteController {

	@Autowired
	private SolicitanteService solicitanteService;

	@GetMapping(value = "/solicitante/lista")
	public String telaLista(Model model) {
		/*
			List<Solicitante> solicitantes = new ArrayList<>();
			solicitantes.add(new Solicitante("Niky", "12312312312", "qa@test.com"));
			solicitantes.add(new Solicitante("Carlos", "99999999999", "dev@test.com"));
			solicitantes.add(new Solicitante("Maria", "88888888888", "po@test.com"));
			model.addAttribute("listaSolicitante", solicitantes);
		*/
		model.addAttribute("listaSolicitante", solicitanteService.obterLista());
		return "solicitante/lista";
	}

	@GetMapping(value = "/solicitante/cadastro")
	public String telaCadastro() {
		return "solicitante/cadastro";
	}

	@PostMapping(value = "/solicitante/incluir")
	public String incluir(Solicitante solicitante) {
		solicitanteService.incluir(solicitante);
		return "redirect:/solicitante/lista";
	}

	@GetMapping(value = "/solicitante/{id}/excluir")
	public String exclusao(@PathVariable Integer id) {
		solicitanteService.excluir(id);
		return "redirect:/solicitante/lista";
	}
}