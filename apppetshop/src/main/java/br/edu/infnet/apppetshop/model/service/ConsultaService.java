package br.edu.infnet.apppetshop.model.service;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.edu.infnet.apppetshop.clients.IServicoClient;
import br.edu.infnet.apppetshop.model.domain.Consulta;

@Service
public class ConsultaService {
	@Autowired
	private IServicoClient servicoClient;
	
	public void incluir(Consulta consulta) {
		servicoClient.incluirConsulta(consulta);
	}

	public void remover(Integer id) {
		servicoClient.excluirConsulta(id);
	}
	
	public Collection<Consulta> obterLista(){
		return (Collection<Consulta>) servicoClient.obterListaConsulta();
	}
}
