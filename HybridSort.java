import java.util.Arrays;

public class HybridSort {

    static class Livro {
        String isbn;
        int paginas;

        Livro(String isbn, int paginas) {
            this.isbn = isbn;
            this.paginas = paginas;
        }

        @Override
        public String toString() {
            return "(" + isbn + ", " + paginas + ")";
        }
    }

    // QuickSort por número de páginas (crescente)
    public static void quickSortLivros(Livro[] livros, int low, int high) {
        if (low < high) {
            int pi = particionar(livros, low, high);
            quickSortLivros(livros, low, pi - 1);
            quickSortLivros(livros, pi + 1, high);
        }
    }

    private static int particionar(Livro[] livros, int low, int high) {
        Livro pivo = livros[high];
        int i = low - 1;
        for (int j = low; j < high; j++) {
            if (livros[j].paginas < pivo.paginas) {
                i++;
                trocar(livros, i, j);
            }
        }
        trocar(livros, i + 1, high);
        return i + 1;
    }

    private static void trocar(Livro[] livros, int i, int j) {
        Livro temp = livros[i];
        livros[i] = livros[j];
        livros[j] = temp;
    }

    // MergeSort por ISBN (ordem alfabética) para subarrays
    public static void mergeSortPorISBN(Livro[] livros, int left, int right) {
        if (left < right) {
            int mid = (left + right) / 2;
            mergeSortPorISBN(livros, left, mid);
            mergeSortPorISBN(livros, mid + 1, right);
            merge(livros, left, mid, right);
        }
    }

    private static void merge(Livro[] livros, int left, int mid, int right) {
        int n1 = mid - left + 1;
        int n2 = right - mid;

        Livro[] leftArray = new Livro[n1];
        Livro[] rightArray = new Livro[n2];

        for (int i = 0; i < n1; i++) leftArray[i] = livros[left + i];
        for (int j = 0; j < n2; j++) rightArray[j] = livros[mid + 1 + j];

        int i = 0, j = 0, k = left;
        while (i < n1 && j < n2) {
            // comparar ISBNs alfabeticamente
            if (leftArray[i].isbn.compareTo(rightArray[j].isbn) <= 0) {
                livros[k++] = leftArray[i++];
            } else {
                livros[k++] = rightArray[j++];
            }
        }
        while (i < n1) livros[k++] = leftArray[i++];
        while (j < n2) livros[k++] = rightArray[j++];
    }

    // Após quicksort por páginas, ordena por ISBN os subarrays com páginas iguais
    public static void ordenarPorISBNEmEmpates(Livro[] livros) {
        int start = 0;
        for (int i = 1; i <= livros.length; i++) {
            // Quando chega ao final ou o próximo livro tem páginas diferentes
            if (i == livros.length || livros[i].paginas != livros[start].paginas) {
                if (i - start > 1) {  // se tem empate, ordena por ISBN
                    mergeSortPorISBN(livros, start, i - 1);
                }
                start = i;
            }
        }
    }

    public static void main(String[] args) {
        Livro[] livros = {
            new Livro("978-3-16-148410-0", 200),
            new Livro("978-1-23-456789-7", 150),
            new Livro("978-0-12-345678-9", 200),
            new Livro("978-4-56-789012-3", 300),
            new Livro("978-0-98-765432-1", 150),
            new Livro("978-9-87-654321-0", 200),
        };

        System.out.println("Antes da ordenação:");
        System.out.println(Arrays.toString(livros));

        // 1. Ordenar pelo número de páginas com QuickSort
        quickSortLivros(livros, 0, livros.length - 1);

        // 2. Ordenar subarrays empatados pelo ISBN com MergeSort
        ordenarPorISBNEmEmpates(livros);

        System.out.println("\nDepois da ordenação híbrida:");
        System.out.println(Arrays.toString(livros));
    }
}




/*
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


------------------------------------------------merge-----------------------------------------
import java.util.*;

public class mergeSort {

    public static void ordenar(int[] array) {

        if (array.length < 2) {

            return;
        }

        int mid = array.length / 2;

        int[] left = new int[mid];

        int[] right = new int[array.length - mid];

        System.arraycopy(array, 0, left, 0, mid);

        System.arraycopy(array, mid, right, 0, array.length - mid);

        ordenar(left);

        ordenar(right);

        unir(array, left, right);

    }

    private static void unir(int[] array, int[] left, int[] right) {

        int i = 0;

        int j = 0;

        int k = 0;

        while (i < left.length && j < right.length) {

            if (left[i] <= right[j]) {

                array[k++] = left[i++];

            } else {

                array[k++] = right[j++];

            }

        }

        while (i < left.length) {

            array[k++] = left[i++];

        }

        while (j < right.length) {

            array[k++] = right[j++];

        }
    }

    public static void main(String[] args) {

        int[] dados = { 38, 27, 43, 3, 9, 82, 10 };

        System.out.println("Array original: " + Arrays.toString(dados));

        ordenar(dados);

        System.out.println("Array ordenado: " + Arrays.toString(dados));

    }
}


 */