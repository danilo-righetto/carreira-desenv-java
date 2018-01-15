package br.com.danilo.concept.exercises;

public class ImprimirFatoriaisMaiores {
	public static void main(String[] args) {
		for (int i = 1; i <= 40; i++) {
			long j = i;
			long fatorial = j;
			while (j >= 1) {
				fatorial = fatorial * j;
				j--;
			}
			System.out.println("O fatorial de " + i + " é: " + fatorial);
		}
	}
}
