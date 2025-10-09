/* 
import java.util.*;
public class margeSort{
    public static void mergSort(int[] array){
        //se o array tiver 1 ou 0 elemento , ele ja esta criado 
        if (array.length < 2){
            return;
        }

        //encontrar o ponto medio do array
        int mid = array.length / 2;
        //cria um sub-array para a metade da esquerda
        int[] left = new int[mid];
        //cria um sub-array para a metade da direita 
        int[] right = new int[array.length - mid];

        //copia os elementos para o sub-array
        //array.copyOfRange é uma maneira eficiente de fazer isso 
        System.arraycopy(array, 0, left, 0, mid);
        System.arraycopy(array, mid, right, 0, array.length - mid);
        
        //chamada recursiva para ordevar a metade da esquerda 
        mergSort(left);
        //chamada recursiva para ordenar a metade da direita 
        mergSort(right);

        //combina as duas metades ordenadas em um so array 
        merge(array, left, right);

    }

    //metodo que eu vou mesclar (combinar) dois sub-arrays ordenados 
    private static void merge(int[] array, int[] left, int[] right){
        int i = 0; //ponteiro para o array left
        int j = 0; //ponteiro para o array right
        int k = 0; //ponteiro para o array original array 

        //percorre os dopis sub-arrays e insere o menor elemento no array principal 
        while (i < left.length && j < right.length) {
            if(left[i] <= right[i]){
                array[k++] = left[i++];
            }
            else{
                array[k++] = right[j++];
            }
        }

        //copia os elementos restantes do array left (se houver)
        while(i < left.length){
            array[k++] = left[i++];
        }
        //copia os elementos restantes do array right (se houver)
        while(i < right.length){
            array[k++] = right[j++];
        }


    }

    public static void main(String[] args) {

        int[] dados = {38,27,9,43,2,82,10};

        System.out.println("\nArray Original: " + Arrays.toString(dados));
        mergSort(dados);
        System.out.println("\nArray Ordenado: " + Arrays.toString(dados));
        
    }
}

 */

import java.util.Arrays;

public class margeSort {

    // Método principal que inicia o processo de ordenação

    public static void mergeSort(int[] array) {

        // Se o array tiver 1 ou 0 elementos, ele já está ordenado.

        if (array.length < 2) {

            return;

        }

        // Encontra o ponto médio do array.

        int mid = array.length / 2;

        // Cria um sub-array para a metade da esquerda.

        int[] left = new int[mid];

        // Cria um sub-array para a metade da direita.

        int[] right = new int[array.length - mid];

        // Copia os elementos para os sub-arrays.

        // Array.copyOfRange é uma maneira eficiente de fazer isso.

        System.arraycopy(array, 0, left, 0, mid);

        System.arraycopy(array, mid, right, 0, array.length - mid);

        // Chamada recursiva para ordenar a metade da esquerda.

        mergeSort(left);

        // Chamada recursiva para ordenar a metade da direita.

        mergeSort(right);

        // Combina as duas metades ordenadas em um único array.

        merge(array, left, right);

    }

    // Método que mescla (combina) dois sub-arrays ordenados.

    private static void merge(int[] array, int[] left, int[] right) {

        int i = 0; // Ponteiro para o array 'left'

        int j = 0; // Ponteiro para o array 'right'

        int k = 0; // Ponteiro para o array original 'array'

        // Percorre os dois sub-arrays e insere o menor elemento no array principal.

        while (i < left.length && j < right.length) {

            if (left[i] <= right[j]) {

                array[k++] = left[i++];

            } else {

                array[k++] = right[j++];

            }

        }

        // Copia os elementos restantes do array 'left' (se houver).

        while (i < left.length) {

            array[k++] = left[i++];

        }

        // Copia os elementos restantes do array 'right' (se houver).

        while (j < right.length) {

            array[k++] = right[j++];

        }

    }

    public static void main(String[] args) {

        int[] dados = { 38, 27, 43, 3, 9, 82, 10 };

        System.out.println("Array original: " + Arrays.toString(dados));

        mergeSort(dados);

        System.out.println("Array ordenado: " + Arrays.toString(dados));

    }

}
