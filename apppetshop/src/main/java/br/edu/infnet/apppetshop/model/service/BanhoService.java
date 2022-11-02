package br.edu.infnet.apppetshop.model.service;

import java.util.Collection;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.edu.infnet.apppetshop.model.domain.Banho;
import br.edu.infnet.apppetshop.model.repository.BanhoRepository;

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
	
	public Collection<Banho> obterLista(){
		return (Collection<Banho>) banhoRepository.findAll();
	}
	
}
