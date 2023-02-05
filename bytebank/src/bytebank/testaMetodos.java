package bytebank;

public class testaMetodos {

	public static void main(String[] args) {
		Conta conta = new Conta();
		conta.deposita(300);
		System.out.println("Saldo conta: " +  conta.saldo);
		
		conta.saca(250);
		System.out.println("Agora o saldo é: " +  conta.saldo);
		conta.saca(51);
		

	}

}
