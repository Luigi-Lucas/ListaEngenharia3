package Exercicio4;

import java.util.Set;

public class Cliente {
	private String nome;
	private String cnh;
	private String email;
	private String cpf;
	private Set<Locacao> locacoes;
	
	public void ressarcirCliente(double valor) {
		
	}
	
	public void validarCnh(String cnh) {
		
	}
	
	public Set<Locacao> getLocacoes() {
		return locacoes;
	}

	public void setLocacoes(Set<Locacao> locacoes) {
		this.locacoes = locacoes;
	}

	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getCnh() {
		return cnh;
	}
	
	public void setCnh(String cnh) {
		this.cnh = cnh;
	}
	
	public String getEmail() {
		return email;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	public String getCpf() {
		return cpf;
	}
	
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
}
