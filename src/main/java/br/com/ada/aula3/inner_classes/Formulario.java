package br.com.ada.aula3.inner_classes;

public class Formulario {

    private DadosPessoais dadosPessoais;
    private Endereco endereco;
    private Documentos documentos;


    static class DadosPessoais {
        private String nome;
    }

    class Endereco {
        private String logradouro;
    }

    class Documentos {
        private String cpf;
    }

}
