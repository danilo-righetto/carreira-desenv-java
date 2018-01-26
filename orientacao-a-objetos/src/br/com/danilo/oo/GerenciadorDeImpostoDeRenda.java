package br.com.danilo.oo;

public class GerenciadorDeImpostoDeRenda {
	private double total;

    void adiciona(Tributavel t) {
        System.out.println("Adicionando tributavel: " + t);

        this.total +=  t.calcularTributos();
    }

    public double getTotal() {
        return this.total;
    }
}
