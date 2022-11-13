package br.infnet.edu.apiservico.model.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.infnet.edu.apiservico.model.domain.Consulta;
import br.infnet.edu.apiservico.model.repository.ConsultaRepository;

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
	
	public List<Consulta> obterLista(){
		return (List<Consulta>) consultaRepository.findAll();
	}
	
	public Consulta carregarConsulta(Integer id) {
		return consultaRepository.buscaConsultaPorId(id);
	}
}
