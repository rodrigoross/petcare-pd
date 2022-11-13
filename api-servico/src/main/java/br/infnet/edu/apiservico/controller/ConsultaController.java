package br.infnet.edu.apiservico.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.infnet.edu.apiservico.model.domain.Consulta;
import br.infnet.edu.apiservico.model.service.ConsultaService;

@RestController
@RequestMapping("/api/servicos/consultas")
public class ConsultaController {

	@Autowired
	private ConsultaService consultaService;

	@PostMapping(value = "/incluir")
	public void incluir(@RequestBody Consulta consulta) {
		System.out.println("# Incluir " + consulta);

		consultaService.incluir(consulta);
	}

	@DeleteMapping(value = "/{id}/excluir")
	public void excluir(@PathVariable Integer id) {
		System.out.println("# Excluindo " + id);

		consultaService.remover(id);
	}

	@GetMapping(value = "")
	public List<Consulta> obterLista() {
		System.out.println("# Carregando serviços de consultas...");

		return consultaService.obterLista();
	}

	@GetMapping(value = "/{id}/visualizar")
	public Consulta visuarlizarServico(@PathVariable Integer id) {
		System.out.println("# Carregando consulta " + id);

		return consultaService.carregarConsulta(id);
	}
}
