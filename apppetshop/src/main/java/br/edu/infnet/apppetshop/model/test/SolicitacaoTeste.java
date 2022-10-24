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
		s1.setOrdem(123);
		s1.setBusca(false);
		s1.setEntrega(false);
		s1.setData(LocalDateTime.now());
		s1.setDescricao("Solicitacao 1");
		System.out.println("Solicitacao - " + s1);
		
		Solicitacao s2 = new Solicitacao();
		s2.setOrdem(456);
		s2.setBusca(true);
		s2.setEntrega(false);
		s2.setData(LocalDateTime.now());
		s2.setDescricao("Solicitacao 2");
		System.out.println("Solicitacao - " + s2);
		
		Solicitacao s3 = new Solicitacao();
		s3.setOrdem(789);
		s3.setBusca(false);
		s3.setEntrega(true);
		s3.setData(LocalDateTime.now());
		s3.setDescricao("Solicitacao 3");
		System.out.println("Solicitacao - " + s3);
	}
}
