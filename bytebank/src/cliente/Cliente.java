package cliente;

public class Cliente {
	private String nome;
	private String cpf;
	private String profissao;
	private Endereco endereco;
	
	public Cliente(String nome, String cpf) {
		this.nome = nome;
		this.cpf = cpf;
	}
	
//	public void setNome(String nome) {
//		this.nome = nome;
//	}
	
	public String getNome() {
		return nome;
	}
//	public void setCpf(String cpf) {
//		this.cpf = cpf;
//	}
	public String getCpf() {
		return cpf;
	}
	public void setProfissao(String profissao) {
		this.profissao = profissao;
	}
	public String getProfissao() {
		return profissao;
	}
	
	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}
	
	public Endereco getEndereco() {
		return endereco;
	}
}
