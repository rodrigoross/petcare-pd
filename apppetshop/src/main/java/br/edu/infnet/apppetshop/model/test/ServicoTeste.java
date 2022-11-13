package br.edu.infnet.apppetshop.model.test;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Order(3)
@Component
public class ServicoTeste implements ApplicationRunner {

	//@Autowired
	//private ServicoService serviceServico;
	
	@Override
	public void run(ApplicationArguments args) throws Exception {
		System.out.println("## Cadastro de serviços ##");

		// Banho b1 = new Banho();
		// b1.setCodigo(123);
		// b1.setValor(90);
		// b1.setNome("Banho & Tosa");
		// b1.setAnimal("Cadela");
		// b1.setEscovacao(true);
		// b1.setPorte(PorteAnimal.GRANDE);
		// b1.setObservacao("Alergia ao shampoo x");
		// serviceServico.incluir(b1);
		// System.out.println("> " + b1);
		
		// Consulta c1 = new Consulta();
		// c1.setCodigo(456);
		// c1.setValor(75);
		// c1.setNome("Consulta rotineira");
		// c1.setAnimal("Cão");
		// c1.setVacina(false);;
		// c1.setPeso(4);
		// c1.setRaca("Yorkshire Terrier");
		// serviceServico.incluir(c1);
		// System.out.println("> " + c1);

		// Tosa t1 = new Tosa();
		// t1.setCodigo(789);
		// t1.setValor(25);
		// t1.setNome("Aparar garras");
		// t1.setAnimal("Gato");
		// t1.setHigienica(false);
		// t1.setAparar(true);
		// t1.setEstilo("Garras curtas");
		// serviceServico.incluir(t1);
		// System.out.println("> " + t1);
	}
}
