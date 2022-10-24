package br.edu.infnet.apppetshop.model.domain;

public class Consulta extends Servico {
	public String raca;
	public boolean vacina;
	public float peso;
	public String observacao;
	
	@Override
	public String toString() {
		return raca + ";" + vacina + ";" + peso + ";" + observacao;
	}
}
