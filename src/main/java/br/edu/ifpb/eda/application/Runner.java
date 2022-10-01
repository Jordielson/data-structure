package br.edu.ifpb.eda.application;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import br.edu.ifpb.eda.algorithms.RadixSort;
import br.edu.ifpb.eda.utils.GeradorDeSequencias;
import br.edu.ifpb.eda.utils.Ordenacao;

@Component
public class Runner implements CommandLineRunner {

	@Override
	public void run(String... args) throws Exception {
		Ordenacao metodo = new RadixSort();
		
		int[] tamanhos = {1000, 200000, 2000000, 10000000, 20000000};

		long[][] execucoes = new long[5][];
		long[] tempoMedio = new long[tamanhos.length];
		for (int i = 0; i < execucoes.length; i++) {
			long[] tempoDeExecucao = new long[tamanhos.length];
			for (int j = 0; j < tamanhos.length; j++) {
				long[] v = GeradorDeSequencias.geradorCinco(tamanhos[j]);

				long tempoInicial = System.currentTimeMillis();			
				metodo.ordenar(v);
				long tempoFinal = System.currentTimeMillis();
				Runner.isSort(v);
				
				tempoDeExecucao[j] = tempoFinal - tempoInicial;
				tempoMedio[j] += tempoDeExecucao[j];
			}
			execucoes[i] = tempoDeExecucao;
		}
		for (int i = 0; i < execucoes.length; i++) {
			System.out.println("Tempo de Execução " + i+1 + ": ");
			for (int j = 0; j < execucoes[i].length; j++) {
				System.out.print("Entrada " + tamanhos[j] + "=> ");
				System.out.print(execucoes[i][j] + " / ");
			}
			System.out.println();
		}
		
		System.out.println("Tempo de Execução Médio: ");
		for (int i = 0; i < tempoMedio.length; i++) {
			System.out.print("Entrada " + tamanhos[i] + "=> ");
			System.out.print(((double) tempoMedio[i]/execucoes.length) + " / \n");
		}
	}
	
	public static void isSort(long[] v) {
		boolean estaOrdenado = true;
      
		for(int j = 0; j < v.length - 1; j++) {
			if(v[j] > v[j + 1]) {
				estaOrdenado = false;
			}
		}
		
		if(!estaOrdenado) {
			System.out.println("Não Ordenado!!!!!!!!!!!!!!!!!!!!!!!!!\n\n\n\n\n\n");  	  
		}
	}
	public static void isSort(int[] v) {
		boolean estaOrdenado = true;
      
		for(int j = 0; j < v.length - 1; j++) {
			if(v[j] > v[j + 1]) {
				estaOrdenado = false;
			}
		}
		
		if(!estaOrdenado) {
			System.out.println("Não Ordenado!!!!!!!!!!!!!!!!!!!!!!!!!\n\n\n\n\n\n");  	  
		}
	}
}
