package br.edu.infnet.apppetshop.model.domain;

public class Tosa extends Servico {
	public boolean higienica;
	public String estilo;
	public boolean aparar;
	
	@Override
	public String toString() {
		return estilo + ";" + higienica + ";" + aparar;
	}
}
