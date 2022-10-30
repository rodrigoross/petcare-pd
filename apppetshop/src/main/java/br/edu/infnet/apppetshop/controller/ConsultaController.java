package br.edu.infnet.apppetshop.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ConsultaController {

	@GetMapping(value = "/consultas")
	public String telaconsulta() {
		return "consulta/lista";
	}
}
