package br.edu.infnet.apppetshop.model.domain;

public class Servico {
	public String nome;
	public float valor;
	public String animal;
	public int codigo;
	
	@Override
	public String toString() {
		return codigo + ";" + animal + ";" + nome + ";" + valor; 
	}
}
