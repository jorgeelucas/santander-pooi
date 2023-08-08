package br.com.ada.aula2.correcao.willian;

import java.nio.file.Files;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

public class Banco {

	private List<Conta> contas;

	public Banco() {
		contas = new ArrayList<>();
	}

	public List<Conta> getContas() {
		return contas;
	}

	public void setContas(ArrayList<Conta> contas) {
		this.contas = contas;
	}
		
	public void criarConta(Cliente cliente, int numero) {
	    Conta conta = new Conta(cliente, numero, 0.0);
	    contas.add(conta);
	}

	public Conta buscarConta(int numero) {
	    for (Conta conta : contas) {
	        if (conta.getNumero() == numero) return conta;
	    }
	    return null;
	}

    public boolean depositar(int numero, double quantia) {
        Conta conta = buscarConta(numero);
        if (conta == null) return false;
        conta.depositar(quantia);
        return true;
    }

    public boolean sacar(int numero, double quantia) {
        Conta conta = buscarConta(numero);
        if (conta == null) return false;
        return conta.sacar(quantia);
    }

	@Override
	public int hashCode() {
		return Objects.hash(contas);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Banco other = (Banco) obj;
		return Objects.equals(contas, other.contas);
	}

	@Override
	public String toString() {
		return "Banco [contas=" + contas + "]";
	}	
}
