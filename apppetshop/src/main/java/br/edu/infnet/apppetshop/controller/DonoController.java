package br.edu.infnet.apppetshop.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttribute;

import br.edu.infnet.apppetshop.model.domain.Dono;
import br.edu.infnet.apppetshop.model.domain.Usuario;
import br.edu.infnet.apppetshop.model.service.DonoService;
import br.edu.infnet.apppetshop.model.service.EnderecoService;

@Controller
public class DonoController {

	@Autowired
	private DonoService donoService;
	
	@Autowired
	private EnderecoService enderecoService;
	
	@GetMapping(value = "/donos")
	public String telaDonos(Model model, @SessionAttribute("autenticado") Usuario usuario) {
		model.addAttribute("lista", donoService.obterListaUsuario(usuario));
		
		return "dono/lista";
	}
	
	@GetMapping(value = "/donos/incluir")
	public String telaCadastro() {
		return "dono/cadastro";
	}
	
	@PostMapping(value = "/donos/incluir")
	public String incluir(Dono dono, @SessionAttribute("autenticado") Usuario usuario) {
		
		dono.setUsuario(usuario); 
		donoService.incluir(dono);
		
		return "redirect:/donos";
	}
	
	@PostMapping(value = "/cep")
	public String obterCep(Model model,  @RequestParam String cep) {
		
		model.addAttribute("endereco", enderecoService.obterEnderecoViaCep(cep));
		
		return "dono/cadastro";
	}
	
	@GetMapping(value = "/donos/{id}/excluir")
	public String excluirDono(@PathVariable Integer id) {
		donoService.remover(id);
		
		return "redirect:/donos";
	}
}
