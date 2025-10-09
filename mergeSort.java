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
