package ss16_io_text_file.exercise.exercise2;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class CountryTest {
    public static void main(String[] args) throws IOException {
        File file = new File("src\\ss16_io_text_file\\exercise\\exercise2\\listCountry.csv");
        if (!file.exists()) {
            throw new FileNotFoundException();
        }
        FileReader fileReader = new FileReader(file);
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        String line;
        List<Country> countryList = new ArrayList<>();

        while ((line = bufferedReader.readLine()) != null) {
            String[] list = line.split(", ");
            Country country = new Country(Integer.parseInt(list[0]), list[1], list[2]);
            countryList.add(country);
        }
        for (Country country : countryList) {
            System.out.println(country);
        }
        bufferedReader.close();
    }
}
