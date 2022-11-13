package br.infnet.edu.apiservico.model.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.infnet.edu.apiservico.model.domain.Tosa;
import br.infnet.edu.apiservico.model.repository.TosaRepository;

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
	
	public List<Tosa> obterLista(){
		return (List<Tosa>) tosaRepository.findAll();
	}

	public Tosa carregarTosa(Integer id) {
		return tosaRepository.buscaTosaPorId(id);
	}
}
