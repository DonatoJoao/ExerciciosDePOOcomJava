package contas;

import tributos.Tributavel;

public class AcoesBolsa implements Tributavel {

	@Override
	public double getValorImposto() {
		
		return 15;
	}

}
