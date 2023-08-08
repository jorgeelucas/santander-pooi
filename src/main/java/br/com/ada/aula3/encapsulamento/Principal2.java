package br.com.ada.aula3.encapsulamento;

public class Principal2 {

    public static void main(String[] args) {

        ContaCorrente cc = new ContaCorrente();
        cc.setNome("maria");
        cc.setCpf("987654");

        cc.depositar(20.0);

        System.out.println("Imprimindo detalhes da conta:");
        System.out.println("Titular: " + cc.getNome());
        System.out.println("Saldo: " + cc.getSaldo());
        System.out.println("CPF: " + cc.getCpf());

    }

}
