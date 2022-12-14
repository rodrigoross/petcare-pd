package br.edu.infnet.apppetshop.model.test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import br.edu.infnet.apppetshop.model.domain.Tosa;
import br.edu.infnet.apppetshop.model.service.TosaService;

@Order(6)
@Component
public class TosaTeste implements ApplicationRunner{

	@Autowired
	private TosaService tosaService;
	
	@Override
	public void run(ApplicationArguments args) throws Exception {
		System.out.println("## Cadastro de tosas ###################");
		
		Tosa t1 = new Tosa();
		t1.setCodigo(789);
		t1.setValor(25);
		t1.setNome("Aparar garras");
		t1.setAnimal("Gato");
		t1.setHigienica(false);
		t1.setAparar(true);
		t1.setEstilo("Garras curtas");
		tosaService.incluir(t1);
		System.out.println("> " + t1);
		
		Tosa t2 = new Tosa();
		t2.setCodigo(987);
		t2.setValor(25);
		t2.setNome("Tosa higiênica");
		t2.setAnimal("Cadela");
		t2.setHigienica(true);
		t2.setAparar(true);
		t2.setEstilo("Rente");
		tosaService.incluir(t2);
		System.out.println("> " + t2);
		
		Tosa t3 = new Tosa();
		t3.setCodigo(788);
		t3.setValor(45);
		t3.setNome("Corte");
		t3.setAnimal("Cão");
		t3.setHigienica(false);
		t3.setAparar(false);
		t3.setEstilo("Face redonda");
		tosaService.incluir(t3);
		System.out.println("> " + t3);
	}

}
