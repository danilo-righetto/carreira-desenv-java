package br.com.danilo.oo;

public class Quadrado implements AreaCalculavel {
	private int lado;
	
	public Quadrado(int lado) {
		this.lado = lado;
	}
	
	@Override
	public double calculeArea() {
		return this.lado * this.lado;
	}

}
