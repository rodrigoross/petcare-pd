package br.infnet.edu.apisolicitacao.model.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.infnet.edu.apisolicitacao.model.domain.Solicitacao;
import br.infnet.edu.apisolicitacao.model.repository.SolicitacaoRepository;


@Service
public class SolicitacaoService {

	@Autowired
	private SolicitacaoRepository solicitacaoRepository;
	
	public void incluir(Solicitacao solicitacao) {
		solicitacaoRepository.save(solicitacao);
	}

	public void remover(Integer id) {
		solicitacaoRepository.deleteById(id);
	}
	
	public List<Solicitacao> obterLista(){
		return (List<Solicitacao>) solicitacaoRepository.findAll();
	}
	
	public Solicitacao carregarSolicitacao(Integer id){
		return solicitacaoRepository.buscarSolicitacaoPorId(id);
	}
}
