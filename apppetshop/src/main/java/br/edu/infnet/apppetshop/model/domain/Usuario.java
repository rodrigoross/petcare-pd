package br.edu.infnet.apppetshop.model.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "usuarios")
public class Usuario {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String nome;
	private String email;
	private String senha;
	
	//@OneToMany
	//@JoinColumn(name="idUsuario") // id_usuario
	//private List<Dono> donos;
	
	@Override
	public String toString() {
		return nome + ";" + email;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	//public List<Dono> getDonos() {
	//	return donos;
	//}

	//public void setDonos(List<Dono> donos) {
	//	this.donos = donos;
	//}
}
