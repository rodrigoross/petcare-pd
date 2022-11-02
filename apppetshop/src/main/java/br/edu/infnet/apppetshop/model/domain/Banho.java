package br.edu.infnet.apppetshop.model.domain;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "banhos")
public class Banho extends Servico {
	private String observacao;
	private boolean escovacao;
	private PorteAnimal porte;

	@Override
	public String toString() {
		return super.toString() + ";" + porte + ";" + escovacao + ";" + observacao;
	}

	public String getObservacao() {
		return observacao;
	}

	public void setObservacao(String observacao) {
		this.observacao = observacao;
	}

	public boolean isEscovacao() {
		return escovacao;
	}

	public void setEscovacao(boolean escovacao) {
		this.escovacao = escovacao;
	}

	public PorteAnimal getPorte() {
		return porte;
	}

	public void setPorte(PorteAnimal porte) {
		this.porte = porte;
	}

}
