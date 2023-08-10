package br.com.ada.aula4.heranca;

public class Caminhao extends Veiculo {

    private int qtdRodas;

    public Caminhao(String placa, String cor, String modelo, int ano, int qtdRodas) {
        super(placa, cor, modelo, ano);
        this.qtdRodas = qtdRodas;
    }

    @Override
    public void exibirDados() {
        super.exibirDados();
        System.out.println("Quantidade de rodas: " + qtdRodas);
    }
}
