package br.com.ada.aula4.exercicio2.service;

import br.com.ada.aula4.exercicio2.entity.Pedido;
import br.com.ada.aula4.exercicio2.entity.Prato;
import br.com.ada.aula4.exercicio2.entity.Restaurante;
import br.com.ada.aula4.exercicio2.repository.RestauranteRepository;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class RestauranteService {

	private RestauranteRepository restauranteRepository;
	private List<Pedido> pedidoBanco;

	public RestauranteService(RestauranteRepository restauranteRepository) {
		this.restauranteRepository = restauranteRepository;
		this.pedidoBanco = new ArrayList<>();
	}

	public void cadastrarRestaurante(Restaurante restaurante) {
		restauranteRepository.adicionarRestaurante(restaurante);
	}

	public List<Restaurante> listarRestaurantes() {
		return restauranteRepository.listarRestaurantes();
	}

	public void adicionarPrato(Integer identificador, String nome, Prato prato) {
		Restaurante restaurante = restauranteRepository.buscarRestaurante(identificador, nome);
		if (restaurante != null) {
			restaurante.getPratos().add(prato);
		}
	}

	public List<Prato> listarPratosRestaurante(Integer identificador, String nome) {
		return restauranteRepository.listarPratosRestaurante(identificador, nome);
	}

	public List<Pedido> listarPedidosRestaurante(Integer identificador, String nome) {
		Restaurante restaurante = restauranteRepository.buscarRestaurante(identificador, nome);
		if (restaurante != null) {
			return pedidoBanco.stream()
					.filter(pedido -> pedido.getRestaurante().equals(restaurante))
					.collect(Collectors.toList());
		}
		return null;
	}

	public void adicionarPedido(Pedido pedido) {
		pedidoBanco.add(pedido);
	}
}
