package br.edu.infnet.apppetshop.model.test;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import br.edu.infnet.apppetshop.model.domain.Consulta;

@Component
public class ConsultaTeste implements ApplicationRunner{

	@Override
	public void run(ApplicationArguments args) throws Exception {
		System.out.println("## Cadastro de Consultas ###################");
		
		Consulta c1 = new Consulta();
		c1.vacina = false;
		c1.peso = 4;
		c1.raca = "Yorkshire Terrier";
		System.out.println("Consulta - " + c1);
		
		Consulta c2 = new Consulta();
		c2.vacina = true;
		c2.peso = (float) 1.5;
		c2.raca = "Pinscher";
		System.out.println("Consulta - " + c2);
		
		Consulta c3 = new Consulta();
		c3.vacina = false;
		c3.peso = (float) 2.450;
		c3.raca = "Pug";
		System.out.println("Consulta - " + c3);
	
	}

}
