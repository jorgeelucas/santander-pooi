package br.com.ada.aula3.modificadores2.pacote_interno;

public class Automovel {


    private volatile String tipo;

    protected synchronized void setTipo(String tipo) {
        this.tipo = tipo;
    }

}
