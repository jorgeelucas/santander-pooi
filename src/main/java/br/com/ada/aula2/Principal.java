package br.com.ada.aula2;

import br.com.ada.aula1.correcao.Agenda;

public class Principal {

    public static void main(String args[]) {


        Calculadora c = new Calculadora(1, 3);


        int resultado = c.getSoma();

        System.out.println("Resultado: " + resultado);

    }

}
