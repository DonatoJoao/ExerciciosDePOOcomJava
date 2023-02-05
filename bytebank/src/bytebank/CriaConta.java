package bytebank;

public class CriaConta {

	public static void main(String[] args) {
		
		Conta primeiraConta = new Conta();
		Conta segundaConta = new Conta();
		
		primeiraConta.saldo = 500;
		System.out.println("Saldo primeira conta: " + primeiraConta.saldo);
		segundaConta.saldo = 100;
		System.out.println("Saldo segunda conta: " + segundaConta.saldo);
		
		System.out.println(primeiraConta.titular);
		System.out.println(primeiraConta.agencia);
		System.out.println(primeiraConta.numero);
		
		if (primeiraConta == segundaConta) {
			System.out.println("São a mesma conta");
			} else {
				System.out.println("São contas diferentes");
			}
		
		System.out.println(primeiraConta);
		System.out.println(segundaConta);
		System.out.println("Oi");
		

	}

}
