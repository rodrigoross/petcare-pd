package br.edu.infnet.apppetshop.model.service;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.edu.infnet.apppetshop.clients.IServicoClient;
import br.edu.infnet.apppetshop.model.domain.Servico;

@Service
public class ServicoService {

	@Autowired
	private IServicoClient servicoClient;

	public void incluir(Servico servico) {
		servicoClient.incluir(servico);
	}

	public void remover(Integer id) {
		servicoClient.excluir(id);
	}

	public Collection<Servico> obterLista() {
		return (Collection<Servico>) servicoClient.obterLista();
	}

}
