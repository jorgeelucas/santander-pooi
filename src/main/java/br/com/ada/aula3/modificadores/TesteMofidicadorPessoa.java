package br.com.ada.aula3.modificadores;

public class TesteMofidicadorPessoa {

    public static void main(String[] args) {

        PessoaFisica pf = new PessoaFisica();
        pf.nome = "joao";
        System.out.println(pf.nome);

        PessoaJuridica pj = new PessoaJuridica();
        pj.razaoSocial = "inc ltda";
        System.out.println(pj.razaoSocial);

        PessoaEspecializada esp = new PessoaEspecializada("inc ltda espec.");
        esp.razaoSocial = "inc ltda espec.";

    }

}
