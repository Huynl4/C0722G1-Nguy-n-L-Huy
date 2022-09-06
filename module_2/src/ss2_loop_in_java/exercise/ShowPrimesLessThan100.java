package ss2_loop_in_java.exercise;
//hiển thị các số nguyên tố nhỏ hơn 100
public class ShowPrimesLessThan100 {
    public static void main(String[] args) {
        int number = 100;
        int count = 0;
        int n = 2;
        while (n < number) {
            int value = 0;
            for (int i = 2; i < n; i++) {
                if (n % i == 0) {
                    value += 1;
                }
            }
            if (value == 0) {
                System.out.println(n);
                count++;
            }
            n++;
        }
    }
}
