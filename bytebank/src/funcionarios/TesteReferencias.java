package funcionarios;

import bytebank.ControleBonificao;

public class TesteReferencias {

	public static void main(String[] args) {
		
		Gerente g = new Gerente();
		//Funcionario f = new Funcionario(); Funcionário agora é uma classe abstrata
		EditorVideo ev = new EditorVideo();
		Designer d = new Designer();
		
		g.setSalario(5000);
		//f.setSalario(2000);
		ev.setSalario(2500);
		d.setSalario(1000);
		
		ControleBonificao controle = new ControleBonificao();
		//controle.registra(f);
		controle.registra(g);
		controle.registra(ev);
		controle.registra(d);
		
		System.out.println(controle.getSoma());
		

	}

}
