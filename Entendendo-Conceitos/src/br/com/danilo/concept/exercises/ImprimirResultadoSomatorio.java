package br.com.danilo.concept.exercises;

public class ImprimirResultadoSomatorio {
	public static void main(String[] args) {
		long somatorio = 1;
		for (int i = 0; i < 1000; i++) {
			somatorio = somatorio + i;
			if(i == 999) {
				System.out.println("O somatorio e: "+ somatorio);
			}
		}
		//System.out.println("O somatorio eh: "+ somatorio);
	}
}
