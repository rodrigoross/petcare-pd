package br.edu.infnet.apppetshop.clients;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import br.edu.infnet.apppetshop.model.domain.Dono;

@FeignClient(url = "localhost:8082/api/donos", name = "donoClient")
public interface IDonoClient {

	@PostMapping(value = "/incluir")
	public void incluir(@RequestBody Dono dono);

	@DeleteMapping(value = "/{id}/excluir")
	public void excluir(@PathVariable Integer id);

	@GetMapping(value = "")
	public List<Dono> obterLista();
	
	@GetMapping(value = "/{id}/visualizar")
	public List<Dono> obterDonoPorId(@PathVariable Integer id);
}
