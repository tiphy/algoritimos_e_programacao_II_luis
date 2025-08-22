
import java.util.Scanner;

public class posicaoVetor {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        
        int [] pos = new int []{2,5,1,3,4,9,7,8,10,6};

        System.out.println("informe a posicao: ");
        int num = ler.nextInt();

        if(num < 0 || num >= pos.length){
            System.out.println("Posição inválida!");
            return;
        }
        System.out.println("O valor na posição " + num + " é " + pos[num]);

    }
    
}
