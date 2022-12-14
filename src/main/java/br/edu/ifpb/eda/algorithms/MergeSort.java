package br.edu.ifpb.eda.algorithms;

import br.edu.ifpb.eda.utils.Ordenacao;

public class MergeSort implements Ordenacao {
	
	public void ordenar(long[] v) {
		mergeSort(v, v.length);
	}
	
	private void mergeSort(long[] a, int n) {
	    if (n < 2) {
	        return;
	    }
	    int mid = n / 2;
	    long[] l = new long[mid];
	    long[] r = new long[n - mid];

	    for (int i = 0; i < mid; i++) {
	        l[i] = a[i];
	    }
	    for (int i = mid; i < n; i++) {
	        r[i - mid] = a[i];
	    }
	    mergeSort(l, mid);
	    mergeSort(r, n - mid);

	    merge(a, l, r, mid, n - mid);
	}
	
	private void merge(long[] a, long[] l, long[] r, int left, int right) {
	    int i = 0, j = 0, k = 0;
	    while (i < left && j < right) {
	        if (l[i] <= r[j]) {
	            a[k++] = l[i++];
	        }
	        else {
	            a[k++] = r[j++];
	        }
	    }
	    while (i < left) {
	        a[k++] = l[i++];
	    }
	    while (j < right) {
	        a[k++] = r[j++];
	    }
	}	
}


