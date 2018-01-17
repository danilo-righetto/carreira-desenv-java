package br.com.danilo.concept.oo;

public class Programa {
	public static void main(String[] args) {
		Conta danilo = new Conta();
		danilo.numero = 8291;
		danilo.agencia = 9872;
		danilo.titular = "Danilo Righetto";
		danilo.saldo = 1200.10;
		
		/* Variavel.atributo */
		
		System.out.println("Titular: " + danilo.titular);
		System.out.println("Saldo do Titular: " + danilo.saldo);
		
		/* Trabalhando com comportamentos */
		
		danilo.deposita(1200.20);
		System.out.println("Saldo: "+danilo.saldo);
	}
}
