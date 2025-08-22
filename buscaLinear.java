public class buscaLinear {

    public static int buscar(int[] array, int valorProcurado){
        for(int i = 0; i < array.length; i++ ){
            if(array[i] == valorProcurado){
                System.out.println("\nBusca Linear: Valor: " + valorProcurado + " encontrado no indice " + i);
                return i;
            }
        }
        System.out.println("\nBusca linear. Valor: " + valorProcurado + " não encontrado" );
        return -1;
    }
    public static void main(String[] args) {
        int[] idsClientes = {105,201,350,422,599,608};
        int idProcurado = 422;
        int idInexistente = 999;

        buscar(idsClientes, idProcurado);
        buscar(idsClientes, idInexistente);
    
    }
    
}
