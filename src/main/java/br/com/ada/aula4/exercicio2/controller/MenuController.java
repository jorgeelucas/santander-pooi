package br.com.ada.aula4.exercicio2.controller;

import br.com.ada.aula4.exercicio2.entity.Cliente;
import br.com.ada.aula4.exercicio2.entity.Pedido;
import br.com.ada.aula4.exercicio2.entity.Prato;
import br.com.ada.aula4.exercicio2.entity.Restaurante;
import br.com.ada.aula4.exercicio2.repository.ClienteRepository;
import br.com.ada.aula4.exercicio2.repository.PratoRepository;
import br.com.ada.aula4.exercicio2.service.ClienteService;
import br.com.ada.aula4.exercicio2.service.RestauranteService;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class MenuController {

	private RestauranteService restauranteService;
	private ClienteService clienteService;
	private ClienteRepository clienteRepository;
	private Scanner scanner;

	public MenuController(RestauranteService restauranteService, ClienteService clienteService, ClienteRepository clienteRepository) {
		this.restauranteService = restauranteService;
		this.clienteService = clienteService;
		this.clienteRepository = clienteRepository;
		this.scanner = new Scanner(System.in);
	}

	public void exibirMenu() {
		while (true) {
			System.out.println("Sistema de Pedidos de Restaurantes");
			System.out.println("1. Cadastrar Restaurante");
			System.out.println("2. Listar Restaurantes");
			System.out.println("3. Adicionar Prato");
			System.out.println("4. Listar Pratos de um Restaurante");
			System.out.println("5. Fazer um Pedido");
			System.out.println("6. Listar pedidos de um restaurante");
			System.out.println("7. Ver Pedidos de um Cliente");
			System.out.println("0. Sair");
			System.out.print("Escolha uma opção: ");
			int opcao;
			try {
	            opcao = scanner.nextInt();
	            scanner.nextLine();
	        } catch (InputMismatchException e) {
	            System.out.println("Opção inválida! Por favor, insira um número.");
	            scanner.nextLine();
	            continue;
	        }
			switch (opcao) {
			case 1:
				cadastrarRestaurante();
				break;
			case 2:
				listarRestaurantes();
				break;
			case 3:
				adicionarPrato();
				break;
			case 4:
				listarPratosRestaurante();
				break;
			case 5:
				fazerPedido();
				break;
			case 6:
				listarPedidosRestaurante();
				break;
			case 7:
				verPedidosCliente();
				break;
			case 0:
				return;
			default:
				System.out.println("Opção inválida!");
				System.out.println();
			}
		}
	}

	private void cadastrarRestaurante() {
		System.out.print("Nome do Restaurante: ");
		String nome = scanner.nextLine();
		System.out.print("Endereço do Restaurante: ");
		String endereco = scanner.nextLine();
		Restaurante restaurante = new Restaurante(nome, endereco);
		restauranteService.cadastrarRestaurante(restaurante);
		System.out.println("Restaurante cadastrado com sucesso!");
		System.out.println();
	}

	private void listarRestaurantes() {
		List<Restaurante> restaurantes = restauranteService.listarRestaurantes();
		if (restaurantes.isEmpty()) {
			System.out.println("Nenhum restaurante cadastrado!");
			System.out.println();
		} else {
			for (Restaurante restaurante : restaurantes) {
				System.out.println(restaurante);
				System.out.println();
			}
		}
	}

	private void adicionarPrato() {
		System.out.print("Identificador do Restaurante: ");
		Integer identificador = scanner.nextInt();
		scanner.nextLine();
		System.out.print("Nome do Restaurante: ");
		String nome = scanner.nextLine();
		System.out.print("Nome do Prato: ");
		String nomePrato = scanner.nextLine();
		System.out.print("Preço do Prato: ");
		Double preco = scanner.nextDouble();
		scanner.nextLine();
		System.out.print("Descrição do Prato: ");
		String descricao = scanner.nextLine();
		Prato prato = new Prato(nomePrato, preco, descricao);
		restauranteService.adicionarPrato(identificador, nome, prato);
		System.out.println("Prato adicionado com sucesso!");
		System.out.println();
	}

	private void listarPratosRestaurante() {
		System.out.print("Identificador do Restaurante: ");
		Integer identificador = scanner.nextInt();
		scanner.nextLine();
		System.out.print("Nome do Restaurante: ");
		String nome = scanner.nextLine();
		List<Prato> pratos = restauranteService.listarPratosRestaurante(identificador, nome);
		if (pratos == null || pratos.isEmpty()) {
			System.out.println("Nenhum prato encontrado para o restaurante informado!");
			System.out.println();
		} else {
			for (Prato prato : pratos) {
				System.out.println(prato);
				System.out.println();
			}
		}
	}

	private void fazerPedido() {
	    System.out.print("Já existe um cliente para este pedido? (S/N): ");
	    String opcao = scanner.nextLine();
	    Cliente cliente = null;
	    if (opcao.equalsIgnoreCase("S")) {
	        System.out.print("Identificador do Cliente: ");
	        Integer identificadorCliente = scanner.nextInt();
	        scanner.nextLine();
	        System.out.print("Nome do Cliente: ");
	        String nomeCliente = scanner.nextLine();
	        cliente = clienteRepository.buscarPrato(identificadorCliente, nomeCliente);
	        if (cliente == null) {
	            System.out.println("Cliente não encontrado!");
	            return;
	        }
	    } else {
	        System.out.print("Deseja cadastrar um novo cliente com este pedido? (S/N): ");
	        opcao = scanner.nextLine();
	        if (opcao.equalsIgnoreCase("S")) {
	            System.out.print("Nome do Cliente: ");
	            String nomeCliente = scanner.nextLine();
	            cliente = new Cliente(nomeCliente);
	            clienteRepository.adicionarCliente(cliente);
	            System.out.println("Cliente cadastrado com sucesso!");
	        } else {
	            return;
	        }
	    }
	    System.out.print("Identificador do Restaurante: ");
	    Integer identificadorRestaurante = scanner.nextInt();
	    scanner.nextLine();
	    System.out.print("Nome do Restaurante: ");
	    String nomeRestaurante = scanner.nextLine();
	    List<Prato> pratos = new ArrayList<>();
	    while (true) {
	        System.out.println("1. Adicionar Prato ao Pedido");
	        System.out.println("0. Finalizar Pedido");
	        System.out.print("Escolha uma opção: ");
	        int opcaoPrato = scanner.nextInt();
	        scanner.nextLine();
	        if (opcaoPrato == 1) {
	            System.out.print("Identificador do Prato: ");
	            Integer identificadorPrato = scanner.nextInt();
	            scanner.nextLine();
	            System.out.print("Nome do Prato: ");
	            String nomePrato = scanner.nextLine();

				List<Prato> pratosRestaurante = restauranteService.listarPratosRestaurante(identificadorRestaurante, nomeRestaurante);
				for (Prato prato : pratosRestaurante) {
					if (prato.getIdentificador().equals(identificadorPrato)) {
						pratos.add(prato);
					}
				}
	        } else if (opcaoPrato == 0) {
	            break;
	        } else {
	            System.out.println("Opção inválida!");
	        }
	    }
	    clienteService.fazerPedido(cliente.getIdentificador(), cliente.getNome(), identificadorRestaurante,
	                               nomeRestaurante, pratos);
	    System.out.println("Pedido realizado com sucesso!");
	}


	private void listarPedidosRestaurante() {
		System.out.print("Identificador do Restaurante: ");
		Integer identificador = scanner.nextInt();
		scanner.nextLine();
		System.out.print("Nome do Restaurante: ");
		String nome = scanner.nextLine();
		List<Pedido> pedidos = restauranteService.listarPedidosRestaurante(identificador, nome);
		if (pedidos == null || pedidos.isEmpty()) {
			System.out.println("Nenhum pedido encontrado para o restaurante informado!");
			System.out.println();
		} else {
			for (Pedido pedido : pedidos) {
				System.out.println(pedido);
				System.out.println();
			}
		}
	}

	private void verPedidosCliente() {
		System.out.print("Identificador do Cliente: ");
		Integer identificador = scanner.nextInt();
		scanner.nextLine();
		System.out.print("Nome do Cliente: ");
		String nome = scanner.nextLine();
		List<Pedido> pedidos = clienteService.verPedidosCliente(identificador, nome);
		if (pedidos == null || pedidos.isEmpty()) {
			System.out.println("Nenhum pedido encontrado para o cliente informado!");
			System.out.println();
		} else {
			for (Pedido pedido : pedidos) {
				System.out.println(pedido);
				System.out.println();
			}
		}
	}
}
