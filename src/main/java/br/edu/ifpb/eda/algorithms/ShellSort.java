package br.edu.ifpb.eda.algorithms;

import br.edu.ifpb.eda.utils.Ordenacao;

public class ShellSort implements Ordenacao {

	public void ordenar(long[] v) {
		this.shellSort2(v);
	}
	
//	Shell Sort implementado com a sequencia n/2^k
	public void shellSort1(long[] v) {
		int n = v.length;
		  
        for (int gap = n/2; gap > 0; gap /= 2) { 
            for (int i = gap; i < n; i += 1) { 
                long temp = v[i]; 
  
                int j = i; 
                while (j >= gap && v[j - gap] > temp) {
                	v[j] = v[j - gap]; 
                	j -= gap;
                }
  
                v[j] = temp; 
            }
        } 
	}
	
//	Shell Sort implementado com a sequencia 4^k+3*2^(k-1)+1
	public void shellSort2(long[] v) {
	    int n = v.length;
//	    gaps = (1, 8, 23, 77, 281, 1073, 4193, 16577, …)
	    int[] gaps = new int[24];
	    gaps[0] = 1;
	    int k = 1;
	    while (k < gaps.length) {
	    	gaps[k] = (int) (Math.pow(4, k) + 3*Math.pow(2, (k-1)) + 1);
	    	k++;
		}
	    
	    long c;
	    int j;
	    for (k--; k >= 0; k--) {
	    	int h = gaps[k];
	    	for (int i = h; i < n; i++) {
	    		c = v[i];
	    		j = i;
	    		while (j >= h && v[j - h] > c) {
	    			v[j] = v[j - h];
	    			j = j - h;
	    		}
	    		v[j] = c;
	    	}
		}
	}
	
//	Shell Sort implementado com a sequencia 3h + 1
	public void shellSort3(long[] v) {
	    int h = 1;
	    int n = v.length;
	    
	    while(h < n) {
	            h = h * 3 + 1;
	    }
	    
	    long c;
	    int j;
	    
	    while (h > 0) {
	    	h = h / 3;
	        for (int i = h; i < n; i++) {
	            c = v[i];
	            j = i;
	            while (j >= h && v[j - h] > c) {
	                v[j] = v[j - h];
	                j = j - h;
	            }
	            v[j] = c;
	        }
	    }
	}
}


