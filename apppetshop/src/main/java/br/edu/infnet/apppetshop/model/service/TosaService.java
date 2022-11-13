package br.edu.infnet.apppetshop.model.service;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.edu.infnet.apppetshop.clients.IServicoClient;
import br.edu.infnet.apppetshop.model.domain.Tosa;

@Service
public class TosaService {
	@Autowired
	private IServicoClient servicoClient;
	
	public void incluir(Tosa tosa) {
		servicoClient.incluirTosa(tosa);
	}

	public void remover(Integer id) {
		servicoClient.excluirTosa(id);
	}
	
	public Collection<Tosa> obterLista(){
		return (Collection<Tosa>) servicoClient.obterListaTosa();
	}
	
}
