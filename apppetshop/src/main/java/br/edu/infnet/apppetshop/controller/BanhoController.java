package br.edu.infnet.apppetshop.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import br.edu.infnet.apppetshop.model.domain.Banho;
import br.edu.infnet.apppetshop.model.domain.PorteAnimal;

@Controller
public class BanhoController {

	@GetMapping(value = "/banhos")
	public String telabanho(Model model) {
		Banho b1 = new Banho();
		b1.setCodigo(123);
		b1.setValor(90);
		b1.setNome("Banho & Tosa");
		b1.setAnimal("Cadela");
		b1.setEscovacao(true);
		b1.setPorte(PorteAnimal.GRANDE);
		b1.setObservacao("Alergia ao shampoo x");

		Banho b2 = new Banho();
		b2.setCodigo(321);
		b2.setValor(120);
		b2.setNome("Banho & Tosa");
		b2.setAnimal("Cão");
		b2.setEscovacao(false);
		b2.setPorte(PorteAnimal.MINI);
		b2.setObservacao("Ferida aberta na pata dianteira direita");
		
		Banho b3 = new Banho();
		b3.setCodigo(122);
		b3.setValor(85);
		b3.setNome("Banho & Tosa Higienica");
		b3.setAnimal("Cão");
		b3.setEscovacao(false);
		b3.setPorte(PorteAnimal.MEDIO);
		b3.setObservacao("Muito agitado");
		
		List<Banho> banhos = new ArrayList<Banho>();
		banhos.add(b1);
		banhos.add(b2);
		banhos.add(b3);
		
		// atributo <- banhos;
		model.addAttribute("lista", banhos);
		
		return "banho/lista";
	}
}
