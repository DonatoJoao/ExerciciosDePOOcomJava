package funcionarios;

public class Testefuncionario {

	public static void main(String[] args) {

		
		Funcionario joao = new Funcionario();
		
		joao.setNome("João Donato");
		joao.setCpf("333.333.333-33");
		joao.setSalario(3000);
		
		System.out.println(joao.getNome());
		System.out.println(joao.getSalario());
		System.out.println(joao.getBonificacao());
	}

}
