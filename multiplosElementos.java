public class multiplosElementos {

    public static int buscar(int[] array, int valorProcurado){
        for(int i = 0; i < array.length; i++ ){
            if(array[i] == valorProcurado){
                System.out.println("\nBusca Linear: Valor: " + valorProcurado + " encontrado no indice " + i);
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] idsClientes = {10,25,40,10,50,10};
        int idProcurado = 10;

        buscar(idsClientes, idProcurado);
        
    }    
}
