package br.edu.infnet.apppetshop.model.domain;

public class Dono {
	public String nome;
	public String telefone;
	public String cpf;
	
	@Override
	public String toString() {
		return nome + ";" + telefone + ";" + cpf;
	}
}
