package br.com.danilo.concept.exercises;

public class BalancoTrimestral {
	/* 
	 * 
	 * Na empresa onde trabalhamos, h� tabelas com o quanto foi gasto em cada m�s. 
	 * Para fechar o balan�o do primeiro trimestre, precisamos somar o gasto total. 
	 * Sabendo que, em Janeiro, foram gastos 15000 reais, em Fevereiro, 
	 * 23000 reais e em Mar�o, 17000 reais, fa�a um programa que calcule 
	 * e imprima o gasto total no trimestre. 
	 * */
	
	public static void main(String[] args) {
		double gastosJaneiro = 15000.00;
		double gastosFevereiro = 23000.00;
		double gastosMarco = 17000.00;
		
		double gastosTrimestre = gastosJaneiro + gastosFevereiro + gastosMarco;
		
		System.out.println("Os gastos do Trimestre foram de: " + gastosTrimestre);
		
		String mediaMensal = "O valor da media mensal: R$ " + (int) gastosTrimestre / 3;
		System.out.println(mediaMensal);
		
		int contador = 150;
		while (contador < 300) {
			System.out.println("O numero do contador e: "+ contador);
			contador++;
		}
	}
}
