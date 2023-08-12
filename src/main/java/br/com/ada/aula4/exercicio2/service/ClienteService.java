package br.com.ada.aula4.exercicio2.service;

import br.com.ada.aula4.exercicio2.entity.Cliente;
import br.com.ada.aula4.exercicio2.entity.Pedido;
import br.com.ada.aula4.exercicio2.entity.Prato;
import br.com.ada.aula4.exercicio2.entity.Restaurante;
import br.com.ada.aula4.exercicio2.repository.ClienteRepository;
import br.com.ada.aula4.exercicio2.repository.PedidoRepository;
import br.com.ada.aula4.exercicio2.repository.RestauranteRepository;

import java.util.List;

public class ClienteService {

	private ClienteRepository clienteRepository;
	private PedidoRepository pedidoRepository;
	private RestauranteRepository restauranteRepository;
	private RestauranteService restauranteService;
	@SuppressWarnings("unused")
	private List<Pedido> pedidoBanco;

	public ClienteService(ClienteRepository clienteRepository, PedidoRepository pedidoRepository,
			RestauranteRepository restauranteRepository, RestauranteService restauranteService) {
		this.clienteRepository = clienteRepository;
		this.pedidoRepository = pedidoRepository;
		this.restauranteRepository = restauranteRepository;
		this.restauranteService = restauranteService;
		this.pedidoBanco = pedidoRepository.listarPedidos();
	}

	public void fazerPedido(Integer identificadorCliente, String nomeCliente, Integer identificadorRestaurante,
			String nomeRestaurante, List<Prato> pratos) {
		Cliente cliente = clienteRepository.buscarPrato(identificadorCliente, nomeCliente);
		Restaurante restaurante = restauranteRepository.buscarRestaurante(identificadorRestaurante, nomeRestaurante);
		if (cliente != null && restaurante != null) {
			Pedido pedido = new Pedido(cliente, restaurante);
			pedido.setPratos(pratos);
			pedidoRepository.adicionarPedido(pedido);
			restauranteService.adicionarPedido(pedido);
		}
	}

	public List<Pedido> verPedidosCliente(Integer identificador, String nome) {
	    Cliente cliente = clienteRepository.buscarCliente(identificador, nome);
	    if (cliente != null) {
	    	List<Pedido> pedidosCliente = pedidoRepository.buscarClientePeloPedido(cliente);
	    	if(!pedidosCliente.isEmpty()) {
	    		return pedidosCliente;
	    	}	        
	    }
	    return null;
	}
}
