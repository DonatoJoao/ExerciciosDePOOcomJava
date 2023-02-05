package bytebank;

public class Conta {

	int agencia;
	int numero;
	double saldo;
	String titular;
	
	
	public void deposita (double valor) {
		this.saldo += valor;
	}
	
	public boolean saca (double valor) {
		if (this.saldo < valor) {
			System.out.println("Saldo insuficiente");
			return false;
		} else {
			this.saldo -= valor;
			return true;
		}
	}
}
