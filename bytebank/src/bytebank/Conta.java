package bytebank;

public class Conta {

	private int agencia;
	private int numero;
	private double saldo;
	private Cliente titular;
	private static int total;
	
	public Conta(int agencia, int numero) {
		Conta.total++;
		this.agencia = agencia;
		this.numero = numero;
	}
	
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
	
	public double getSaldo() {
		return this.saldo;
	}
	
//	public void setNumero(int numero) {
//		this.numero = numero;
//	}
	public int getNumero() {
		return this.numero;
	}
	
//	public void setAgencia(int agencia) {
//		this.agencia = agencia;
//	}
	public int getAgencia() {
		return agencia;
	}
	
	public Cliente getTitular() {
		return titular;
	}
	public void setTitular(Cliente titular) {
		this.titular = titular;
	}
	public static int getTotal() {
		return total;
	}
}
