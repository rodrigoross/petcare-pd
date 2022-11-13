package br.infnet.edu.apidono.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.infnet.edu.apidono.model.domain.Dono;
import br.infnet.edu.apidono.model.service.DonoService;

@RestController
@RequestMapping("/api/donos")
public class DonoController {
	
	@Autowired
	private DonoService donoService;
	
	@PostMapping(value = "/incluir")
	public void incluir(@RequestBody Dono dono) {
		System.out.println("# Incluir " + dono);
		
		donoService.incluir(dono);
	}

	@DeleteMapping(value = "/{id}/excluir")
	public void excluir(@PathVariable Integer id) {
		System.out.println("# Excluindo " + id);
		
		donoService.remover(id);
	}

	@GetMapping(value = "")
	public List<Dono> obterLista() {
		System.out.println("# Carregando donos...");
		
		return donoService.obterLista();
	}
	
	@GetMapping(value = "/{id}/visualizar")
	public Dono visuarlizarDono(@PathVariable Integer id) {
		System.out.println("# Carregando dono " + id);
		
		return donoService.carregarDono(id);
	}
}
