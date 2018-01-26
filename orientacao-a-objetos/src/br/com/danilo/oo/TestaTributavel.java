package br.com.danilo.oo;

public class TestaTributavel {
	public static void main(String[] args) {
        ContaCorrente cc = new ContaCorrente();
        cc.deposita(100);
        System.out.println(cc.calcularTributos());

        // testando polimorfismo:
        Tributavel t = cc;
        System.out.println(t.calcularTributos());
        
        //System.out.println(t.getSaldo());
    }
}
