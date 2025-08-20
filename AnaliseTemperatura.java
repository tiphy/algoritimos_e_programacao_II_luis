public class AnaliseTemperatura {
    public static void main(String[] args) {
        
        double[] temperatura = new double[]{25.2,17.5,18.9,23.5,12.4,31.4,17.2,19.6,25.2,27.9,10.4,25.2};

        System.out.println("\nMedia anual: " + calculaMedia(temperatura));
        System.out.println("\nMes mais quente: " + mesMaisQuente(temperatura));
        System.out.println("\nTemperatura máxima: " + encontraMaxima(temperatura));

    }

    public static double calculaMedia(double[] temps){
        double soma = 0;
        for (double temp : temps) {
            soma += temp;
        }
        return soma / temps.length;
    }
    
    public static int mesMaisQuente(double[] temps){
        int mesQuente = 0;
        double max = temps[0];
        for (int i = 1; i < temps.length; i++) {
            if (temps[i] > max) {
                max = temps[i];
                mesQuente = i;
            }
        }
        return mesQuente;
    }

    public static double encontraMaxima(double[] temps){
        double max = temps[0];
        for (int i = 1; i < temps.length; i++) {
            if (temps[i] > max) {
                max = temps[i];
            }
        }
        return max;
    }


}
