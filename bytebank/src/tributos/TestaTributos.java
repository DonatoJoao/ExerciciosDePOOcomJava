package tributos;

import contas.ContaCorrente;

public class TestaTributos {

	public static void main(String[] args) {
		ContaCorrente cc = new ContaCorrente(55, 5555);
		cc.deposita(100);
		CalculadorDeImpostos calc = new CalculadorDeImpostos();
		
		calc.registraImposto(cc);
		
		System.out.println(calc.getTotalImposto());
		

	}

}
