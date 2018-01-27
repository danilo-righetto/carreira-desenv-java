package br.com.danilo.oo;

public class TestaExcessao {
	public static void main(String[] args) {
		System.out.println("Inicio do main");
		m1();
		System.out.println("Fim do main");
	}

	private static void m1() {
		System.out.println("Inicio do M1");
		m2();
		System.out.println("Fim do M1");
	}

	private static void m2() {
		System.out.println("Inicio do M2");
		int[] nums = new int[5];
		for (int i = 0; i < nums.length; i++) {
			try {
			nums[i] = i*2;
			System.out.println("Arrays: "+ nums[i]);
			}catch(ArrayIndexOutOfBoundsException e) {
				System.out.println("Problema:" + e.getMessage());
			}
		}
		System.out.println("Fim do M3");
	}
}
