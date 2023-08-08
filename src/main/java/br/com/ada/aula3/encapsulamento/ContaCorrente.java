package br.com.ada.aula3.encapsulamento;

public class ContaCorrente {

    private String nome;
    private double saldo;
    private String cpf;


    // getters and setters

    public void depositar(double valor) {
        this.saldo += (valor - 5.0);
    }

    public void sacar(double valor) {
        this.saldo -= valor;
    }

    public double getSaldo() {
        return saldo;
    }

    public String getCpf() {
        return cpf + ".***.***-**";
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
