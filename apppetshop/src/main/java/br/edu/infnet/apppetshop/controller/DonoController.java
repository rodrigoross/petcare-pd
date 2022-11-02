package br.edu.infnet.apppetshop.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import br.edu.infnet.apppetshop.model.service.DonoService;

@Controller
public class DonoController {

	@Autowired
	private DonoService donoService;
	
	@GetMapping(value = "/donos")
	public String telaDonos(Model model) {
		model.addAttribute("lista", donoService.obterLista());
		
		return "dono/lista";
	}
	
	@GetMapping(value = "/donos/{id}/excluir")
	public String excluirBanho(@PathVariable Integer id) {
		donoService.remover(id);
		
		return "redirect:/donos";
	}
}
