package ss13_search_algorithm.exercise.exercise3;

import java.util.LinkedList;
import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập chuỗi kiểm tra: ");
        String string = scanner.nextLine();
        LinkedList<Character> max = new LinkedList<>();
        Stack<Character> list = new Stack<>();

        for (int i = 0; i < string.length(); i++) {
            if (list.size() > 1 && string.charAt(i) <= list.peek() && list.contains(string.charAt(i))) {
                list.clear();
            }
            list.add(string.charAt(i));
            if (list.size() > max.size()) {
                max.clear();
                max.addAll(list);
            }
        }
        for (Character character : max) {
            System.out.print(character);
        }
    }
}
