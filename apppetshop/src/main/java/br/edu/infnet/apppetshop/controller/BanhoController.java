package br.edu.infnet.apppetshop.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.SessionAttribute;

import br.edu.infnet.apppetshop.model.domain.Banho;
import br.edu.infnet.apppetshop.model.domain.Usuario;
import br.edu.infnet.apppetshop.model.service.BanhoService;

@Controller
public class BanhoController {
	@Autowired
	private BanhoService banhoService;
	
	@GetMapping(value = "/banhos")
	public String telaBanhos(Model model) {
		// atributo <- banhos;
		model.addAttribute("lista", banhoService.obterLista());

		return "banho/lista";
	}
	
	@GetMapping(value = "/banhos/incluir")
	public String telaCadastro() {
		return "banho/cadastro";
	}
	
	@PostMapping(value = "/banhos/incluir")
	public String incluir(Banho banho, @SessionAttribute("autenticado") Usuario usuario) {
	
		banhoService.incluir(banho);
		
		return "redirect:/banhos";
	}

	@GetMapping(value = "/banhos/{id}/excluir")
	public String excluirBanho(@PathVariable Integer id) {
		banhoService.remover(id);
		
		return "redirect:/banhos";
	}
	
}
