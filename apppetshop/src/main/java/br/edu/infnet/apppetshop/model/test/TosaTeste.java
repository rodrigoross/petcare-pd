package br.edu.infnet.apppetshop.model.test;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import br.edu.infnet.apppetshop.model.domain.Tosa;

@Component
public class TosaTeste implements ApplicationRunner{

	@Override
	public void run(ApplicationArguments args) throws Exception {
		System.out.println("## Cadastro de tosas ###################");
		
		Tosa t1 = new Tosa();
		t1.higienica = false;
		t1.aparar = true;
		t1.estilo = "Pomodoro";
		System.out.println("Tosa - " + t1);
		
		Tosa c2 = new Tosa();
		c2.higienica = true;
		c2.aparar = true;
		c2.estilo = "Rente";
		System.out.println("Tosa - " + c2);
		
		Tosa t3 = new Tosa();
		t3.higienica = false;
		t3.aparar = false;
		t3.estilo = "Face redonda";
		System.out.println("Tosa - " + t3);
	}

}
