package sistemaInterno;

import funcionarios.Administrador;
import funcionarios.Gerente;

public class TesteSistemaInterno {

	public static void main(String[] args) {
		
		Gerente g = new Gerente();
		Administrador adm = new Administrador();
		g.setNome("João");
		adm.setNome("Priscila");
		
		g.setSenha(2222);
		adm.setSenha(222);
		
		SistemaInterno si = new SistemaInterno();
		si.autentica(adm);
		si.autentica(g);

	}

}
