package br.com.ada.aula1;

public class Main {

    int hora = 20;

    public static void main(String[] args) {

        Main a = new Main();

        int novaHora = a.hora++;

        Carro.teste();

        Carro x = new Carro(); //123

        x.ano = 2023;

        x.imprimirAno();

    }

}