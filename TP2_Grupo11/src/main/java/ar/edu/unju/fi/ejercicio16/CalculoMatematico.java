package ar.edu.unju.fi.ejercicio16;

public class CalculoMatematico {
	private int n;

	
	public CalculoMatematico(int n) {
		this.n = n;
	}

	public int getN() {
		return n;
	}

	public void setN(int n) {
		this.n = n;
	}
	
	public int calcularSumatoria() {
		int result = 0;
		for(int k=1; k<=n; k++) {
			result += Math.pow(((n*(n+1))/2),2);
		}
		return result;
	}
	public int calcularProductoria() {
		int result = 0;
		for(int k=1;k<=n;k++) {
			result += k*(k+4);
		}
		return result;
	}
}
