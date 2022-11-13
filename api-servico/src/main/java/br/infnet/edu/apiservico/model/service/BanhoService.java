package br.infnet.edu.apiservico.model.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.infnet.edu.apiservico.model.domain.Banho;
import br.infnet.edu.apiservico.model.repository.BanhoRepository;

@Service
public class BanhoService {
	@Autowired
	private BanhoRepository banhoRepository;
	
	public void incluir(Banho banho) {
		banhoRepository.save(banho);
	}

	public void remover(Integer id) {
		banhoRepository.deleteById(id);
	}
	
	public List<Banho> obterLista(){
		return (List<Banho>) banhoRepository.findAll();
	}
	
	public Banho carregarBanho(Integer id) {
		return banhoRepository.buscaBanhoPorId(id);
	}
}
