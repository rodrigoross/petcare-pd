package br.edu.infnet.apppetshop.model.domain;

import java.time.LocalDateTime;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Transient;

@Entity
@Table(name = "solicitacoes")
public class Solicitacao {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String descricao;
	private LocalDateTime data;
	private int ordem;
	private boolean busca;
	private boolean entrega;
	
	@ManyToOne
	@JoinColumn(name="idDono")
	private Dono dono;
	
	@Transient
	private List<Servico> servicos;
	
	public Solicitacao() {
		data = LocalDateTime.now();
		busca = false;
	}
	
	public Solicitacao(Dono dono) {
		this.dono = dono;
	}

	@Override
	public String toString() {
		return ordem + ";" + data + ";" + descricao + ";" + busca + ";" + entrega + ";" + dono + ";" + servicos.size();
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
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

	public Dono getDono() {
		return dono;
	}

	public void setDono(Dono dono) {
		this.dono = dono;
	}

	public List<Servico> getServicos() {
		return servicos;
	}

	public void setServicos(List<Servico> servicos) {
		this.servicos = servicos;
	}
	
}
