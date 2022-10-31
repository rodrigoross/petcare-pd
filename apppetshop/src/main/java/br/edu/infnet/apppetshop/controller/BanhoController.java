package br.edu.infnet.apppetshop.controller;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import br.edu.infnet.apppetshop.model.domain.Banho;

@Controller
public class BanhoController {
	private static Map<Integer, Banho> mapa = new HashMap<Integer, Banho>();
	private static Integer id = 1;

	public static void incluir(Banho banho) {
		// O id++ será 1 na primeira execução e após a inclusão do dado ele será 2.
		banho.setId(id++);

		mapa.put(banho.getId(), banho);
	}

	public static void remover(Integer id) {
		mapa.remove(id);
	}
	
	public static Collection<Banho> obterLista(){
		return mapa.values();
	}
	
	@GetMapping(value = "/banhos")
	public String telaBanhos(Model model) {
		// atributo <- banhos;
		model.addAttribute("lista", obterLista());

		return "banho/lista";
	}
	
	@GetMapping(value = "/banhos/{id}/excluir")
	public String excluirBanho(@PathVariable Integer id) {
		remover(id);
		
		return "redirect:/banhos";
	}
	
}
