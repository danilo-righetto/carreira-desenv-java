package br.com.danilo.oo;

/**
 * @author danilo righetto
 * @version 0.1
 * @category herança, reescrita e polimorfismo
 *
 */
public class TestaContas {
	public static void main(String[] args) {
		/* Herança, reescrita e polimorfismo - Exercicio 4 - inicio */
		
		/* Herança, reescrita e polimorfismo - Exercicio 5
		Conta c = new Conta();
        ContaCorrente cc = new ContaCorrente();
        ContaPoupanca cp = new ContaPoupanca();
		*/
		
		//Conta c = new Conta();
		Conta cc = new ContaCorrente();
		Conta cp = new ContaPoupanca();
		
        //c.deposita(1000); 
        cc.deposita(1000); 
        cp.deposita(1000);

        //c.atualiza(0.01);
        cc.atualiza(0.01);
        cp.atualiza(0.01);

        //System.out.println(c.getSaldo());
        System.out.println(cc.getSaldo());
        System.out.println(cp.getSaldo());
        /* Herança, reescrita e polimorfismo - Exercicio 4 - fim */
	}
}
