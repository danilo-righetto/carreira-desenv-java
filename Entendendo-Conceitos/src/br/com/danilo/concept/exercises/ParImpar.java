package br.com.danilo.concept.exercises;


public class ParImpar {
	public static void main(String[] args) {
		int y = 13;//Integer.parseInt(x);
		while(y != 1) {
			if(y % 2 == 0) {
				System.out.print(y + " ");
				y = y / 2;
			}else {
				System.out.print(y + " ");
				y = (y * 3) + 1;
				System.out.print(y + " ");
			}
		}
		System.out.print(y + " ");
	}
}
