package Exercicio4;

import java.time.LocalDate;

public class Devolucao {

	private LocalDate dataDevolucao;
	private double quilometragem;
	private String condicaoCarro;
	private Locacao locacao;
	
	public void gerarDevolucao(LocalDate dataDevolucao, double quilometragemPercorrida, String condicao) {
		
	}
	
	public String verificarCondicao() {
		return this.condicaoCarro;
	}
	
	public LocalDate getDataDevolucao() {
		return dataDevolucao;
	}

	public void setDataDevolucao(LocalDate dataDevolucao) {
		this.dataDevolucao = dataDevolucao;
	}

	public double getQuilometragem() {
		return quilometragem;
	}

	public void setQuilometragem(double quilometragem) {
		this.quilometragem = quilometragem;
	}

	public String getCondicaoCarro() {
		return condicaoCarro;
	}

	public void setCondicaoCarro(String condicaoCarro) {
		this.condicaoCarro = condicaoCarro;
	}

	public Locacao getLocacao() {
		return locacao;
	}

	public void setLocacao(Locacao locacao) {
		this.locacao = locacao;
	}

}
