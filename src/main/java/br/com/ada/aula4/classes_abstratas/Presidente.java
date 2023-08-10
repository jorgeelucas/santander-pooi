package br.com.ada.aula4.classes_abstratas;

public class Presidente extends FuncionarioCLevel {

    public Presidente(String nome, double salario) {
        super(nome, salario);
    }

    @Override
    public double calcularBonus() {
        return this.salario * 3;
    }
}
