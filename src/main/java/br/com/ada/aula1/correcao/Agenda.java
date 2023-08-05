package br.com.ada.aula1.correcao;

public class Agenda {

    public Contato[] contatos;

    public Agenda() {
    }

    public Agenda(Contato[] contatos) {
        this.contatos = contatos;
    }

    public void deletar(Contato contato) {

        Contato[] novaLista = new Contato[contatos.length - 1];
        int posicaoNovaLista = 0;

        for (int i = 0; i < contatos.length; i++) {

            String nomeContatoADeletar = contato.nome;
            String numeroADeletar = contato.numero;

            String nomeContatoAtualDoFor = contatos[i].nome;
            String numeroAtualDoFor = contatos[i].numero;

            if (!contatos[i].equals(contato)) {

                novaLista[posicaoNovaLista] = contatos[i];
                posicaoNovaLista++;

            }

        }

        contatos = novaLista;
    }

    public Contato buscarPorNome(String nome) {
        for (int i = 0; i < contatos.length; i++) {
            if (contatos[i].nome.equals(nome)) {
                return contatos[i];
            }
        }
        return null;
    }

    public void addContato(Contato novoContato) {
        Contato[] novaLista = new Contato[contatos.length + 1];
        for (int i = 0; i < contatos.length; i++) {
            novaLista[i] = contatos[i];
        }
        novaLista[novaLista.length-1] = novoContato;
        contatos = novaLista;
    }

    public void imprimirAgenda() {
        System.out.println();
        for (Contato c : contatos) {
            System.out.println(c.nome);
        }
        System.out.println();
    }


}
