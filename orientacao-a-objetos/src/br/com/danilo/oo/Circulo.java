package br.com.danilo.oo;

public class Circulo implements AreaCalculavel {
	private double raio;

	public Circulo(double raio) {
		this.raio = raio;
	}

	@Override
	public double calculeArea() {
		return Math.PI * raio * raio;
	}

}
