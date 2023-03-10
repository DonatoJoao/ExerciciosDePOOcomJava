package funcionarios;

import sistemaInterno.AutenticacaoUtil;
import sistemaInterno.Autenticavel;

public class Administrador extends Funcionario implements Autenticavel{
	
	private AutenticacaoUtil autenticador;
	
	public Administrador() {
		this.autenticador = new AutenticacaoUtil(); //rela??o de composi??o
	}

	@Override
	public double getBonificacao() {
		return 1000;
	}

	@Override
	public void setSenha(int senha) {
		this.autenticador.setSenha(senha);
		}

	@Override
	public boolean autentica(int senha) {
		return this.autenticador.autentica(senha);
	}

}
