package ss16_io_text_file.exercise.exercise2;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        File file = new File("src\\ss16_io_text_file\\exercise\\exercise2\\input.csv");
        FileReader fileReader = new FileReader(file);
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        String line;
        List<NationModel> nationModelList = new ArrayList<>();
        String[] info;
        NationModel nationModel;
        while ((line = bufferedReader.readLine()) != null) {
            info = line.split(",");
            nationModel = new NationModel(Integer.parseInt(info[0]), info[1], info[2]);
            nationModelList.add(nationModel);
        }
        bufferedReader.close();
        for (NationModel nation : nationModelList) {
            System.out.println(nation.getName());
        }
    }
}
