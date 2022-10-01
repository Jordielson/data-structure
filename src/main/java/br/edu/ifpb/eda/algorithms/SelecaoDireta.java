package br.edu.ifpb.eda.algorithms;

import br.edu.ifpb.eda.utils.Ordenacao;

public class SelecaoDireta implements Ordenacao {

	@Override
	public void ordenar(long[] v) {
		for (int fixo = 0; fixo < v.length - 1; fixo++) {
			int menor = fixo;

			for (int i = menor + 1; i < v.length; i++) {
				if (v[i] < v[menor]) {
					menor = i;
				}
			}
			if (menor != fixo) {
				long aux = v[fixo];
				v[fixo] = v[menor];
				v[menor] = aux;
			}
		}
	}

}

