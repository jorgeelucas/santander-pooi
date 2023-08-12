package br.com.ada.aula4.exercicio2.entity;

import java.util.Objects;

public class Prato {

	private static Integer ultimoIdentificador = 0;
	private Integer identificador = 0;
	private String nome;
	private Double preco;
	private String descricao;
	
	public Prato() {}

	public Prato(String nome, Double preco, String descricao) {
		this.identificador = ++ultimoIdentificador;
		this.nome = nome;
		this.preco = preco;
		this.descricao = descricao;
	}

	public Integer getIdentificador() {
		return identificador;
	}

	public void setIdentificador(Integer identificador) {
		this.identificador = identificador;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Double getPreco() {
		return preco;
	}

	public void setPreco(Double preco) {
		this.preco = preco;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	@Override
	public int hashCode() {
		return Objects.hash(descricao, identificador, nome, preco);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Prato other = (Prato) obj;
		return Objects.equals(descricao, other.descricao) && Objects.equals(identificador, other.identificador)
				&& Objects.equals(nome, other.nome) && Objects.equals(preco, other.preco);
	}

	@Override
	public String toString() {
		return "Prato [identificador=" + identificador + ", nome=" + nome + ", preco=" + preco + ", descricao="
				+ descricao + "]";
	}
}
