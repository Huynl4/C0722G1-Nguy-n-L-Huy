package ss11_stack_queue.exercise.check_out_the_palindrome_string_using_queue;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Queue;
import java.util.Stack;

public class Palindrome {
    public static void main(String[] args) {
        String strings = "huy le el yuh";
        String[] string2 = strings.split("");
        Stack<String> stringStack = new Stack<>();
        Queue<String> queue = new ArrayDeque<>();
        for (int i = 0; i < strings.length(); i++) {
            stringStack.push(string2[i]);
            queue.offer(string2[i]);
        }
        System.out.println(queue);
        int count = 0;
        for (int i = 0; i < queue.size(); i++) {
            if (stringStack.peek().equals(queue.peek())) {
                count += 1;
            }
        }
        if (count == queue.size()) {
            System.out.println("Well");
        } else {
            System.out.println("notWell");
        }
    }
}
