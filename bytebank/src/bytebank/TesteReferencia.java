package bytebank;

public class TesteReferencia {

	public static void main(String[] args) {
		
		Conta primeiraConta = new Conta();
		Conta segundaConta = primeiraConta;
		
		if (primeiraConta == segundaConta) {
			System.out.println("São a mesma conta");
			}
		
		System.out.println(primeiraConta);
		System.out.println(segundaConta);
	}

}
