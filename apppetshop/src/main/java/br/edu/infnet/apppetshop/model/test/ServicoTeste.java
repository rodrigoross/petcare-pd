package br.edu.infnet.apppetshop.model.test;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import br.edu.infnet.apppetshop.model.domain.Servico;

@Component
public class ServicoTeste implements ApplicationRunner{

	@Override
	public void run(ApplicationArguments args) throws Exception {
		Servico s1 = new Servico();
		s1.codigo = 123;
		s1.valor = 100;
		s1.nome = "Banho & Tosa";
		s1.animal = "Cadela";
		System.out.println("Servico - " + s1);
		
		Servico s2 = new Servico();
		s2.codigo = 456;
		s2.valor = 75;
		s2.nome = "Tosa";
		s2.animal = "Cão";
		System.out.println("Servico - " + s2);
		
		Servico s3 = new Servico();
		s3.codigo = 789;
		s3.valor = 145;
		s3.nome = "Consulta";
		s3.animal = "Gato";
		System.out.println("Servico - " + s3);
	}
}
