package br.com.ada.aula3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Principal2 {

    public static void main(String[] args) {

        List<String> nomes = List.of("joao", "maria", "caio", "angelica");

        Contador contador = new Contador();

        var qtdNomes = contador.contarNomes(nomes);

        System.out.println(qtdNomes);

        System.out.println(nomes);


    }
}

class Contador {
    public int contarNomes(List<String> nomes) {

        nomes.add("");
        return nomes.size();
    }
}
