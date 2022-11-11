package br.edu.infnet.apppetshop.model.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.edu.infnet.apppetshop.clients.IEnderecoClient;
import br.edu.infnet.apppetshop.model.domain.Endereco;

@Service
public class EnderecoService {
	
	@Autowired
	private IEnderecoClient enderecoClient;
	
	public Endereco obterEnderecoViaCep(String cep) {
		return enderecoClient.obterEnderecoViaCep(cep);
	}
}
