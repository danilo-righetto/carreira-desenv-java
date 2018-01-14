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
		
		/* Trabalhando com estrutura condicional */
		
		/*
		 * SE MAIOR DE IDADE
		 * 	ENTRA NA FESTA
		 * CASO CONTRARIO
		 * 	VOLTA PRA CASA
		 * */
		
		int idadeVisitante = 15;
		boolean amigoDoDono = true;
		
		/* Primeira Regra */
		if(idadeVisitante >= 18 || amigoDoDono) {
			System.out.println("Visitante - Entra na Festa");
		} else {
			System.out.println("Visitante - Volta pra Casa");
		}
		
		/* Segunda Regra */
		if(idadeVisitante >= 18 && amigoDoDono) {
			System.out.println("Visitante - Entra na Festa");
		} else {
			System.out.println("Visitante - Volta pra Casa");
		}
		
		/* Novo teste */
		if(idadeVisitante > 60) {
			System.out.println("Aproveite a melhor idade");
		}else if(idadeVisitante >= 18 && amigoDoDono) {
			System.out.println("Visitante - Entra na Festa");
		}else {
			System.out.println("Visitante - Volta pra Casa");
		}
		
		/* Trabalhando com FOR */
		for (int i = 1; i <= 100; i++) {
			System.out.println("Parabens pelo aniversario:" + i );
		}
		
		int j = 1;
		while(j <= 100) {
			System.out.println("Parabens pelo aniversario: "+ j);
			j++; // j = j + 1
		}
		
		int multiplicador = 3;
		for (int i = 0; i < 10; i++) {
			if(i%2 == 0 ) { //Multiplo de 2
				System.out.println(i * multiplicador);
			}
		}
		
		int num = 1;
		switch (num) {
		case 1:
			System.out.println("Um");
			break;
		case 2:
			System.out.println("Dois");
			break;
		case 3:
			System.out.println("Tres");
			break;
		default:// ELSE
			System.out.println("Nao foi encontrado");
			//break;
		}
	}
}
