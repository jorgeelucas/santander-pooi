package br.com.ada.aula4.exercicio2.repository;

import br.com.ada.aula4.exercicio2.entity.Cliente;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ClienteRepository {

	private List<Cliente> clienteBanco;

	public ClienteRepository() {
		this.clienteBanco = new ArrayList<Cliente>();
	}

	public void adicionarCliente(Cliente cliente) {
		this.clienteBanco.add(cliente);
	}

	public void removerCliente(Cliente cliente) {
		Iterator<Cliente> iterator = clienteBanco.iterator();
		while (iterator.hasNext()) {
			Cliente novo = iterator.next();
			if (novo.getIdentificador().equals(cliente.getIdentificador())
					&& novo.getNome().equals(cliente.getNome())) {
				iterator.remove();
				break;
			}
		}
	}

	public Cliente buscarCliente(Integer identificador, String nome) {
		for (Cliente cliente : clienteBanco) {
			if (cliente.getIdentificador().equals(identificador) && cliente.getNome().equals(nome)) {
				return cliente;
			}
		}
		return null;
	}

	public Cliente buscarPrato(Integer identificador, String nome) {
		for (Cliente cliente : clienteBanco) {
			if (cliente.getIdentificador().equals(identificador) || cliente.getNome().equals(nome)) {
				return cliente;
			}
		}
		return null;
	}

	public List<Cliente> listarPratos() {
		return new ArrayList<>(clienteBanco);
	}
}
