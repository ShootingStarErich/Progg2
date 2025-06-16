package Aufgabe2_1;

import java.util.Arrays;

public class prog {

    public static void main(String[] s) {
        int[] array = { 2000, 2, 45, 34, 100000, 345, 56, 78, 99, 756, 999, 0, 666, 2345, 7492, 22 };

        // Ausgabe unsortiertes Arra
        System.out.println(Arrays.toString(array));

        // bubbleSort Aufruf

        bubbleSort(array);

        // Ausgabe sortiertes Array
        System.out.println(Arrays.toString(array));

    }

    public static void bubbleSort(int[] array) {

        for (int counter = 0; counter < array.length; counter++) {
            for (int pass = 0; pass < array.length; pass++) {
                for (int element = 0; element < array.length - 1 - pass; element++) {
                    if (array[element] > array[element + 1]) {
                        int temp = array[element];
                        array[element] = array[element + 1];
                        array[element + 1] = temp;
                    }
                }
            }
        }
    }
} // end class BubbleSort
