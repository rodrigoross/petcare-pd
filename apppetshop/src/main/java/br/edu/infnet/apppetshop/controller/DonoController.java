package br.edu.infnet.apppetshop.controller;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import br.edu.infnet.apppetshop.model.domain.Dono;

@Controller
public class DonoController {
	private static Map<Integer, Dono> mapa = new HashMap<Integer, Dono>();
	private static Integer id = 1;

	public static void incluir(Dono dono) {
		// O id++ será 1 na primeira execução e após a inclusão do dado ele será 2.
		dono.setId(id++);

		mapa.put(dono.getId(), dono);
	}

	public static void remover(Integer id) {
		mapa.remove(id);
	}
	
	public static Collection<Dono> obterLista(){
		return mapa.values();
	}
	
	@GetMapping(value = "/donos")
	public String telaDonos(Model model) {
		model.addAttribute("lista", obterLista());
		
		return "dono/lista";
	}
	
	@GetMapping(value = "/donos/{id}/excluir")
	public String excluirBanho(@PathVariable Integer id) {
		remover(id);
		
		return "redirect:/donos";
	}
}
