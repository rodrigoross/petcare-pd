package br.edu.infnet.apppetshop.model.test;

import java.time.LocalDateTime;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import br.edu.infnet.apppetshop.model.domain.Solicitacao;

@Component
public class SolicitacaoTeste implements ApplicationRunner {

	@Override
	public void run(ApplicationArguments args) throws Exception {
		Solicitacao s1 = new Solicitacao();
		s1.ordem = 123;
		s1.busca = false;
		s1.entrega = false;
		s1.data = LocalDateTime.now();
		s1.descricao = "Solicitacao 1";
		System.out.println("Solicitacao - " + s1);
		
		Solicitacao s2 = new Solicitacao();
		s2.ordem = 456;
		s2.busca = true;
		s2.entrega = false;
		s2.data = LocalDateTime.now();
		s2.descricao = "Solicitacao 2";
		System.out.println("Solicitacao - " + s2);
		
		Solicitacao s3 = new Solicitacao();
		s3.ordem = 789;
		s3.busca = false;
		s3.entrega = true;
		s3.data = LocalDateTime.now();
		s3.descricao = "Solicitacao 3";
		System.out.println("Solicitacao - " + s3);
	}
}
