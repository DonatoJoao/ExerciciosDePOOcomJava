package contas;

import tributos.Tributavel;

public class ContaCorrente extends Conta implements Tributavel{

	public ContaCorrente(int agencia, int numero) {
		super(agencia, numero);
	}
	
	@Override
	public boolean saca(double valor) {
		double valorASacar = valor + 0.2; //tarifa do saque conta corrente
		return super.saca(valorASacar);
	}

	@Override
	public double getValorImposto() {
		return super.getSaldo() * 0.01;
	}
}
