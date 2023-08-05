package br.com.ada.aula1.correcao;

public class Teste {

    public static void main(String args[]) {

        Contato contato1 = new Contato();
        contato1.nome = "joao";
        contato1.numero = "123";
        contato1.descricao = "amigo";

        Contato contato2 = new Contato();
        contato2.nome = "maria";
        contato2.numero = "456";
        contato2.descricao = "tia";

        Contato contatoADeletar = new Contato();
        contatoADeletar.nome = "maria";
        contatoADeletar.numero = "456";
        contatoADeletar.descricao = "tia";

        Contato contato3 = new Contato();
        contato3.nome = "ronaldo";
        contato3.numero = "789";
        contato3.descricao = "pai";

        Contato contato4 = new Contato();
        contato4.nome = "ugo";
        contato4.numero = "321";
        contato4.descricao = "irmao";

        Contato[] lista = new Contato[] {contato1, contato2, contato3, contato4};

        Agenda agenda = new Agenda();
        agenda.contatos = lista;

        System.out.println("Imprimindo agenda");
        agenda.imprimirAgenda();

        System.out.println("Buscando ugo");
        Contato ugo = agenda.buscarPorNome("ugo");

        System.out.println("Detalhar");
        ugo.detalhar();

        System.out.println("ligar");
        ugo.ligar();

        System.out.println("Apagando contato: " + contatoADeletar);
        agenda.deletar(contatoADeletar);

        System.out.println("Contato Maria apagado");
        System.out.println();

        System.out.println("Imprimindo agenda");
        agenda.imprimirAgenda();

    }

}
