package br.edu.ifpb.eda.algorithms;

public class CountingSort {

	public static void sort(int[] v) {
		int maxValue = findMax(v, v.length);
		int[] counts = new int[maxValue + 1];
		
		for (int i = 0; i < v.length; i++) {
			counts[v[i]]++;
		}
		
	    int targetPos = 0;
	    for (int i = 0; i < counts.length; i++) {
	    	for (int j = 0; j < counts[i]; j++) {
	    		v[targetPos++] = i;
	    	}
	    }
	}
	
	public static int findMax(int v[], int n) {   
	    int max = v[0];
	    for (int i = 1; i < n; i++){
	        if (v[i] > max)
	            max = v[i];
	    }
	    return max;
	}
}
