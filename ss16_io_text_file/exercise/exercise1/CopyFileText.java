package ss16_io_text_file.exercise.exercise1;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class CopyFileText {
    public static void main(String[] args) throws IOException {
        /*
         * Đọc dữ liệu
         */
        File file1 = new File("src\\ss16_io_text_file\\exercise\\exercise1\\sourceFile.txt");
        if (!file1.exists()) {
            throw new FileNotFoundException();
        }
        FileReader fileReader = new FileReader(file1);
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        String line;
        List<String> list = new ArrayList<>();
        while ((line = bufferedReader.readLine()) != null) {
            list.add(line);
        }
        bufferedReader.close();

        /*
         * Ghi dữ liệu
         */
        File file2 = new File("src\\ss16_io_text_file\\exercise\\exercise1\\targetFile.txt");
        if (!file2.exists()) {
            throw new FileNotFoundException();
        }
        FileWriter fileWriter = new FileWriter(file2, false);
        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

        for (String i : list) {
            bufferedWriter.write(i);
            bufferedWriter.newLine();
        }
        bufferedWriter.close();

        StringBuilder string = new StringBuilder();
        for (String str : list) {
            string.append(str);
        }
        string.toString().split("");
        System.out.println("Số lượng ký tự trong file: " + string.length());
    }
}
