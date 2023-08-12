package br.com.ada.aula4.exercicio2.entity;

import java.util.Objects;

public class Cliente {

	private static Integer ultimoIdentificador = 0;
	private Integer identificador;
	private String nome;

	public Cliente() {}

	public Cliente(String nome) {
		this.identificador = ++ultimoIdentificador;
		this.nome = nome;
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


	@Override
	public int hashCode() {
		return Objects.hash(identificador, nome);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Cliente other = (Cliente) obj;
		return Objects.equals(identificador, other.identificador) && Objects.equals(nome, other.nome);
	}

	@Override
	public String toString() {
		return "identificador=" + identificador + ", nome=" + nome;
	}

	
}
