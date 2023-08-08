package br.com.ada.aula3;

import br.com.ada.aula3.modificadores.PessoaEspecializada;
import br.com.ada.aula3.modificadores.PessoaFisica;

public class TesteModificadorPessoa {

    public static void main(String[] args) {

        PessoaFisica pf = new PessoaFisica();

        // nao tem acesso a pessoa juridica pois tem modificador padrão

//        PessoaEspecializada pe = new PessoaEspecializada("nova empresa ltda");
//        System.out.println(pe.razaoSocial);
    }

}
