package Java;

public class AnaliseTemperaturas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double[] temperaturas = {25.3,26.1,24.8,23.5,21.2,
				19.8,19.5,20.9,22.7,23.9,24.5,25.0};
		
		System.out.println("\nMédia anual: "+calcularMedia(temperaturas));
		System.out.println("\nMês mais quente: "+mesMaisQuente(temperaturas));
		System.out.println("\nTemperatura máxima: "+encontraMaximo(temperaturas));
		
	}
	
	public static double calcularMedia(double[] temps) {
		double soma=0;
		for(double temp:temps) {
			soma += temp;
		}
		return soma / temps.length;
	}
	
	public static int mesMaisQuente(double[] temps) {
		int mes = 0;
		double max = temps[0];
		for(int i=1;i<temps.length;i++) {
			if(temps[i] > max) {
				max = temps[i];
				mes = 1;
			}
		}
		return mes+1; //retorna 1-12 em vez de 0-11
	}
	
	public static double encontraMaximo(double[] temps) {
		double max = temps[0];
		for (double temp:temps) {
			if(temp > max) {
				max = temp;
			}
		}
		return max;
	}

}
