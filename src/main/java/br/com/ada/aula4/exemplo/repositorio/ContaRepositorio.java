package br.com.ada.aula4.exemplo.repositorio;

import br.com.ada.aula4.exemplo.dominio.Conta;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ContaRepositorio {

    private List<Conta> lista;

    public ContaRepositorio() {
        lista = new ArrayList<>();
    }

    public void add(Conta banco) {
        this.lista.add(banco);
    }

    public Conta get(String titular) {
        for (Conta conta : lista) {
            if (conta.getTitular().equals(titular)) return conta;
        }
        return null;
    }

    public List<Conta> findAll() {
        return Collections.unmodifiableList(lista);
    }

}
