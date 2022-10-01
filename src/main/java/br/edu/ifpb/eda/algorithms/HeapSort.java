package br.edu.ifpb.eda.algorithms;

import br.edu.ifpb.eda.utils.Ordenacao;

public class HeapSort implements Ordenacao {
	@Override
	public void ordenar(long[] v) {
		int n = v.length;
		
        for (int i = n / 2 - 1; i >= 0; i--)
            heapify(v, n, i);

        for (int i = n - 1; i > 0; i--) {
            long temp = v[0];
            v[0] = v[i];
            v[i] = temp;

            heapify(v, i, 0);
        }
    }

    private void heapify(long v[], int n, int i) {
        int largest = i;
        int l = 2 * i + 1;
        int r = 2 * i + 2; 
 
        if (l < n && v[l] > v[largest])
            largest = l;
 
        if (r < n && v[r] > v[largest])
            largest = r;
 
        if (largest != i) {
            long aux = v[i];
            v[i] = v[largest];
            v[largest] = aux;

            heapify(v, n, largest);
        }
    }	
}


