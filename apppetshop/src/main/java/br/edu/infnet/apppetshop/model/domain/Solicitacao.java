package br.edu.infnet.apppetshop.model.domain;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "solicitacoes")
public class Solicitacao {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String descricao;
	private LocalDateTime data;
	private String ordem;
	private boolean busca;
	private boolean entrega;
	
	@OneToOne(cascade = CascadeType.DETACH)
	@JoinColumn(name="idDono")
	private Dono dono;
	
	@ManyToMany(cascade = CascadeType.DETACH)
	private List<Servico> servicos;
	
	public Solicitacao() {
		data = LocalDateTime.now();
		busca = false;
		
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyMMdHHmm");
		ordem = data.format(formatter);
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

	public String getOrdem() {
		return ordem;
	}

	public void setOrdem(String ordem) {
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
