package br.com.infnet.dep.inj.controller;

import static java.lang.System.out;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

import br.com.infnet.dep.inj.model.business.Usuario;

@SessionAttributes("username")
@Controller
public class UsuarioController {

	private Map<String, Usuario> mapaUsuario = new HashMap<>();

	public void incluir(Usuario usuario) {
		mapaUsuario.put(usuario.getEmail(), usuario);
		out.println("[Usuário] Inclusão realizada com sucesso: " + usuario);
	}

	public void excluir(String email) {
		mapaUsuario.remove(email);
	}

	public Usuario validar(String email, String senha) {
		Usuario usuario = mapaUsuario.get(email);
		if (usuario != null) {
			if (senha.equalsIgnoreCase(usuario.getSenha()))
				return usuario;
		}
		return null;
	}

	@PostMapping(value = "/valida")
	public String validaLogin(Model model, @RequestParam String email, @RequestParam String senha) {
		Usuario usuario = validar(email, senha);
		out.printf("Credenciais: %s - %s", email, senha);
		if (usuario != null) {
			model.addAttribute("username", usuario);
			return "home";
		}
		return "redirect:/login";
	}

	public Collection<Usuario> obterLista() {
		return mapaUsuario.values();
	}

	@GetMapping(value = "/usuario/lista")
	public String telaLista(Model model) {
		model.addAttribute("listaUsuario", this.obterLista());
		return "usuario/lista";
	}

	@GetMapping(value = "/usuario/cadastro")
	public String telaCadastro() {
		return "usuario/cadastro";
	}

	@PostMapping(value = "/usuario/incluir")
	public String inclusao(Usuario usuario) {
		this.incluir(usuario);
		return "redirect:/";
	}

	@GetMapping(value = "/usuario/{email}/excluir")
	public String exclusao(@PathVariable String email) {
		this.excluir(email);
		return "redirect:/usuario/lista";
	}
}
