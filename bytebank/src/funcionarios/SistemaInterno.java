package funcionarios;

public class SistemaInterno {
	
	private int senha = 2222;

	public void autentica(FuncionarioAutenticavel fa) {
		boolean autenticou = fa.autentica(this.senha);
		if(autenticou) {
			System.out.println(fa.getNome() + ", seu acesso foi autorizado");
		} else {
			System.out.println(fa.getNome() + ", seu acesso negado");
		}
	}
}
