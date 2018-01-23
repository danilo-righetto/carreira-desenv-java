package br.com.danilo.oo;

/**
 * @author danilo righetto
 * @version 0.1
 * @category heran�a, reescrita e polimorfismo
 *
 */
public class TestaContas {
	public static void main(String[] args) {
		/* Heran�a, reescrita e polimorfismo - Exercicio 4 - inicio */
		Conta c = new Conta();
        ContaCorrente cc = new ContaCorrente();
        ContaPoupanca cp = new ContaPoupanca();

        c.deposita(1000); 
        cc.deposita(1000); 
        cp.deposita(1000);

        c.atualiza(0.01);
        cc.atualiza(0.01);
        cp.atualiza(0.01);

        System.out.println(c.getSaldo());
        System.out.println(cc.getSaldo());
        System.out.println(cp.getSaldo());
        /* Heran�a, reescrita e polimorfismo - Exercicio 4 - fim */
	}
}
