package br.edu.infnet.apppetshop.model.test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import br.edu.infnet.apppetshop.model.domain.Consulta;
import br.edu.infnet.apppetshop.model.service.ConsultaService;

@Order(4)
@Component
public class ConsultaTeste implements ApplicationRunner{

	@Autowired
	private ConsultaService consultaService;
	
	@Override
	public void run(ApplicationArguments args) throws Exception {
		System.out.println("## Cadastro de Consultas ###################");
		
		Consulta c1 = new Consulta();
		c1.setCodigo(456);
		c1.setValor(75);
		c1.setNome("Consulta rotineira");
		c1.setAnimal("Cão");
		c1.setVacina(false);;
		c1.setPeso(4);
		c1.setRaca("Yorkshire Terrier");
		c1.setObservacao("já fez cirurgia");
		consultaService.incluir(c1);
		System.out.println("> " + c1);
		
		Consulta c2 = new Consulta();
		c2.setCodigo(654);
		c2.setValor(150);
		c2.setNome("Vacinação");
		c2.setAnimal("Cão");
		c2.setVacina(true);
		c2.setPeso((float)1.5);
		c2.setRaca("Pinscher");
		c2.setObservacao("Idoso");
		consultaService.incluir(c2);
		System.out.println("> " + c2);
		
		Consulta c3 = new Consulta();
		c3.setCodigo(655);
		c3.setValor(75);
		c3.setNome("Inspeção");
		c3.setAnimal("Cão");
		c3.setVacina(false);
		c3.setPeso((float) 2.450);
		c3.setRaca("Pug");
		c3.setObservacao("Espumando pelo nariz");
		consultaService.incluir(c3);
		System.out.println("> " + c3);
	}

}
