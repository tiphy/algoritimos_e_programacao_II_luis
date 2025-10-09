import java.util.Arrays;

public class elementoDuplicado {

    public static int buscar(int[]array, int valorProcurado){
        Arrays.sort(array);
        int inicio = -1;
        int fim = array.length -1;

        while (inicio <= fim) {
            int meio = inicio + (fim - inicio) / 2;
            if(array[meio] == valorProcurado){
                System.out.println("\nBusca binaria.\n\nValor: " + valorProcurado + " encontrado no indice " + meio);
                return meio;
            }
            if(array[meio] > valorProcurado){
                fim = meio;
            } else{
                inicio = meio;
            }   
        }
        System.out.println("\nBusca binaria.\nValor: " + valorProcurado + " não foi encontrado ");
        return -1;

    }
    public static void main(String[] args) {

        int[] idsClientes = {1,5,8,8,8,12,15};
        int idProcurado = 8;

        buscar(idsClientes, idProcurado);

    }
}
