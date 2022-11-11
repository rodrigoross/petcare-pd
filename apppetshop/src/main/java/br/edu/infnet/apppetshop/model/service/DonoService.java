package br.edu.infnet.apppetshop.model.service;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.edu.infnet.apppetshop.model.domain.Dono;
import br.edu.infnet.apppetshop.model.domain.Usuario;
import br.edu.infnet.apppetshop.model.repository.DonoRepository;

@Service
public class DonoService {
	@Autowired
	private DonoRepository donoRepository;
	
	public void incluir(Dono dono) {
		donoRepository.save(dono);
	}

	public void remover(Integer id) {
		donoRepository.deleteById(id);
	}
	
	public Collection<Dono> obterLista(){
		return (Collection<Dono>) donoRepository.findAll();
	}
	
	public Collection<Dono> obterListaUsuario(Usuario usuario){
		return (Collection<Dono>) donoRepository.obterLista(usuario.getId());
	}
}
