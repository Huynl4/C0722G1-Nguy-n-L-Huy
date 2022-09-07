package ss3_arrays_and_methods_in_java.practice;
//tìm giá trị lớn nhất trong mảng
import javax.swing.plaf.synth.SynthEditorPaneUI;
import java.util.Scanner;

public class FindMaxValueInArray {
    public static void main(String[] args) {
        int size;
        int[] array;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("Nhập độ dài: ");
            size = scanner.nextInt();
            if (size > 20) {
                System.out.println("Chiều dài không được quá 20");
            }
        } while (size > 20);
        array = new int[size];
        int i = 0;
        while (i < array.length) {
            System.out.println("Nhập phần tử " + (i + 1) + ": ");
            array[i] = scanner.nextInt();
            i++;
        }
        System.out.println("Danh sách đã nhập: ");
        for (int j = 0; j < array.length; j++) {
            System.out.println(array[j] + "\t");
        }
        int max = array[0];
        int index = 1;
        for (int j = 0; j < array.length; j++) {
            if (array[j] > max) {
                max = array[j];
                index = j + 1;
            }
        }
        System.out.println("Giá trị lớn nhất trong danh sách là: " + max + ", ở vị trí" + index);
    }
}
