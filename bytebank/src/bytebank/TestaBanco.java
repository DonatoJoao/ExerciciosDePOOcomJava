package bytebank;

public class TestaBanco {

	public static void main(String[] args) {

		Cliente joao = new Cliente();
		joao.nome = "João";
		joao.cpf = "123.456.789-00";
		joao.profissao = "Desenvolvedor de software";
		
		Conta contaDoJoao = new Conta();
		contaDoJoao.titular = joao;
		
		System.out.println(contaDoJoao.titular.nome);
		contaDoJoao.deposita(100);
		System.out.println(contaDoJoao.saldo);
		
		System.out.println(contaDoJoao.titular);
		System.out.println(joao);
		

	}

}
