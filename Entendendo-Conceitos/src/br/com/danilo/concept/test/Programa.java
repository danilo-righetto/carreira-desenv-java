package br.com.danilo.concept.test;

public class Programa {
	public static void main(String[] args) {
		int idadeJoao = 18;
		/* Trabalhando com Variaveis */
		
		int idadeMaria = 21;
		int somaDasIdades = idadeJoao + idadeMaria;
		System.out.println("A soma das idades: "+ somaDasIdades);
		
		/* Toda variavel antes de ser usada deve ser inicializada */
		
		double pi = 3.1415;
		double dobroDoPi = pi * 2;
		
		System.out.println("Double: " + dobroDoPi);
		
		/* Boolean - Guarda Verdadeiro ou Falso */
		boolean amigo = true;
		boolean inimigo = false;
		
		boolean inimigo2 = !amigo;
		boolean maiorDeIdade = idadeJoao > 18; //O valor sera false
		boolean maiorDeIdade2 = idadeMaria >= 18; //O valor sera true
		
		char sexo = 'M';
		String nomeCompleto = "Joao da Silva";
		
		int numeroPequeno = 32000;
		long numeroGrande = 999999999999999999L;
		
		float outroPi3 = (float) 3.14;
		double pi2 = 3.1415;
		
		long copiaDeNumero = numeroPequeno;
	}
}
