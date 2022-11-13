package br.infnet.edu.apiservico.model.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.infnet.edu.apiservico.model.domain.Servico;
import br.infnet.edu.apiservico.model.repository.ServicoRepository;

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
	
	public List<Servico> obterLista(){
		return (List<Servico>) servicoRepository.findAll();
	}
	
	public Servico carregarServico(Integer id) {
		return servicoRepository.buscaServicoPorId(id);
	}
}
