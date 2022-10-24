package br.edu.infnet.apppetshop.model.domain;

public class Banho extends Servico {
	public String observacao;
	public boolean escovacao;
	public PorteAnimal porte;

	@Override
	public String toString() {
		return porte + ";" + escovacao + ";" + observacao;
	}
}
