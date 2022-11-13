package br.edu.infnet.apppetshop.model.test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import br.edu.infnet.apppetshop.model.domain.Dono;
import br.edu.infnet.apppetshop.model.domain.Usuario;
import br.edu.infnet.apppetshop.model.service.DonoService;

@Order(2)
@Component
public class DonoTeste implements ApplicationRunner {

	@Autowired
	private DonoService donoService;
	
	@Override
	public void run(ApplicationArguments args) throws Exception {
		System.out.println("## Cadastro de donos ##");
		
		Usuario usuario = new Usuario();
		usuario.setId(1);
		
		Dono d1 = new Dono();
		d1.setNome("Jurema da Silva");
		d1.setCpf("77522553008");
		d1.setTelefone("+5565981726586");
		//d1.setUsuario(usuario);
		donoService.incluir(d1);
		
		Dono d2 = new Dono();
		d2.setNome("Baltazar dos Santos");
		d2.setCpf("75459728053");
		d2.setTelefone("+5565972816586");
		//d2.setUsuario(usuario);
		donoService.incluir(d2);
		
		Dono d3 = new Dono();
		d3.setNome("Paula Tejano");
		d3.setCpf("04402606047");
		d3.setTelefone("+5565981728665");
		//d3.setUsuario(usuario);
		donoService.incluir(d3);
	}

}
