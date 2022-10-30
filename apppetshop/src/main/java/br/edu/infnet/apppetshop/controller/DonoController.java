package br.edu.infnet.apppetshop.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class DonoController {

	@GetMapping(value = "/donos")
	public String teladono() {
		return "dono/lista";
	}
}
