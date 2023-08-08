package br.com.ada.aula3;

public class Principal {

    public static void main(String args[]) {


        // tipos primitivos
        double dez = 10.0;

        ContaCorrente cc = new ContaCorrente("joao", 0);

        cc = cc.deposit(dez);

        System.out.println(cc);


        ContaCorrente ccMaria = new ContaCorrente("maria", 0);

        cc.transfer(ccMaria, 5);

        System.out.println(ccMaria);

    }
}

class ContaCorrente {
    final String name;
    final double amount;

    public ContaCorrente(String name, double amount) {
        this.name = name;
        this.amount = amount;
    }

    public ContaCorrente deposit(double value) {
        return new ContaCorrente(this.name, this.amount + value);
    }

    public ContaCorrente withdrawal(double value) {
        return new ContaCorrente(this.name, this.amount - value);
    }

    public void transfer(ContaCorrente dest, double value) {
        dest.deposit(value);
    }

    @Override
    public String toString() {
        return "ContaCorrente{" +
                "name=" + name +
                ", saldo=" + amount +
                '}';
    }
}