package ss11_stack_queue.exercise.reverse_element_in_integer;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;
import org.w3c.dom.ls.LSOutput;

import javax.swing.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Stack;

// đảo ngược phần tử trong mảng số nguyên
public class TestReverse {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        List<Integer> integers = new ArrayList<>();
        integers.add(1);
        integers.add(2);
        integers.add(3);
        integers.add(4);
        integers.add(5);
        System.out.println(integers);

        for (Integer integer : integers) {
            stack.push(integer);
        }
        integers.clear();

        for (int i = 0; i < stack.size() + i; i++) {

            integers.add(stack.pop());
        }
        System.out.println(integers);

        System.out.println('\n');


        Stack<Character> wStack = new Stack<>();
        String mWord = "lnyuh";
        char[] mWord1 = mWord.toCharArray();
        System.out.println(Arrays.toString(mWord1));
        for (int i = 0; i < mWord1.length; i++) {
            wStack.push(mWord1[i]);
        }
        System.out.println(wStack);
        for (int i = 0; i < mWord1.length; i++) {
            mWord1[i] = wStack.pop();
        }
        System.out.println(Arrays.toString(mWord1));
    }
}

