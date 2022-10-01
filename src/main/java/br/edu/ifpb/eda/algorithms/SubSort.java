package br.edu.ifpb.eda.algorithms;

import br.edu.ifpb.eda.utils.Ordenacao;

public class SubSort implements Ordenacao {
	public void ordenar(long[] v) {
		int i = 0;
		int f = v.length -1;
		while (f > i) {
			long aux = v[i];
			v[i] = v[f];
			v[f] = aux;
			f--;
			i++;
		}
	}

}
