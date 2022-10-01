package br.edu.ifpb.eda.algorithms;

import br.edu.ifpb.eda.utils.Ordenacao;

public class QuickSort implements Ordenacao {

	@Override
	public void ordenar(long[] v) {
		if(v.length > 0)
			ordenar(v, 0, v.length-1);
	}
	
	private void ordenar(long[] v, int inicio, int fim) {
		int e, d;
		long aux, pivo;
		
		e = inicio;
		d = fim;
		int random = (int) (Math.random()*(fim+1-inicio) + inicio);
		pivo = v[random];
		while(e < d) {
			while(v[e] < pivo) {
				e++;
			}
			while(v[d] > pivo) {
				d--;
			}
			if(e <= d) {
				aux = v[e];
				v[e] = v[d];
				v[d] = aux;
				e++;
				d--;
			}
		}
		if(d > inicio) {
			ordenar(v, inicio, d);
		}
		if(e < fim) {
			ordenar(v, e, fim);
		}
	}
}
