package br.com.ada.aula4.heranca;

public class Moto extends Veiculo {

    private int cilindradas;

    public Moto(String placa, String cor, String modelo, int ano, int cilindradas) {
        super(placa, cor, modelo, ano);
        this.cilindradas = cilindradas;
    }

    @Override
    public void exibirDados() {
        super.exibirDados();
        System.out.println("Cilindradas: " + cilindradas);
    }
}
