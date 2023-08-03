package br.com.ada.aula1;

public class Carro {

    Pessoa dono;
    String marca;
    String modelo;
    int ano;

    public static void teste() {
        System.out.println("testando");
    }

    public void imprimirAno() {
        System.out.println(ano);
    }

    public String getMarca() {
        return marca;
    }

    public Pessoa imprimir() {
        System.out.println("Dono: " + dono.nome);
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Ano: " + ano);
        return dono;
    }
}
