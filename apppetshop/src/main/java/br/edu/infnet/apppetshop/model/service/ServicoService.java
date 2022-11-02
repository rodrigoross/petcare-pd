package br.edu.infnet.apppetshop.model.service;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.edu.infnet.apppetshop.model.domain.Servico;
import br.edu.infnet.apppetshop.model.repository.ServicoRepository;

@Service
public class ServicoService {
	@Autowired
	private ServicoRepository servicoRepository;
	
	public void incluir(Servico servico) {
		servicoRepository.save(servico);
	}

	public void remover(Integer id) {
		servicoRepository.deleteById(id);
	}
	
	public Collection<Servico> obterLista(){
		return (Collection<Servico>) servicoRepository.findAll();
	}
	
}
