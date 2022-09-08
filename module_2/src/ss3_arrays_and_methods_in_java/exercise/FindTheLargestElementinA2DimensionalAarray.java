package ss3_arrays_and_methods_in_java.exercise;

import java.util.Arrays;
import java.util.Scanner;

//tìm phần tử lớn nhất trong mảng 2 chiều
public class FindTheLargestElementinA2DimensionalAarray {
    public static void main(String[] args) {
        int[][] arr = {{1, 2, 3, 4, 5}, {6, 7, 8, 9, 10}};
        int max = arr[0][0];
        int index = 0;
        int index1 = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 1; j < arr[i].length; j++) {
                if (arr[i][j] >= max) {
                    max = arr[i][j];
                    index = i;
                    index1 = j;
                }
            }
        }
        System.out.println("Phần tử lớn nhất trong mảng: " + max + "tại vị trí" + index + "," + index1);
    }
}