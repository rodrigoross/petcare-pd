package br.edu.infnet.apppetshop.controller;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import br.edu.infnet.apppetshop.model.domain.Solicitacao;

@Controller
public class SolicitacaoController {
	private static Map<Integer, Solicitacao> mapa = new HashMap<Integer, Solicitacao>();
	private static Integer id = 1;

	public static void incluir(Solicitacao solicitacao) {
		// O id++ será 1 na primeira execução e após a inclusão do dado ele será 2.
		solicitacao.setId(id++);

		mapa.put(solicitacao.getId(), solicitacao);
	}

	public static void remover(Integer id) {
		mapa.remove(id);
	}
	
	public static Collection<Solicitacao> obterLista(){
		return mapa.values();
	}

	@GetMapping(value = "/solicitacoes")
	public String telaSolicitacoes(Model model) {
		model.addAttribute("lista", obterLista());
		
		return "solicitacao/lista";
	}
	
	@GetMapping(value = "/solicitacoes/{id}/excluir")
	public String excluirBanho(@PathVariable Integer id) {
		remover(id);
		
		return "redirect:/solicitacoes";
	}
	
}
