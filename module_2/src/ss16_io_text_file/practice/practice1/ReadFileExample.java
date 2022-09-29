package ss16_io_text_file.practice.practice1;

import java.io.*;
import java.util.Scanner;

public class ReadFileExample {
    public static void main(String[] args) throws IOException {
        File file = new File("src\\ss16_io_text_file\\practice\\practice1\\file.txt");
        FileReader fileReader = new FileReader(file);
        BufferedReader bufferedReader = new BufferedReader(fileReader);

        String line = "";
        int sum = 0;
        while ((line = bufferedReader.readLine()) != null) {
            System.out.println(line);
            sum += Integer.parseInt(line);
        }
        bufferedReader.close();
        System.out.println("tổng = :" + sum);
    }
}
