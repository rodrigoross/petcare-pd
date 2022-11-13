package br.edu.infnet.apppetshop.model.service;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.edu.infnet.apppetshop.clients.IUsuarioClient;
import br.edu.infnet.apppetshop.model.domain.Usuario;

@Service
public class UsuarioService {
	
	@Autowired
	private IUsuarioClient usuarioClient;
	
	public void incluir(Usuario usuario) {
		usuarioClient.incluir(usuario);
	}

	public void remover(Integer id) {
		usuarioClient.excluir(id);
	}
	
	public Collection<Usuario> obterLista(){
		return (Collection<Usuario>) usuarioClient.obterLista();
	}
	
	public Usuario validar(String email, String senha) {
		return usuarioClient.validar(email, senha);
	}
}
