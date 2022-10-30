package br.edu.infnet.apppetshop.model.test;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import br.edu.infnet.apppetshop.model.domain.Dono;

@Component
public class DonoTeste implements ApplicationRunner {

	@Override
	public void run(ApplicationArguments args) throws Exception {
		System.out.println("## Cadastro de donos ###################");
		
		Dono d1 = new Dono();
		d1.setNome("Jurema da Silva");
		d1.setCpf("77522553008");
		d1.setTelefone("+5565981726586");
		System.out.println("> " + d1);
		
		Dono d2 = new Dono();
		d2.setNome("Baltazar dos Santos");
		d2.setCpf("75459728053");
		d2.setTelefone("+5565972816586");
		System.out.println("> " + d2);
		
		Dono d3 = new Dono();
		d3.setNome("Paula Tejano");
		d3.setCpf("04402606047");
		d3.setTelefone("+5565981728665");
		System.out.println("> " + d3);
	}

}
