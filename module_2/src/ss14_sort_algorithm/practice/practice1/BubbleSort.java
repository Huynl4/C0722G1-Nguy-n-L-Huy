package ss14_sort_algorithm.practice.practice1;

public class BubbleSort {
    static int[] list = {2, 3, 0, 5, 6, 1, -4, 3, 15, 13};

    public static void bubbleSort(int[] list) {
        boolean needNextPass = true;
        for (int i = 1; i < list.length && needNextPass; i++) {
            needNextPass = false;
            for (int j = 0; j < list.length - j; j++) {
                if (list[j] > list[j + 1]) {
                    int temp = list[j];
                    list[j] = list[j + 1];
                    list[j + 1] = temp;
                    needNextPass = true;
                }
            }
        }
    }

    public static void main(String[] args) {
        bubbleSort(list);
        for (int value : list) System.out.print(value + " ");
    }
}
