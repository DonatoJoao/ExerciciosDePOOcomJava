package bytebank;

import funcionarios.EditorVideo;
import funcionarios.Funcionario;
import funcionarios.Gerente;

public class TesteReferencias {

	public static void main(String[] args) {
		
		Gerente g = new Gerente();
		//Funcionario f = new Funcionario(); Funcionário agora é uma classe abstrata
		EditorVideo ev = new EditorVideo();
		
		g.setSalario(5000);
		//f.setSalario(2000);
		ev.setSalario(2500);
		
		ControleBonificao controle = new ControleBonificao();
		//controle.registra(f);
		controle.registra(g);
		controle.registra(ev);
		
		System.out.println(controle.getSoma());
		

	}

}
