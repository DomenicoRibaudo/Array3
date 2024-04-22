package org.example;


public class Main {
    public static void main(String[] args) {

        int[] array1 = {1, 1, 2, 2, 3, 3, 4, 4, 5, 5};
        int[] array2 = removeDuplicates(array1);
        for (int i = 0; i < array2.length; i++) {
            System.out.println(array2[i]);
        }
    }

    public static int[] removeDuplicates(int[] array) {
        int n = array.length;

        // Nuova lunghezza dell'array senza duplicati
        int newSize = 1;

        // Scansiona l'array e elimina i duplicati
        for (int i = 1; i < n; i++) {
            int j;
            for (j = 0; j < newSize; j++) {
                if (array[i] == array[j]) {
                    break;
                }
            }

            // Se non trova duplicati, aggiunge l'elemento all'array senza duplicati
            if (j == newSize) {
                array[newSize] = array[i];
                newSize++;
            }
        }

        // Crea un nuovo array senza duplicati
        int[] result = new int[newSize];
        for (int i = 0; i < newSize; i++) {
            result[i] = array[i];
        }

        return result;
    }
}