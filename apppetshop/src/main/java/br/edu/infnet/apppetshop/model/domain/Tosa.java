package br.edu.infnet.apppetshop.model.domain;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "tosas")
public class Tosa extends Servico {
	private boolean higienica;
	private String estilo;
	private boolean aparar;
	
	@Override
	public String toString() {
		return super.toString() + ";" + estilo + ";" + higienica + ";" + aparar;
	}

	public boolean isHigienica() {
		return higienica;
	}

	public void setHigienica(boolean higienica) {
		this.higienica = higienica;
	}

	public String getEstilo() {
		return estilo;
	}

	public void setEstilo(String estilo) {
		this.estilo = estilo;
	}

	public boolean isAparar() {
		return aparar;
	}

	public void setAparar(boolean aparar) {
		this.aparar = aparar;
	}
	
}
