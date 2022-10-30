package br.edu.infnet.apppetshop.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ServicoController {

	@GetMapping(value = "/servicos")
	public String telaservico() {
		return "servico/lista";
	}
}
