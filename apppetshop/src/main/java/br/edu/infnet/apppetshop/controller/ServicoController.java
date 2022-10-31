package br.edu.infnet.apppetshop.controller;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import br.edu.infnet.apppetshop.model.domain.Servico;

@Controller
public class ServicoController {
	private static Map<Integer, Servico> mapa = new HashMap<Integer, Servico>();
	private static Integer id = 1;

	public static void incluir(Servico servico) {
		// O id++ será 1 na primeira execução e após a inclusão do dado ele será 2.
		servico.setId(id++);

		mapa.put(servico.getId(), servico);
	}

	public static void remover(Integer id) {
		mapa.remove(id);
	}
	
	public static Collection<Servico> obterLista(){
		return mapa.values();
	}
	
	@GetMapping(value = "/servicos")
	public String telaservico(Model model) {
		model.addAttribute("lista", obterLista());
		
		return "servico/lista";
	}
	
	@GetMapping(value = "/servicos/{id}/excluir")
	public String excluirBanho(@PathVariable Integer id) {
		remover(id);
		
		return "redirect:/servicos";
	}
}
