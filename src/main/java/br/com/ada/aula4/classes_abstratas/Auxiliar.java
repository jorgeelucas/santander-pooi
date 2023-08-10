package br.com.ada.aula4.classes_abstratas;

public class Auxiliar extends Funcionario {

    public Auxiliar(String nome, String matricula, double salario) {
        super(nome, matricula, salario);
    }

    @Override
    public double calcularBonus() {
        return this.salario * 0.1;
    }

    @Override
    public void imprimir() {
        super.imprimir();
        System.out.println("Cargo: auxiliar");
    }
}
