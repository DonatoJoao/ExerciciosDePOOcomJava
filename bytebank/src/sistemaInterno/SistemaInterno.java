package sistemaInterno;

public class SistemaInterno {
	
	private int senha = 2222;

	public void autentica(Autenticavel fa) {
		boolean autenticou = fa.autentica(this.senha);
		if(autenticou) {
			System.out.println(", seu acesso foi autorizado");
		} else {
			System.out.println(", seu acesso negado");
		}
	}
}
