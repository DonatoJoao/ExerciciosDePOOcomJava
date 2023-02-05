package bytebank;

public class TestaGetESet {

	public static void main(String[] args) {
		Conta conta = new Conta();
		conta.setNumero(1346);
		System.out.println(conta.getNumero());
		
		Cliente priscila = new Cliente();
		conta.setTitular(priscila);
		priscila.setNome("Priscila");
		conta.deposita(300);
		
		System.out.println(conta.getTitular().getNome());
		System.out.println(conta.getTitular().getCpf());
		
		System.out.println(priscila);
		System.out.println(conta.getTitular());
		
	}
}
