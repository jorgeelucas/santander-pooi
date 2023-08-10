package br.com.ada.aula4.exemplo.servico;

import br.com.ada.aula4.exemplo.dominio.Conta;
import br.com.ada.aula4.exemplo.repositorio.ContaRepositorio;

import java.util.List;

public class ContaService {

    private ContaRepositorio contaRepositorio;

    public ContaService(ContaRepositorio contaRepositorio) {
        this.contaRepositorio = contaRepositorio;
    }

    public void criarConta(String titular) {

        var novaConta = new Conta(titular, 5.0);

        this.contaRepositorio.add(novaConta);
    }

    public List<Conta> buscarTodas() {
        return this.contaRepositorio.findAll();
    }
}
