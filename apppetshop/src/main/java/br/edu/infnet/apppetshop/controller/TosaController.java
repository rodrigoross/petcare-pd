package br.edu.infnet.apppetshop.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class TosaController {

	@GetMapping(value = "/tosas")
	public String telatosa() {
		return "tosa/lista";
	}
}
