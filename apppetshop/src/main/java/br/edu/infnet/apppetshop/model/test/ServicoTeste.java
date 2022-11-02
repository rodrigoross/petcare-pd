package br.edu.infnet.apppetshop.model.test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import br.edu.infnet.apppetshop.model.domain.Banho;
import br.edu.infnet.apppetshop.model.domain.Consulta;
import br.edu.infnet.apppetshop.model.domain.PorteAnimal;
import br.edu.infnet.apppetshop.model.domain.Tosa;
import br.edu.infnet.apppetshop.model.service.ServicoService;

@Order(3)
@Component
public class ServicoTeste implements ApplicationRunner {

	@Autowired
	private ServicoService serviceServico;
	
	@Override
	public void run(ApplicationArguments args) throws Exception {
		System.out.println("## Cadastro de serviços ###################");

		Banho b1 = new Banho();
		b1.setCodigo(123);
		b1.setValor(90);
		b1.setNome("Banho & Tosa");
		b1.setAnimal("Cadela");
		b1.setEscovacao(true);
		b1.setPorte(PorteAnimal.GRANDE);
		b1.setObservacao("Alergia ao shampoo x");
		System.out.println("> " + b1);
		serviceServico.incluir(b1);
		
		Consulta c1 = new Consulta();
		c1.setCodigo(456);
		c1.setValor(75);
		c1.setNome("Consulta rotineira");
		c1.setAnimal("Cão");
		c1.setVacina(false);;
		c1.setPeso(4);
		c1.setRaca("Yorkshire Terrier");
		System.out.println("> " + c1);
		serviceServico.incluir(c1);

		Tosa t1 = new Tosa();
		t1.setCodigo(789);
		t1.setValor(25);
		t1.setNome("Aparar garras");
		t1.setAnimal("Gato");
		t1.setHigienica(false);
		t1.setAparar(true);
		t1.setEstilo("Garras curtas");
		System.out.println("> " + t1);
		serviceServico.incluir(t1);
	}
}
