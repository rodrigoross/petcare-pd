package br.edu.infnet.apppetshop.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class SolicitacaoController {

	@GetMapping(value = "/solicitacoes")
	public String telaSolicitacao() {
		return "solicitacao/lista";
	}
}
