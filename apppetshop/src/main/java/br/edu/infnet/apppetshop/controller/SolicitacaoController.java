package br.edu.infnet.apppetshop.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.SessionAttribute;

import br.edu.infnet.apppetshop.model.domain.Solicitacao;
import br.edu.infnet.apppetshop.model.domain.Usuario;
import br.edu.infnet.apppetshop.model.service.DonoService;
import br.edu.infnet.apppetshop.model.service.ServicoService;
import br.edu.infnet.apppetshop.model.service.SolicitacaoService;

@Controller
public class SolicitacaoController {
	@Autowired
	private SolicitacaoService solicitacaoService;

	@Autowired
	private DonoService donoService;
	
	@Autowired
	private ServicoService servicoService;
	
	@GetMapping(value = "/solicitacoes")
	public String telaSolicitacoes(Model model) {
		model.addAttribute("lista", solicitacaoService.obterLista());
		
		return "solicitacao/lista";
	}

	@GetMapping(value = "/solicitacoes/incluir")
	public String telaCadastro(Model model, @SessionAttribute("autenticado") Usuario autenticado) {
		
		model.addAttribute("donos", donoService.obterLista());
		model.addAttribute("servicos", servicoService.obterLista());
		
		return "solicitacao/cadastro";
	}
	
	@PostMapping(value = "/solicitacoes/incluir")
	public String incluir(Solicitacao solicitacao, @SessionAttribute("autenticado") Usuario usuario) {
		
		solicitacaoService.incluir(solicitacao);
		
		return "redirect:/solicitacoes";
	}
	
	@GetMapping(value = "/solicitacoes/{id}/excluir")
	public String excluirSolicitacao(@PathVariable Integer id) {
		solicitacaoService.remover(id);
		
		return "redirect:/solicitacoes";
	}
	
}
