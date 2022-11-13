package br.infnet.edu.apiservico.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.infnet.edu.apiservico.model.domain.Servico;
import br.infnet.edu.apiservico.model.service.ServicoService;

@RestController
@RequestMapping("/api/servicos")
public class ServicoController {

	@Autowired
	private ServicoService servicoService;

	// FIXME Gera erro: Cannot construct instance of `br.infnet.edu.apiservico.model.domain.Servico` (no Creators, like default constructor, exist): 
	//	abstract types either need to be mapped to concrete types, have custom deserializer, or contain additional type information
	@PostMapping(value = "/incluir")
	public void incluir(@RequestBody Servico servico) {
		System.out.println("# Incluir " + servico);
	
		servicoService.incluir(servico);
	}

	@DeleteMapping(value = "/{id}/excluir")
	public void excluir(@PathVariable Integer id) {
		System.out.println("# Excluindo " + id);

		servicoService.remover(id);
	}

	@GetMapping(value = "")
	public List<Servico> obterLista() {
		System.out.println("# Carregando serviços...");

		return servicoService.obterLista();
	}

	@GetMapping(value = "/{id}/visualizar")
	public Servico visuarlizarServico(@PathVariable Integer id) {
		System.out.println("# Carregando serviço " + id);

		return servicoService.carregarServico(id);
	}
}
