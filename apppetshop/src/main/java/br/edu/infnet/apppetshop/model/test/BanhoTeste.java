package br.edu.infnet.apppetshop.model.test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import br.edu.infnet.apppetshop.model.domain.Banho;
import br.edu.infnet.apppetshop.model.domain.PorteAnimal;
import br.edu.infnet.apppetshop.model.service.BanhoService;

@Order(4)
@Component
public class BanhoTeste implements ApplicationRunner {

	@Autowired
	BanhoService banhoService;
	
	@Override
	public void run(ApplicationArguments args) throws Exception {
		System.out.println("## Cadastro de Banhos ###################");
		
		Banho b1 = new Banho();
		b1.setCodigo(123);
		b1.setValor(90);
		b1.setNome("Banho & Tosa");
		b1.setAnimal("Cadela");
		b1.setEscovacao(true);
		b1.setPorte(PorteAnimal.GRANDE);
		b1.setObservacao("Alergia ao shampoo x");
		System.out.println("> " + b1);
		banhoService.incluir(b1);

		Banho b2 = new Banho();
		b2.setCodigo(321);
		b2.setValor(120);
		b2.setNome("Banho & Tosa");
		b2.setAnimal("Cão");
		b2.setEscovacao(false);
		b2.setPorte(PorteAnimal.MINI);
		b2.setObservacao("Ferida aberta na pata dianteira direita");
		System.out.println("> " + b2);
		banhoService.incluir(b2);
		
		Banho b3 = new Banho();
		b3.setCodigo(122);
		b3.setValor(85);
		b3.setNome("Banho & Tosa Higienica");
		b3.setAnimal("Cão");
		b3.setEscovacao(false);
		b3.setPorte(PorteAnimal.MEDIO);
		b3.setObservacao("Muito agitado");
		System.out.println("> " + b3);
		banhoService.incluir(b3);
	}

}
