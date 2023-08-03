package br.com.ada.aula1.correcao;

public class Contato {
    String nome;
    String numero;
    String descricao;

    public void ligar() {
        System.out.println("ligando para: " + nome);
    }

    public void detalhar() {
        System.out.println("Nome: " + nome);
        System.out.println("Numero: " + numero);
        System.out.println("Descricao: " + descricao);
    }

    public String getNumero() {
        return numero;
    }
}
