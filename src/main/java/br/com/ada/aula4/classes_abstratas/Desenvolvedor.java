package br.com.ada.aula4.classes_abstratas;

public class Desenvolvedor extends Funcionario {

    public Desenvolvedor(String nome, String matricula, double salario) {
        super(nome, matricula, salario);
    }

    @Override
    public double calcularBonus() {
        return salario * 0.1;
    }
}
