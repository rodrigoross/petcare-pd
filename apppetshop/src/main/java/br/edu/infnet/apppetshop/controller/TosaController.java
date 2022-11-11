package br.edu.infnet.apppetshop.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import br.edu.infnet.apppetshop.model.service.TosaService;

@Controller
public class TosaController {
	@Autowired
	private TosaService tosaService;
	
	@GetMapping(value = "/tosas")
	public String telatosa(Model model) {
		model.addAttribute("lista", tosaService.obterLista());
		
		return "tosa/lista";
	}

	@GetMapping(value = "/tosas/incluir")
	public String telaCadastro() {
		return "tosa/cadastro";
	}
	
	@PostMapping(value = "/tosas/incluir")
	public String incluir(Tosa tosa, @SessionAttribute("autenticado") Usuario usuario) {
		
		tosa.setUsuario(usuario);
		tosaService.incluir(tosa);
		
		return "redirect:/tosas";
	}

	@GetMapping(value = "/tosas/{id}/excluir")
	public String excluirTosa(@PathVariable Integer id) {
		tosaService.remover(id);
		
		return "redirect:/tosas";
	}
}
