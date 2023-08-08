package br.com.ada.aula2.correcao.willian;

import java.util.Scanner;

public class MainBanco {

	public static void main(String[] args) {
		Banco banco = new Banco();
		Scanner scanner = new Scanner(System.in);

		while (true) {
			System.out.println("");
			System.out.println("Menu:");
			System.out.println("1. Criar conta");
			System.out.println("2. Depositar");
			System.out.println("3. Sacar");
			System.out.println("4. Exibir dados da conta");
			System.out.println("5. Sair");
			System.out.print("Escolha uma opção: ");
			int opcao = scanner.nextInt();

			if (opcao == 1) {
				System.out.print("Digite o nome do cliente: ");
				String nome = scanner.next();
				System.out.print("Digite o CPF do cliente: ");
				String cpf = scanner.next();
				System.out.print("Digite o email do cliente: ");
				String email = scanner.next();
				System.out.print("Digite o número da conta: ");
				int numero = scanner.nextInt();
				Cliente cliente = new Cliente(nome, cpf, email);
				banco.criarConta(cliente, numero);
				System.out.println("Conta criada com sucesso!");
				System.out.println("");
			} else if (opcao == 2) {
				System.out.print("Digite o número da conta: ");
				int numero = scanner.nextInt();
				System.out.print("Digite a quantia a ser depositada: ");
				double quantia = scanner.nextDouble();
				if (banco.depositar(numero, quantia)) {
					System.out.println("Depósito realizado com sucesso!");
				} else {
					System.out.println("Erro ao realizar depósito!");
				}
				System.out.println("");
			} else if (opcao == 3) {
				System.out.print("Digite o número da conta: ");
				int numero = scanner.nextInt();
				System.out.print("Digite a quantia a ser sacada: ");
				double quantia = scanner.nextDouble();
				if (banco.sacar(numero, quantia)) {
					System.out.println("Saque realizado com sucesso!");
				} else {
					System.out.println("Erro ao realizar saque!");
				}
				System.out.println("");
			} else if (opcao == 4) {
				System.out.print("Digite o número da conta: ");
				int numero = scanner.nextInt();
				Conta conta = banco.buscarConta(numero);
				if (conta == null) {
					System.out.println("Conta não encontrada!");
				} else {
					System.out.println(conta);
				}
				System.out.println("");
			} else if (opcao == 5) {
				break;
			} else {
				System.out.println("Opção inválida!");
				System.out.println("");
			}
		}
		scanner.close();
	}
}
