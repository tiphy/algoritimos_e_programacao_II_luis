import java.util.Scanner;

public class dezNumVetor {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        int[] numeros = new int[10];
        for(int i = 0; i < 10; i++){
            System.out.println("informe o numero: ");
            int num = ler.nextInt();
            numeros[i] = num;
        }
        for(int i = 0; i < 10; i++) {
            System.out.println(numeros[i]);
        }

     
    }
    
}
