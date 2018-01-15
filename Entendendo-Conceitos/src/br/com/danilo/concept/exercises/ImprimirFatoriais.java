package br.com.danilo.concept.exercises;

public class ImprimirFatoriais {
	public static void main(String[] args) {
		for (int i = 1; i <= 10; i++) {
			int j = i;
			int fatorial = j;
			while (j >= 1) {
				fatorial = fatorial * j;
				j--;
			}
			System.out.println("O fatorial de " + i + " é: " + fatorial);
		}
		
		
		/* Modo mais simples */
		int fatorial2 = 1;
        for (int i = 1; i < 11; i++) {
            fatorial2 *= i;
            System.out.println("Fatorial de "+i+ " = " +fatorial2);
        }
    
	}
}
