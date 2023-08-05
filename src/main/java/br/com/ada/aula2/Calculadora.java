package br.com.ada.aula2;


public class Calculadora {

    public final int n1;
    public final int n2;

    public Calculadora(int n1, int n2) {
        this.n1 = n1;
        this.n2 = n2;
    }

    public int getSoma() {
        return n1 + n2;
    }


}
