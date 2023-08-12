package br.com.ada.aula4.exercicio2.entity;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Restaurante {

	private static Integer ultimoIdentificador = 0;
	private Integer identificador = 0;
	private String nome;
	private String endereco;
	private List<Prato> pratos;
	
	public Restaurante() {}

	public Restaurante(String nome, String endereco) {
		this.identificador = ++ultimoIdentificador;
		this.nome = nome;
		this.endereco = endereco;
		this.pratos = new ArrayList<>();
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

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public List<Prato> getPratos() {
		return pratos;
	}

	public void setPratos(List<Prato> pratos) {
		this.pratos = pratos;
	}

	@Override
	public int hashCode() {
		return Objects.hash(endereco, identificador, nome);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Restaurante other = (Restaurante) obj;
		return Objects.equals(endereco, other.endereco) && Objects.equals(identificador, other.identificador)
				&& Objects.equals(nome, other.nome);
	}

	@Override
	public String toString() {
		return "Restaurante [identificador=" + identificador + ", nome=" + nome + ", endereco=" + endereco + ", pratos="
				+ pratos + "]";
	}	
}
