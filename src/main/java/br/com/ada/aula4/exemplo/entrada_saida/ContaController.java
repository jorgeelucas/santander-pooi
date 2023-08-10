package br.com.ada.aula4.exemplo.entrada_saida;

import br.com.ada.aula4.exemplo.dominio.Conta;
import br.com.ada.aula4.exemplo.repositorio.ContaRepositorio;
import br.com.ada.aula4.exemplo.servico.ContaService;

import java.util.List;
import java.util.Scanner;

public class ContaController {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        ContaService contaService = new ContaService(new ContaRepositorio());

        while (true) {
            System.out.println("");
            System.out.println("Menu:");
            System.out.println("1. Criar conta");
            System.out.println("2. Buscar todas as contas");
            System.out.println("0. Sair");

            System.out.print("Escolha uma opção: ");
            int opcao = scanner.nextInt();

            if (opcao == 1) {
                System.out.print("Digite o nome do titular: ");
                String nome = scanner.next();

                // efetuar o cadastro
                contaService.criarConta(nome);

                System.out.println("Conta criada com sucesso!");
                System.out.println("");
            } else if (opcao == 2) {
                System.out.println("Imprimindo todas as contas");

                // efetuando a busca
                List<Conta> contas = contaService.buscarTodas();

                System.out.println("Contas cadastradas: ");
                for (Conta conta : contas) {
                    System.out.println(conta);
                }

            } else if (opcao == 0) {
                break;
            } else {
                System.out.println("Opção inválida!");
                System.out.println("");
            }
        }
        scanner.close();


    }
}
