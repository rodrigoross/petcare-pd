package br.infnet.edu.apiusuario.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import br.infnet.edu.apiusuario.model.domain.Usuario;
import br.infnet.edu.apiusuario.model.service.UsuarioService;

@RestController
@RequestMapping("/api/usuarios")
public class UsuarioController {

	@Autowired
	private UsuarioService usuarioService;
	
	@PostMapping(value = "/incluir")
	public void incluir(@RequestBody Usuario usuario) {
		System.out.println("# Incluir " + usuario);
		
		usuarioService.incluir(usuario);
	}

	@DeleteMapping(value = "/{id}/excluir")
	public void excluir(@PathVariable Integer id) {
		System.out.println("# Excluindo " + id);
		
		usuarioService.remover(id);
	}

	@GetMapping(value = "")
	public List<Usuario> obterLista() {
		System.out.println("# Carregando usuários...");
		
		return usuarioService.obterLista();
	}

	@PostMapping(value = "/login")
	public Usuario validar(@RequestParam String email, @RequestParam String senha) {
		System.out.println("# Validando " + email);
		
		return usuarioService.validar(email, senha);
	}
}
