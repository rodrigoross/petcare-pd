package br.edu.infnet.apppetshop.model.service;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.edu.infnet.apppetshop.model.domain.Consulta;
import br.edu.infnet.apppetshop.model.repository.ConsultaRepository;

@Service
public class ConsultaService {
	@Autowired
	private ConsultaRepository consultaRepository;
	
	public void incluir(Consulta consulta) {
		consultaRepository.save(consulta);
	}

	public void remover(Integer id) {
		consultaRepository.deleteById(id);
	}
	
	public Collection<Consulta> obterLista(){
		return (Collection<Consulta>) consultaRepository.findAll();
	}
}
