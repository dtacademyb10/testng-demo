package tests.ui;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Utility {

    public static Object[][] readFromCSV(String path)  {

        List<List<String>> converted = new ArrayList<>();
        try {
            List<String> rows = Files.readAllLines(Path.of(path));

            for (int i = 0; i < rows.size(); i++) {
                if (i == 0) {
                    continue;
                }
                List<String> each = Arrays.asList(rows.get(i).split(","));
                converted.add(each);
            }
        }catch (IOException ex) {
            System.out.println("File " + path + " does not exist");
        }

        Object[][] arr =  new Object[converted.size()][converted.get(0).size()];

        for (int i = 0; i < arr.length; i++) {

            for (int j = 0; j < arr[i].length; j++) {

                arr[i][j] = converted.get(i).get(j);
            }

        }

        return arr;
    }



}
