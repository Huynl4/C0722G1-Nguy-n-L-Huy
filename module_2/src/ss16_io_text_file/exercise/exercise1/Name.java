package ss16_io_text_file.exercise.exercise1;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Name {
    public static void main(String[] args) throws IOException {
        File file = new File("src\\ss16_io_text_file\\exercise\\input.txt");
        FileReader fileReader = new FileReader(file);
        BufferedReader bufferedReader = new BufferedReader(fileReader);

        String line;
        int count = 0;

        File file1 = new File("src\\ss16_io_text_file\\exercise\\output.txt");
        FileWriter fileWriter = new FileWriter(file1);
        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

        while ((line = bufferedReader.readLine()) != null) {
            bufferedWriter.write(line);

            count += line.length();
            bufferedWriter.newLine();

        }
        bufferedWriter.write("Số ký tự trong file là: " + count);

        bufferedReader.close();
        bufferedWriter.close();
    }
}
