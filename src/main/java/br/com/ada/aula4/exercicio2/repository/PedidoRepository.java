package br.com.ada.aula4.exercicio2.repository;

import br.com.ada.aula4.exercicio2.entity.Cliente;
import br.com.ada.aula4.exercicio2.entity.Pedido;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class PedidoRepository {

	private List<Pedido> pedidoBanco;

	public PedidoRepository() {
		this.pedidoBanco = new ArrayList<Pedido>();
	}
	
	public void adicionarPedido(Pedido pedido) {
		this.pedidoBanco.add(pedido);
	}

	public void removerPedido(Pedido pedido) {
	    Iterator<Pedido> iterator = pedidoBanco.iterator();
	    while (iterator.hasNext()) {
	        Pedido novo = iterator.next();
	        if (novo.getNumeroPedido().equals(pedido.getNumeroPedido())) {
	            iterator.remove();
	            break;
	        }
	    }
	}

	public Pedido buscarPedido(Integer numeroPedido) {
		for (Pedido pedido : pedidoBanco) {
			if (pedido.getNumeroPedido().equals(numeroPedido)) {
				return pedido;
			}
		}
		return null;
	}

	public List<Pedido> listarPedidos() {
		return new ArrayList<>(pedidoBanco);
	}
	
	public List<Pedido> buscarClientePeloPedido(Cliente cliente) {
		List<Pedido> pedidos = new ArrayList<>();
		for (Pedido pedido : pedidoBanco) {
			if (pedido.getCliente().equals(cliente)) {
				pedidos.add(pedido);
				return pedidos;
			}
		}
		return null;
	}
}
