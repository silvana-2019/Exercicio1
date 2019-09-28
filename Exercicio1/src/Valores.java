public class Valores implements ValoresITF {

	int valores[] = new int[10];

	public Valores() {

	}

	
	@Override
	public int del(int num) {
		int valor = 0;
		valor = valores[num];
		valores[num]=0;
		return valor;
	}
	
	@Override
	public boolean ins(int v) {
		boolean var = false;
		for (int i = 0; i < valores.length; i++) {
			if (this.valores[i] == 0) {
				if (var == false)
					valores[i] = v;
				var = true;
				break;
			}
		}
		return false;
	}

	

	@Override
	public int size() {
		int Cont = 0;
		for ( int i = 0 ; i < valores.length; i++) {
			if (valores [i] != 0) {
				Cont ++;
			}
		}
		return Cont ;
	}

	@Override
	public double mean() {
		double soma = 0;
		double media = 0;
		if (valores.length <= 0) {
			return -1;
		}
		for (int k = 0; k < this.valores.length - 1; k++) {
			soma += valores[k];
		}

		return media = soma / (valores.length - 1);
	}

	@Override
	public int greater() {
		int maior = valores[0];
		for (int i = 0; i < valores.length - 1; i++)
			if (maior < valores[i])
				maior = valores[i];

		return maior;
	}

	@Override
	public int lower() {
		int menor = valores[0];
		for (int i = 0; i < valores.length - 1; i++)
			if (menor > valores[i] )
				menor = valores[i];
		return menor;
	}

}