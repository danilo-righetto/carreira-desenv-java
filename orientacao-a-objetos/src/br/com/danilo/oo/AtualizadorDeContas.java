package br.com.danilo.oo;

/**
 * @author danilo righetto
 * @version 0.1
 * @category heran�a, reescrita e polimorfismo
 *
 */
public class AtualizadorDeContas {
	/* Heran�a, reescrita e polimorfismo - Exercicio 6 - inicio */
	private double saldoTotal = 0;
    private double selic;

    public AtualizadorDeContas(double selic) {
        this.selic = selic;
    }
    
    public double getSaldoTotal() {
    	return this.saldoTotal;
    }

    public void roda(Conta c) {
        // aqui voc� imprime o saldo anterior
    	System.out.println("Saldo anterior: "+ c.getSaldo());
    	double saldoAtual = c.getSaldo() * selic;
    	c.atualiza(this.selic);
    	// atualiza a conta com a taxa selic,
    	// e depois imprime o saldo final
    	System.out.println("Saldo atual: "+ c.getSaldo());
    	this.saldoTotal += saldoAtual;
    }

    // outros m�todos, colocar o getter para saldoTotal!
    
    /* Heran�a, reescrita e polimorfismo - Exercicio 6 - fim */
}
