package br.infnet.edu.apisolicitacao.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.infnet.edu.apisolicitacao.model.domain.Solicitacao;
import br.infnet.edu.apisolicitacao.model.service.SolicitacaoService;

@RestController
@RequestMapping("/api/solicitacoes")
public class SolicitacaoController {

	@Autowired
	private SolicitacaoService solicitacaoService;
	
	@PostMapping(value = "/incluir")
	public void incluir(@RequestBody Solicitacao solicitacao) {
		System.out.println("# Incluir " + solicitacao);
		
		solicitacaoService.incluir(solicitacao);
	}

	@DeleteMapping(value = "/{id}/excluir")
	public void excluir(@PathVariable Integer id) {
		System.out.println("# Excluindo " + id);
		
		solicitacaoService.remover(id);
	}

	@GetMapping(value = "")
	public List<Solicitacao> obterLista() {
		System.out.println("# Carregando solicições...");
		
		return solicitacaoService.obterLista();
	}
	
	@GetMapping(value = "/{id}/visualizar")
	public Solicitacao visuarlizarDono(@PathVariable Integer id) {
		System.out.println("# Carregando solicitação " + id);
		
		return solicitacaoService.carregarSolicitacao(id);
	}
}
