package ss3_arrays_and_methods_in_java.practice;

import java.util.Scanner;
//tìm giá trị trong mảng
public class FindValueInArray {
    public static void main(String[] args) {
        String[] studen = {"Lê Huy", "Nhật Huy", "Quốc Đạt", "Bảo Khánh"};
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập tên cần tìm kiếm: ");
        String name = scanner.nextLine();
        boolean isExit = false;
        for (int i = 0; i < studen.length; i++) {
            if (studen[i].equals(name)) {
                System.out.println("Vị tên của tên sinh viên trong danh sách " + name + " : " + i);
                isExit = true;
                break;
            }
        }
        if (!isExit) {
            System.out.println("Không tìm thấy " + name + " trong danh sách");
        }
    }
}
