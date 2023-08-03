package br.com.ada.aula1;

public class Principal2 {

    public static void main(String args[]) {

        Carro carro = new Carro();
        carro.marca = "Audi";
        carro.modelo = "Q3";
        carro.ano = 2019;

        carro.dono = new Pessoa();
        carro.dono.nome = "jorge";

        carro.imprimir();

        String marcaDoCarro = carro.getMarca();
        System.out.println(marcaDoCarro);
    }

}
