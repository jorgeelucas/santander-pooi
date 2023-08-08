package br.com.ada.aula2.correcao;

import java.util.Scanner;

public class TesteBanco {
    public static void main(String[] args) {
        Banco banco = new Banco();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Selecione a operação desejada:");
            System.out.println("1. Criar conta");
            System.out.println("2. Depositar");
            System.out.println("3. Sacar");
            System.out.println("4. Listar contas");
            System.out.println("5. Mostrar dados da conta");
            System.out.println("6. Sair");
            int opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("Digite o nome do cliente:");
                    String nome = scanner.next();
                    System.out.println("Digite o CPF do cliente:");
                    String cpf = scanner.next();
                    System.out.println("Digite o email do cliente:");
                    String email = scanner.next();
                    banco.criarConta(new Cliente(nome, cpf, email));
                    break;
                case 2:
                    System.out.println("Digite o número da conta:");
                    int numeroContaDeposito = scanner.nextInt();
                    System.out.println("Digite a quantia para depósito:");
                    double quantiaDeposito = scanner.nextDouble();
                    banco.depositar(numeroContaDeposito, quantiaDeposito);
                    break;
                case 3:
                    System.out.println("Digite o número da conta:");
                    int numeroContaSaque = scanner.nextInt();
                    System.out.println("Digite a quantia para saque:");
                    double quantiaSaque = scanner.nextDouble();
                    banco.sacar(numeroContaSaque, quantiaSaque);
                    break;
                case 4:
                    System.out.println("Listando todas as contas:");
                    banco.imprimirContas();
                    break;
                case 5:
                    System.out.println("Digite o número da conta:");
                    int numeroConta = scanner.nextInt();
                    Conta conta = banco.buscarConta(numeroConta);
                    if (conta != null) {
                        System.out.println(conta.toString());
                    } else {
                        System.out.println("Conta não encontrada.");
                    }
                    break;
                case 6:
                    System.out.println("Obrigado por usar nosso sistema bancário!");
                    scanner.close();
                    System.exit(0);
                default:
                    System.out.println("Opção inválida.");
            }
        }
    }

}
