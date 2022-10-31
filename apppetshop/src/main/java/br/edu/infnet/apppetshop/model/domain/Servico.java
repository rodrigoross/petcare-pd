package br.edu.infnet.apppetshop.model.domain;

public abstract class Servico {
	private Integer id;
	private String nome;
	private float valor;
	private String animal;
	private int codigo;

	@Override
	public String toString() {
		return id + ";" + codigo + ";" + animal + ";" + nome + ";" + valor;
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

	public float getValor() {
		return valor;
	}

	public void setValor(float valor) {
		this.valor = valor;
	}

	public String getAnimal() {
		return animal;
	}

	public void setAnimal(String animal) {
		this.animal = animal;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
}
