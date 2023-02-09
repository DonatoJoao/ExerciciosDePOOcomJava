package contas;

import java.beans.Encoder;

import cliente.Cliente;
import cliente.Endereco;

public class TesteContas {

	public static void main(String[] args) {
		
		ContaCorrente cc = new ContaCorrente(55, 5555);
		ContaPoupanca cp = new ContaPoupanca(55, 123456);
		
		cc.deposita(100);
		cp.deposita(300);
		
		
		
		Cliente joao = new Cliente("Jo�o", "123456789-88");
		cc.setTitular(joao); //composi��o cliente conta corrente
		Cliente priscila = new Cliente("Priscila", "789456123-22");
		cp.setTitular(priscila); //composi��o cliente conta poupan�a
		
		System.out.println(cc.getTitular().getNome());
		System.out.println(cp.getTitular().getNome());
		
		System.out.println("Saldo CC: " + cc.getSaldo());
		System.out.println("Saldo CP: " + cp.getSaldo());
		
		cp.transfere(5, cc);
		
		System.out.println("Saldo CC: " + cc.getSaldo());
		System.out.println("Saldo CP: " + cp.getSaldo());
		
		cc.saca(5);
		System.out.println("Saldo CC depois do saque: " + cc.getSaldo());
		
		Endereco enderecoJoao = new Endereco();
		joao.setEndereco(enderecoJoao);
		enderecoJoao.setCidade("Itanha�m");
		
		System.out.println(cc.getTitular().getEndereco().getCidade());
		
		Endereco enderecoPriscila = new Endereco();
		priscila.setEndereco(enderecoPriscila);
		enderecoPriscila.setEstado("S�o Paulo");
		System.out.println(cp.getTitular().getEndereco().getEstado());
		
	}
	

}
