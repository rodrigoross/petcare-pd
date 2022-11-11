package br.edu.infnet.apppetshop.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.SessionAttribute;

import br.edu.infnet.apppetshop.model.domain.Consulta;
import br.edu.infnet.apppetshop.model.domain.Usuario;
import br.edu.infnet.apppetshop.model.service.ConsultaService;

@Controller
public class ConsultaController {

	@Autowired
	private ConsultaService consultaService;
	
	@GetMapping(value = "/consultas")
	public String telaConsultas(Model model) {
		model.addAttribute("lista", consultaService.obterLista());
		
		return "consulta/lista";
	}
	
@GetMapping(value = "/consultas/incluir")
	public String telaCadastro() {
		return "consulta/cadastro";
	}
	
	@PostMapping(value = "/consultas/incluir")
	public String incluir(Consulta consulta, @SessionAttribute("autenticado") Usuario usuario) {
		
		consultaService.incluir(consulta);
		
		return "redirect:/consultas";
	}

	@GetMapping(value = "/consultas/{id}/excluir")
	public String excluirConsulta(@PathVariable Integer id) {
		consultaService.remover(id);
		
		return "redirect:/consultas";
	}
}
