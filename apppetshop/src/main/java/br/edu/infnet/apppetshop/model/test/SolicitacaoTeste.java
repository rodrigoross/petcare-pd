package br.edu.infnet.apppetshop.model.test;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import br.edu.infnet.apppetshop.model.domain.Banho;
import br.edu.infnet.apppetshop.model.domain.Consulta;
import br.edu.infnet.apppetshop.model.domain.Dono;
import br.edu.infnet.apppetshop.model.domain.PorteAnimal;
import br.edu.infnet.apppetshop.model.domain.Servico;
import br.edu.infnet.apppetshop.model.domain.Solicitacao;
import br.edu.infnet.apppetshop.model.domain.Tosa;
import br.edu.infnet.apppetshop.model.service.SolicitacaoService;

@Order(2)
@Component
public class SolicitacaoTeste implements ApplicationRunner {
	
	@Autowired
	private SolicitacaoService solicitacaoService;
	
	@Override
	public void run(ApplicationArguments args) throws Exception {
		System.out.println("## Cadastro de solicitacoes ###################");
		
		//-------------------------------------
		// Inicialização dos objetos Dono
		//-------------------------------------
		Dono d1 = new Dono();
		d1.setNome("Jurema da Silva");
		d1.setCpf("77522553008");
		d1.setTelefone("+5565981726586");
		
		Dono d2 = new Dono();
		d2.setNome("Baltazar dos Santos");
		d2.setCpf("75459728053");
		d2.setTelefone("+5565972816586");
		
		//-------------------------------------
		// Serviços
		//-------------------------------------
		Banho banho = new Banho();
		banho.setCodigo(123);
		banho.setValor(90);
		banho.setNome("Banho & Tosa");
		banho.setAnimal("Cadela");
		banho.setEscovacao(true);
		banho.setPorte(PorteAnimal.GRANDE);
		banho.setObservacao("Alergia ao shampoo x");
		
		Consulta consulta = new Consulta();
		consulta.setCodigo(456);
		consulta.setValor(75);
		consulta.setNome("Consulta rotineira");
		consulta.setAnimal("Cão");
		consulta.setVacina(false);;
		consulta.setPeso(4);
		consulta.setRaca("Yorkshire Terrier");

		Tosa tosa = new Tosa();
		tosa.setCodigo(789);
		tosa.setValor(25);
		tosa.setNome("Aparar garras");
		tosa.setAnimal("Gato");
		tosa.setHigienica(false);
		tosa.setAparar(true);
		tosa.setEstilo("Garras curtas");
		
		//-------------------------------------
		// Inicialização das Listas
		//-------------------------------------
		List<Servico> servicosPrimeiraSolicitacao = new ArrayList<Servico>();
		servicosPrimeiraSolicitacao.add(banho);
		servicosPrimeiraSolicitacao.add(tosa);
		
		List<Servico> servicoDemaisSolicitacoes = new ArrayList<Servico>();
		servicoDemaisSolicitacoes.add(banho);
		servicoDemaisSolicitacoes.add(tosa);
		servicoDemaisSolicitacoes.add(consulta);
		
		//-------------------------------------
		// Solicitações
		//-------------------------------------
		Solicitacao s1 = new Solicitacao();
		s1.setOrdem(123);
		s1.setBusca(false);
		s1.setEntrega(false);
		s1.setDescricao("Solicitacao 1");
		s1.setDono(d1);
		s1.setServicos(servicosPrimeiraSolicitacao);
		System.out.println(">  " + s1);
		solicitacaoService.incluir(s1);
		
		Solicitacao s2 = new Solicitacao();
		s2.setOrdem(456);
		s2.setBusca(true);
		s2.setEntrega(false);
		s2.setDescricao("Solicitacao 2");
		s2.setDono(d1);
		s2.setServicos(servicoDemaisSolicitacoes);
		System.out.println(">  " + s2);
		solicitacaoService.incluir(s2);
		
		Solicitacao s3 = new Solicitacao();
		s3.setOrdem(789);
		s3.setBusca(false);
		s3.setEntrega(true);
		s3.setDescricao("Solicitacao 3");
		s3.setDono(d2);
		s3.setServicos(servicoDemaisSolicitacoes);
		System.out.println(">  " + s3);
		solicitacaoService.incluir(s3);
	}
}
