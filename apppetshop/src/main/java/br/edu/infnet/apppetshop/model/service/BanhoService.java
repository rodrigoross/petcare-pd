package br.edu.infnet.apppetshop.model.service;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.edu.infnet.apppetshop.clients.IServicoClient;
import br.edu.infnet.apppetshop.model.domain.Banho;

@Service
public class BanhoService {
	@Autowired
	private IServicoClient servicoClient;
	
	public void incluir(Banho banho) {
		servicoClient.incluirBanho(banho);
	}

	public void remover(Integer id) {
		servicoClient.excluirBanho(id);
	}
	
	public Collection<Banho> obterLista(){
		return (Collection<Banho>) servicoClient.obterListaBanho();
	}
	
}
