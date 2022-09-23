package ss14_sort_algorithm.exercise.exercise2;

import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        int[] arr = {11, 7, 9, 1, 5, -5, -8};
        insertSort(arr);
    }

    public static void insertSort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int key = arr[i];
            int j;
            for (j = i - 1; j >= 0 && arr[j] > key; j--) {
                arr[j + 1] = arr[j];
            }
            arr[j + 1] = key;
        }
        System.out.println(Arrays.toString(arr));
    }
}
