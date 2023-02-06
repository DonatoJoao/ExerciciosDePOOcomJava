package bytebank;

public class TestaGerente {

	public static void main(String[] args) {

		Gerente priscila = new Gerente();
		priscila.setNome("Priscila Donato");
		priscila.setCpf("222.222.222-22");
		priscila.setSalario(5000);
		priscila.setSenha(5555);
		
		System.out.println(priscila.getNome());
		System.out.println(priscila.getCpf());
		System.out.println(priscila.getSalario());
		System.out.println(priscila.autentica(5555));
		

	}

}
