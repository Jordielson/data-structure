package br.edu.ifpb.eda.algorithms;

import br.edu.ifpb.eda.utils.Ordenacao;

public class InsertionSort implements Ordenacao {

	@Override
	public void ordenar(long[] v) {
		long key;
		int j;
		
		for (int i = 1; i < v.length; ++i) {
			key = v[i];
			j = i - 1;

			while (j >= 0 && v[j] > key) {
				v[j + 1] = v[j];
				j--;
			}
			v[j + 1] = key;
		}	
	}
}


