package br.com.ada.aula4.heranca;

import java.util.Scanner;

public class TesteHeranca {

    public static void main(String args[]) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("informe o tipo do veiculo:");
        System.out.printf("1-Carro, 2-Moto, 3-Caminhao: ");
        String opcao = scanner.next();

        System.out.println("informe a placa:");
        String placa = scanner.next();

        System.out.println("informe a cor:");
        String cor = scanner.next();

        System.out.println("informe o modelo:");
        String modelo = scanner.next();

        System.out.println("informe o ano do veiculo:");
        int ano = scanner.nextInt();

        Veiculo veiculo = null;

        if ("1".equals(opcao)) {
            System.out.println("informe a qtdPortas:");
            int qtdPortas = scanner.nextInt();

            System.out.println("informe o tipo do combustivel:");
            String tipoCombustivel = scanner.next();

            veiculo = new Carro(placa, cor, modelo, ano, qtdPortas, tipoCombustivel);
        }

        aplicarMulta(veiculo);

    }

    public static void aplicarMulta(Veiculo veiculo) {
        System.out.println("Aplicando multa: ");
        veiculo.exibirDados();
    }

    public static void imprimirDados(Veiculo veiculo) {
        veiculo.exibirDados();
    }

}
