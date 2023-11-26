package Exercicio13;

import java.util.Scanner;

public class Principal {
	
	IOrdenacaoStrategy ordenacao;
	private Scanner sc = new Scanner(System.in); 
	
	public IOrdenacaoStrategy definirOrdenacao() {
		System.out.println("Digite o tipo de ordenação que deseja usar: ");
		String tipo = sc.nextLine();
		if(tipo.equals("BubbleSort")) {
			ordenacao = new BubbleSort();
		} else if(tipo.equals("MergeSort")) {
			ordenacao = new MergeSort();
		} else if(tipo.equals("QuickSort")) {
			ordenacao = new QuickSort();
		}
		return ordenacao;
	}
	
	
	public void realizarOrdenacao() {
		
		ordenacao = definirOrdenacao();
		
		ordenacao.ordenarLista();
	}

}
