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

import br.infnet.edu.apiservico.model.domain.Tosa;
import br.infnet.edu.apiservico.model.service.TosaService;

@RestController
@RequestMapping("/api/servicos/tosas")
public class TosaController {

	@Autowired
	private TosaService tosaService;
	
	@PostMapping(value = "/incluir")
	 public void incluir(@RequestBody Tosa tosa) {
		System.out.println("# Incluir " + tosa);
		
		tosaService.incluir(tosa);
	}

	@DeleteMapping(value = "/{id}/excluir")
	public void excluir(@PathVariable Integer id) {
		System.out.println("# Excluindo " + id);
		
		tosaService.remover(id);
	}

	@GetMapping(value = "")
	public List<Tosa> obterLista() {
		System.out.println("# Carregando serviços de tosa...");
		
		return tosaService.obterLista();
	}
	
	@GetMapping(value = "/{id}/visualizar")
	public Tosa visuarlizarServico(@PathVariable Integer id) {
		System.out.println("# Carregando tosa " + id);
		
		return tosaService.carregarTosa(id);
	}
}
