package br.com.ada.aula4.classes_abstratas;

public class Gerente extends Funcionario {

    private double decimoQuartoSalario;

    public Gerente(String nome, String matricula, double salario, double decimoQuartoSalario) {
        super(nome, matricula, salario);
        this.decimoQuartoSalario = decimoQuartoSalario;
    }

    public double getDecimoQuartoSalario() {
        return decimoQuartoSalario;
    }

    @Override
    public double calcularBonus() {
        return this.salario * 0.6;
    }

    @Override
    public void imprimir() {
        super.imprimir();
        System.out.println("Cargo: gerente");
    }
}
