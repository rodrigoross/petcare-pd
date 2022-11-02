package br.edu.infnet.apppetshop.model.domain;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "consultas")
public class Consulta extends Servico {
	private String raca;
	private boolean vacina;
	private float peso;
	private String observacao;
	
	@Override
	public String toString() {
		return super.toString() + ";" + raca + ";" + vacina + ";" + peso + ";" + observacao;
	}

	public String getRaca() {
		return raca;
	}

	public void setRaca(String raca) {
		this.raca = raca;
	}

	public boolean isVacina() {
		return vacina;
	}

	public void setVacina(boolean vacina) {
		this.vacina = vacina;
	}

	public float getPeso() {
		return peso;
	}

	public void setPeso(float peso) {
		this.peso = peso;
	}

	public String getObservacao() {
		return observacao;
	}

	public void setObservacao(String observacao) {
		this.observacao = observacao;
	}
	
}
