package br.edu.infnet.apppetshop.controller;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import br.edu.infnet.apppetshop.model.domain.Tosa;

@Controller
public class TosaController {
	private static Map<Integer, Tosa> mapa = new HashMap<Integer, Tosa>();
	private static Integer id = 1;

	public static void incluir(Tosa tosa) {
		// O id++ será 1 na primeira execução e após a inclusão do dado ele será 2.
		tosa.setId(id++);

		mapa.put(tosa.getId(), tosa);
	}

	public static void remover(Integer id) {
		mapa.remove(id);
	}
	
	public static Collection<Tosa> obterLista(){
		return mapa.values();
	}
	
	@GetMapping(value = "/tosas")
	public String telatosa(Model model) {
		model.addAttribute("lista", obterLista());
		
		return "tosa/lista";
	}

	@GetMapping(value = "/tosas/{id}/excluir")
	public String excluirBanho(@PathVariable Integer id) {
		remover(id);
		
		return "redirect:/tosas";
	}
}
