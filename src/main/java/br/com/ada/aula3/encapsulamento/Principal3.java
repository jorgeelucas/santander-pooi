package br.com.ada.aula3.encapsulamento;

public class Principal3 {

    public static void main(String[] args) {

        ContaCorrente cc = new ContaCorrente();
        cc.setNome("ugo");
        cc.setCpf("123456789");

        cc.depositar(20.0);
        cc.depositar(5.0);

        System.out.println("Imprimindo detalhes da conta:");
        System.out.println("Titular: " + cc.getNome());
        System.out.println("Saldo: " + cc.getSaldo());
        System.out.println("CPF: " + cc.getCpf());

    }

}
