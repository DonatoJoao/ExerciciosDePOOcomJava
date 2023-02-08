package bytebank;

import funcionarios.Funcionario;

public class ControleBonificao {

	private double soma;
	
	public void registra (Funcionario funcionario) {
		double bonificacao = funcionario.getBonificacao();
		this.soma = this.soma + bonificacao;
	}
	
	public double getSoma() {
		return soma;
	}
}
