package br.edu.infnet.apppetshop.model.domain;

import java.time.LocalDateTime;

public class Solicitacao {
	public String descricao;
	public LocalDateTime data;
	public int ordem;
	public boolean busca;
	public boolean entrega;

	@Override
	public String toString() {
		return ordem + ";" + data + ";" + descricao + ";" + busca + ";" + entrega;
	}
}
