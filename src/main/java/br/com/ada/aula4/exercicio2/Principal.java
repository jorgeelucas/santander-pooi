package br.com.ada.aula4.exercicio2;


import br.com.ada.aula4.exercicio2.controller.MenuController;
import br.com.ada.aula4.exercicio2.repository.ClienteRepository;
import br.com.ada.aula4.exercicio2.repository.PedidoRepository;
import br.com.ada.aula4.exercicio2.repository.PratoRepository;
import br.com.ada.aula4.exercicio2.repository.RestauranteRepository;
import br.com.ada.aula4.exercicio2.service.ClienteService;
import br.com.ada.aula4.exercicio2.service.RestauranteService;

import java.util.List;

public class Principal {

	public static void main(String[] args) {

		RestauranteRepository restauranteRepository = new RestauranteRepository();
		ClienteRepository clienteRepository = new ClienteRepository();
		PedidoRepository pedidoRepository = new PedidoRepository();
		RestauranteService restauranteService = new RestauranteService(restauranteRepository);
		ClienteService clienteService = new ClienteService(clienteRepository, pedidoRepository, restauranteRepository, restauranteService);
		MenuController menu = new MenuController(restauranteService, clienteService, clienteRepository);
		menu.exibirMenu();

	}

}
