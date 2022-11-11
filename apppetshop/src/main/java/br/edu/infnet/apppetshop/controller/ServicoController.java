package br.edu.infnet.apppetshop.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.SessionAttribute;

import br.edu.infnet.apppetshop.model.domain.Servico;
import br.edu.infnet.apppetshop.model.domain.Usuario;
import br.edu.infnet.apppetshop.model.service.ServicoService;

@Controller
public class ServicoController {
	@Autowired
	private ServicoService servicoService;
	
	@GetMapping(value = "/servicos")
	public String telaservico(Model model) {
		model.addAttribute("lista", servicoService.obterLista());
		
		return "servico/lista";
	}
	
	@GetMapping(value = "/servicos/incluir")
	public String telaCadastro() {
		return "servico/cadastro";
	}
	
	@PostMapping(value = "/servicos/incluir")
	public String incluir(Servico servico, @SessionAttribute("autenticado") Usuario usuario) {
		
		servicoService.incluir(servico);
		
		return "redirect:/servicos";
	}
	
	@GetMapping(value = "/servicos/{id}/excluir")
	public String excluirServico(@PathVariable Integer id) {
		servicoService.remover(id);
		
		return "redirect:/servicos";
	}
}
