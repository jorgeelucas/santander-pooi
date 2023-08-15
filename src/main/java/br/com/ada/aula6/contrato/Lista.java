package br.com.ada.aula6.contrato;

public abstract class Lista {

    public abstract void add(Object obj);
    public abstract Object get(int idx);

    public abstract int size();

    public abstract void remove(int idx);
}
