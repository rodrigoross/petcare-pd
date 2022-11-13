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

import br.infnet.edu.apiservico.model.domain.Banho;
import br.infnet.edu.apiservico.model.service.BanhoService;

@RestController
@RequestMapping("/api/servicos/banhos")
public class BanhoControlller {

	@Autowired
	private BanhoService banhoService;
	
	 @PostMapping(value = "/incluir")
	 public void incluir(@RequestBody Banho banho) {
		System.out.println("# Incluir " + banho);
		
		banhoService.incluir(banho);
		}

	@DeleteMapping(value = "/{id}/excluir")
	public void excluir(@PathVariable Integer id) {
		System.out.println("# Excluindo " + id);
		
		banhoService.remover(id);
	}

	@GetMapping(value = "")
	public List<Banho> obterLista() {
		System.out.println("# Carregando serviços de banhos...");
		
		return banhoService.obterLista();
	}
	
	@GetMapping(value = "/{id}/visualizar")
	public Banho visuarlizarServico(@PathVariable Integer id) {
		System.out.println("# Carregando banho " + id);
		
		return banhoService.carregarBanho(id);
	}
}
