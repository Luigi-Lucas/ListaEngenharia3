package Exercicio4;

import java.time.LocalDate;

public class Locacao {
	private double valor;
	private LocalDate dataInicio;
	private double valorCaucao;
	private String local;
	
	public void locarVeiculo(Cliente cliente, Veiculo veiculo) {
		
	}
	
	public void calcularPagamento(double valor) {
		
	}
	
	public double getValor() {
		return valor;
	}
	
	public void setValor(double valor) {
		this.valor = valor;
	}
	
	public LocalDate getDataInicio() {
		return dataInicio;
	}
	
	public void setDataInicio(LocalDate dataInicio) {
		this.dataInicio = dataInicio;
	}
	
	public double getValorCaucao() {
		return valorCaucao;
	}
	
	public void setValorCaucao(double valorCaucao) {
		this.valorCaucao = valorCaucao;
	}
	
	public String getLocal() {
		return local;
	}
	
	public void setLocal(String local) {
		this.local = local;
	}
	
}
