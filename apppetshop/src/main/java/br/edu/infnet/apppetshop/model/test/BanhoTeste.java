package br.edu.infnet.apppetshop.model.test;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import br.edu.infnet.apppetshop.model.domain.Banho;
import br.edu.infnet.apppetshop.model.domain.PorteAnimal;

@Component
public class BanhoTeste implements ApplicationRunner{

	@Override
	public void run(ApplicationArguments args) throws Exception {
		System.out.println("## Cadastro de Banhos ###################");
		
		Banho b1 = new Banho();
		b1.escovacao = true;
		b1.porte = PorteAnimal.GRANDE;
		b1.observacao = "Alergia ao shampoo x";
		System.out.println("Banho - " + b1);
		
		Banho b2 = new Banho();
		b2.escovacao = false;
		b2.porte =  PorteAnimal.MINI;
		b2.observacao = "Tosa";
		b2.animal = "Ferida aberta na pata dianteira direita";
		System.out.println("Banho - " + b2);
		
		Banho b3 = new Banho();
		b3.escovacao = true;
		b3.porte =  PorteAnimal.MEDIO;
		b3.observacao = "Muito agitado";
		System.out.println("Banho - " + b3);
	}

}
