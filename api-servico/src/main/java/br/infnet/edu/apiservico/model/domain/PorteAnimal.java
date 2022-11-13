package br.infnet.edu.apiservico.model.domain;

public enum PorteAnimal {
	MINI(1), PEQUENO(2), MEDIO(3), GRANDE(4);

	private final int valor;

	PorteAnimal(int valorOpcao){
		valor = valorOpcao;
	}

	public int getValor() {
		return valor;
	}
}
