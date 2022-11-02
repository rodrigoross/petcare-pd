package br.edu.infnet.apppetshop.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

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
	
	@GetMapping(value = "/servicos/{id}/excluir")
	public String excluirBanho(@PathVariable Integer id) {
		servicoService.remover(id);
		
		return "redirect:/servicos";
	}
}
