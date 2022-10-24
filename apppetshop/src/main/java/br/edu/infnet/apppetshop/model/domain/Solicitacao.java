package br.edu.infnet.apppetshop.model.domain;

import java.time.LocalDateTime;

public class Solicitacao {
	private String descricao;
	private LocalDateTime data;
	private int ordem;
	private boolean busca;
	private boolean entrega;

	@Override
	public String toString() {
		return ordem + ";" + data + ";" + descricao + ";" + busca + ";" + entrega;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public LocalDateTime getData() {
		return data;
	}

	public void setData(LocalDateTime data) {
		this.data = data;
	}

	public int getOrdem() {
		return ordem;
	}

	public void setOrdem(int ordem) {
		this.ordem = ordem;
	}

	public boolean isBusca() {
		return busca;
	}

	public void setBusca(boolean busca) {
		this.busca = busca;
	}

	public boolean isEntrega() {
		return entrega;
	}

	public void setEntrega(boolean entrega) {
		this.entrega = entrega;
	}
	
}
