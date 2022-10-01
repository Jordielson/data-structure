package br.edu.ifpb.eda.algorithms;

import br.edu.ifpb.eda.utils.Ordenacao;

public class BubbleSort implements Ordenacao {
	public void ordenar(long[] v) {
		for(int i = 0; i < v.length - 1; i++) {
			boolean estaOrdenado = true;
	      
			for(int j = 0; j < v.length - 1 - i; j++) {
				if(v[j] > v[j + 1]) {
					long aux = v[j];
					v[j] = v[j + 1];
					v[j + 1] = aux;
					estaOrdenado = false;
				}
			}
			
			if(estaOrdenado) {
				break;	    	  
			}
		}
	}
}


