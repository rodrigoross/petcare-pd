package br.edu.infnet.apppetshop.clients;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import br.edu.infnet.apppetshop.model.domain.Banho;
import br.edu.infnet.apppetshop.model.domain.Consulta;
import br.edu.infnet.apppetshop.model.domain.Servico;
import br.edu.infnet.apppetshop.model.domain.Tosa;

@FeignClient(url = "localhost:8083/api/servicos", name = "servicoClient")
public interface IServicoClient {

	// TODO Verificar forma para incluir classe filha junto com a mãe
	@PostMapping(value = "/incluir")
	public void incluir(@RequestBody Servico servico);

	@DeleteMapping(value = "/{id}/excluir")
	public void excluir(@PathVariable Integer id);

	@GetMapping(value = "")
	public List<Servico> obterLista();

	// ------------------
	// Banhos
	// ------------------

	@GetMapping(value = "/banhos")
	public List<Banho> obterListaBanho();

	@GetMapping(value = "/banhos/{id}/visualizar")
	public void visualizarBanho(@PathVariable Integer id);

	@PostMapping(value = "/banhos/incluir")
	public void incluirBanho(@RequestBody Banho servico);

	@DeleteMapping(value = "/banhos/{id}/excluir")
	public void excluirBanho(@PathVariable Integer id);

	// ------------------
	// Consultas
	// ------------------

	@GetMapping(value = "/consultas")
	public List<Consulta> obterListaConsulta();

	@GetMapping(value = "/consultas/{id}/visualizar")
	public void visualizarConsulta(@PathVariable Integer id);

	@PostMapping(value = "/consultas/incluir")
	public void incluirConsulta(@RequestBody Consulta servico);

	@DeleteMapping(value = "/consultas/{id}/excluir")
	public void excluirConsulta(@PathVariable Integer id);

	// ------------------
	// Consultas
	// ------------------

	@GetMapping(value = "/tosas")
	public List<Tosa> obterListaTosa();

	@GetMapping(value = "/tosas/{id}/visualizar")
	public void visualizarTosa(@PathVariable Integer id);

	@PostMapping(value = "/tosas/incluir")
	public void incluirTosa(@RequestBody Tosa servico);

	@DeleteMapping(value = "/tosas/{id}/excluir")
	public void excluirTosa(@PathVariable Integer id);
}
