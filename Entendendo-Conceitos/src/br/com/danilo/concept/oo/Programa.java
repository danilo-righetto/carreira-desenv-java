package br.com.danilo.concept.oo;

public class Programa {
	public static void main(String[] args) {
		Conta danilo = new Conta();
		danilo.setNumero(8291);
		danilo.setAgencia(9872);
		danilo.setTitular("Danilo Righetto");
		//danilo.saldo = 1200.10;
		
		
		/* Variavel.atributo */
		
		System.out.println("Titular: " + danilo.getTitular());
		System.out.println("Saldo do Titular: " + danilo.getSaldo());
		
		/* Trabalhando com comportamentos */
		
		danilo.deposita(1200.20);
		System.out.println("Saldo: "+danilo.getSaldo());
		
		System.out.println(Conta.x());
	}
}
