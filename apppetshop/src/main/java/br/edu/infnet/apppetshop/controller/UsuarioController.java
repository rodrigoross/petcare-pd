package br.edu.infnet.apppetshop.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import br.edu.infnet.apppetshop.model.domain.Usuario;
import br.edu.infnet.apppetshop.model.service.UsuarioService;

@Controller
public class UsuarioController {

	@Autowired
	private UsuarioService usuarioService;
	
	@GetMapping(value = "/usuarios")
	public String telaDonos(Model model) {
		model.addAttribute("lista", usuarioService.obterLista());
		
		return "usuario/lista";
	}
	
	@GetMapping(value = "/cadastrar")
	public String telaCadastro() {
		return "usuario/cadastro";
	}
	
	@PostMapping(value = "/cadastrar")
	public String cadastrarUsuario(Usuario usuario) {
		System.out.println(usuario);
		usuarioService.incluir(usuario);
		
		return "redirect:/usuarios";
	}
	
	@GetMapping(value = "/usuarios/{id}/excluir")
	public String excluirBanho(@PathVariable Integer id) {
		usuarioService.remover(id);
		
		return "redirect:/usuarios";
	}
}
