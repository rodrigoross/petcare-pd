package br.edu.infnet.apppetshop.model.service;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.edu.infnet.apppetshop.model.domain.Solicitacao;
import br.edu.infnet.apppetshop.model.repository.SolicitacaoRepository;

@Service
public class SolicitacaoService {
	@Autowired
	private SolicitacaoRepository solicitacaoRepository ;
	
	public void incluir(Solicitacao solicitacao) {
		solicitacaoRepository.save(solicitacao);
	}

	public void remover(Integer id) {
		solicitacaoRepository.deleteById(id);
	}
	
	public Collection<Solicitacao> obterLista(){
		return (Collection<Solicitacao>) solicitacaoRepository.findAll();
	}
	
}
