package cliente;

import sistemaInterno.AutenticacaoUtil;
import sistemaInterno.Autenticavel;

public class Cliente implements Autenticavel {
	private String nome;
	private String cpf;
	private String profissao;
	private Endereco endereco;
	private AutenticacaoUtil autenticador;
	
	
	public Cliente(String nome, String cpf) {
		this.nome = nome;
		this.cpf = cpf;
		this.autenticador = new AutenticacaoUtil(); //relação de composição
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

	
	@Override
	public void setSenha(int senha) {
		this.autenticador.setSenha(senha);
		}

	@Override
	public boolean autentica(int senha) {
		return this.autenticador.autentica(senha);
	}
}
