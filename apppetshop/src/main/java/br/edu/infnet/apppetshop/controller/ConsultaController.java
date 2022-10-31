package br.edu.infnet.apppetshop.controller;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import br.edu.infnet.apppetshop.model.domain.Consulta;

@Controller
public class ConsultaController {
	private static Map<Integer, Consulta> mapa = new HashMap<Integer, Consulta>();
	private static Integer id = 1;

	public static void incluir(Consulta consulta) {
		// O id++ será 1 na primeira execução e após a inclusão do dado ele será 2.
		consulta.setId(id++);

		mapa.put(consulta.getId(), consulta);
	}

	public static void remover(Integer id) {
		mapa.remove(id);
	}
	
	public static Collection<Consulta> obterLista(){
		return mapa.values();
	}
	
	@GetMapping(value = "/consultas")
	public String telaConsultas(Model model) {
		model.addAttribute("lista", obterLista());
		
		return "consulta/lista";
	}
	
	@GetMapping(value = "/consultas/{id}/excluir")
	public String excluirBanho(@PathVariable Integer id) {
		remover(id);
		
		return "redirect:/consultas";
	}
}
