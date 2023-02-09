package cliente;

public class TesteCliente {

	public static void main(String[] args) {
		Cliente c = new Cliente("Jo�o", "123123123-33");
		Endereco endereco = new Endereco();
		
		c.setEndereco(endereco);
		endereco.setRua("Amazonas");
		
		System.out.println("Rua " + c.getEndereco().getRua());
	
		endereco.setBairro("Cibratel");
		System.out.println(c.getEndereco().getBairro());
	
	}

}
