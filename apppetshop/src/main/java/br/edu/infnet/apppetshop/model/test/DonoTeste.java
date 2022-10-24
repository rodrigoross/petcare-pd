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
		d1.nome = "Jurema da Silva";
		d1.cpf = "77522553008";
		d1.telefone = "+5565981726586";
		System.out.println("Dono - " + d1);
		
		Dono d2 = new Dono();
		d2.nome = "Baltazar dos Santos";
		d2.cpf = "75459728053";
		d2.telefone = "+5565972816586";
		System.out.println("Dono - " + d2);
		
		Dono d3 = new Dono();
		d3.nome = "Paula Tejano";
		d3.cpf = "04402606047";
		d3.telefone = "+5565981728665";
		System.out.println("Dono - " + d3);
	}

}
