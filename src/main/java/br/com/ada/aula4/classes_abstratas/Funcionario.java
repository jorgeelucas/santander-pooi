package br.com.ada.aula4.classes_abstratas;

public abstract class Funcionario {

    private String nome;
    private String matricula;
    protected double salario;

    public Funcionario(String nome, String matricula, double salario) {
        this.nome = nome;
        this.matricula = matricula;
        this.salario = salario;
    }

    public String getNome() {
        return nome;
    }

    public String getMatricula() {
        return matricula;
    }

    public double getSalario() {
        return salario;
    }

    public abstract double calcularBonus();

    public void imprimir() {
        System.out.println("Nome: " + nome);
        System.out.println("Matricula: " + matricula);
        System.out.println("Salario: " + salario);
    }
}
