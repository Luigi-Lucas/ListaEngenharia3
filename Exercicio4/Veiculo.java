package Exercicio4;

import java.time.LocalDate;
import java.util.Set;

public class Veiculo implements IAutomovel{

	private String marca;
	private String modelo;
	private LocalDate anoLancamento;
	private Set<Locacao> locacoes;
	
	@Override
	public void comprarVeiculo(IAutomovel veiculo) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void venderVeiculo(double valor) {
		// TODO Auto-generated method stub
		
	}
	
	public String getMarca() {
		return marca;
	}
	
	public void setMarca(String marca) {
		this.marca = marca;
	}
	
	public String getModelo() {
		return modelo;
	}
	
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	
	public LocalDate getAnoLancamento() {
		return anoLancamento;
	}
	
	public void setAnoLancamento(LocalDate anoLancamento) {
		this.anoLancamento = anoLancamento;
	}
	
	public Set<Locacao> getLocacoes() {
		return locacoes;
	}
	
	public void setLocacoes(Set<Locacao> locacoes) {
		this.locacoes = locacoes;
	}

}
