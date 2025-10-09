import java.util.Arrays;

public class quickSort {
    public static void ordenar (int[] array, int low, int high) {

        if (low < high) {

            int partitionIndex = particionar(array, low, high);

            ordenar (array, low, partitionIndex - 1);

            ordenar (array, partitionIndex + 1, high);

        }

    }

    private static int particionar(int[] array, int low, int high) {

        int pivo = array[high];

        int i = (low - 1);

        for (int j = low; j < high; j++) {

            if (array[j] <= pivo) {

                i++;

                int temp = array[i];

                array[i] = array[j];

                array[j] = temp;

            }

        }

        int temp = array[i + 1];

        array[i + 1] = array[high];

        array[high] = temp;

        return i + 1;

    }

    public static void main(String[] args) {

        int[] dados = { 10, 7, 8, 9, 1, 5 };

        System.out.println("\nArray original: " + Arrays.toString(dados));

        ordenar (dados, 0, dados.length - 1);

        System.out.println("\nDepois de ordenado: " + Arrays.toString(dados));

    }
}



/*
 * import java.util.Arrays;

public class QuickSort {

    // Método público para ordenar o array (chama o método recursivo)
    public static void ordenar(int[] array) {
        ordenar(array, 0, array.length - 1);
    }

    // Método recursivo para ordenar o array entre os índices low e high
    private static void ordenar(int[] array, int low, int high) {
        if (low < high) {
            int partitionIndex = particionar(array, low, high);
            ordenar(array, low, partitionIndex - 1);
            ordenar(array, partitionIndex + 1, high);
        }
    }

    // Método particionar ajustado para ordenar em ordem decrescente
    private static int particionar(int[] array, int low, int high) {
        int pivo = array[high];
        int i = low - 1;

        for (int j = low; j < high; j++) {
            // Trocar a comparação para "maior ou igual" para decrescente
            if (array[j] >= pivo) {
                i++;
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
            }
        }

        int temp = array[i + 1];
        array[i + 1] = array[high];
        array[high] = temp;

        return i + 1;
    }

    public static void main(String[] args) {
        int[] dados = { 10, 7, 8, 9, 1, 5 };

        System.out.println("Array original: " + Arrays.toString(dados));
        ordenar(dados);
        System.out.println("Depois de ordenado (decrescente): " + Arrays.toString(dados));
    }
}

 */