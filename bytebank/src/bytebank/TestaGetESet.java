package bytebank;

import cliente.Cliente;
import contas.Conta;

public class TestaGetESet {

	public static void main(String[] args) {
		Conta conta = new Conta(55, 1346); //criando objeto com construtor 
		//conta.setNumero(1346);
		System.out.println(conta.getNumero());
		
		Cliente priscila = new Cliente("Priscila", "444.444.444-44");
		conta.setTitular(priscila); //Composição
		//priscila.setNome("Priscila"); 
		conta.deposita(300);
		
		System.out.println(conta.getTitular().getNome());
		System.out.println(conta.getTitular().getCpf());
		
		System.out.println(priscila);
		System.out.println(conta.getTitular());
		
		
		System.out.println(Conta.getTotal());
		
		Conta conta2 = new Conta(55, 1347);
		System.out.println(Conta.getTotal());
		Conta conta3 = new Conta(55, 1348);
		System.out.println(Conta.getTotal());
		Conta conta4 = new Conta(55, 1349);		
		System.out.println(Conta.getTotal());
	}
}
