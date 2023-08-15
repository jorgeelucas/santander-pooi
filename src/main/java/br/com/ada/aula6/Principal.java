package br.com.ada.aula6;

import br.com.ada.aula6.contrato.Lista;
import br.com.ada.aula6.impl.ArrayLista;
import br.com.ada.aula6.impl.ListaLigada;
import br.com.ada.aula6.impl.StringArrayLista;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Principal {

    public static void main(String[] args) {

        Lista lista = new ArrayLista();

        lista.add("primeiro elemento");
        lista.add("segundo elemento");
        lista.add(1);
        lista.add(2);

//        imprimirLista(lista);

        Lista lista2 = new StringArrayLista();
        lista2.add("meu nome");
        lista2.add("outro nome");

//        imprimirLista(lista2);


        Lista lista3 = new ListaLigada();
        lista3.add("primeiro elemento");
        lista3.add("segundo elemento");
        lista3.add(1);
        lista3.add(2);

        imprimirLista(lista3);
    }

    public static void imprimirLista(Lista lista) {
        for (int i = 0 ; i < lista.size() ; i++) {
            System.out.println(lista.get(i));
        }
    }

}
