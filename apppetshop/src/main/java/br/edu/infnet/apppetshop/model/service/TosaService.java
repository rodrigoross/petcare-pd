package br.edu.infnet.apppetshop.model.service;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.edu.infnet.apppetshop.model.domain.Tosa;
import br.edu.infnet.apppetshop.model.repository.TosaRepository;

@Service
public class TosaService {
	@Autowired
	private TosaRepository tosaRepository;
	
	public void incluir(Tosa tosa) {
		tosaRepository.save(tosa);
	}

	public void remover(Integer id) {
		tosaRepository.deleteById(id);
	}
	
	public Collection<Tosa> obterLista(){
		return (Collection<Tosa>) tosaRepository.findAll();
	}
	
}
