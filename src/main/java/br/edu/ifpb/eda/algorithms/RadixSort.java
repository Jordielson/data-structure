package br.edu.ifpb.eda.algorithms;

import br.edu.ifpb.eda.utils.Ordenacao;

public class RadixSort implements Ordenacao {
	
	public void ordenar(long[] v){
		radixSort(v, v.length);
	}
	
	long getMax(long A[], int n) {   
	    long max = A[0];
	    for (int i = 1; i < n; i++){
	        if (A[i] > max)
	            max = A[i];
	    }
	    return max;
	}
	
	void radixSort(long A[], int n) {
		int i = 1;
		long digitPlace = 1;
	    long[] result = new long[n];
	    long largestNum = getMax(A, n);
	    while(largestNum/digitPlace >0){
	        int[] count = new int[10];
	        for (i = 0; i < n; i++)
	            count[ (int)((A[i]/digitPlace)%10)]++;
	        for (i = 1; i < 10; i++)
	            count[i] += count[i - 1];
	        for (i = n - 1; i >= 0; i--) {   
	        	result[count[ (int) ((A[i]/digitPlace)%10) ] - 1] = A[i];
	            count[ (int) ((A[i]/digitPlace)%10) ]--;
	        }
	        for (i = 0; i < n; i++)
	            A[i] = result[i];
	        digitPlace *= 10;
	    }
	}
}

