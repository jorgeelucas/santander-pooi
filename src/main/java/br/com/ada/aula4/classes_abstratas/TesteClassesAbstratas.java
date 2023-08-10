package br.com.ada.aula4.classes_abstratas;

public class TesteClassesAbstratas {

    public static void main(String args[]) {

        Funcionario joao = new Gerente("joao", "123-3", 1500, 1300);
        Funcionario jorge = new Auxiliar("jorge", "321-1", 1000);
        Funcionario maria = new Presidente("maria", 120000);

        // abstract classes

        System.out.println("Bonus do gerente: " + joao.calcularBonus());
        System.out.println("Bonus do auxiliar: " + jorge.calcularBonus());
        System.out.println("Bonus da presidente: " + maria.calcularBonus());
    }

}
