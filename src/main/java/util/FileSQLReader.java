package util;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FileSQLReader {

    public static String readFromFile(String path) {
        StringBuilder stringBuilder = new StringBuilder();

        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(path))) {
            while (bufferedReader.ready()) {
                stringBuilder.append(bufferedReader.readLine()).append("\n");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        return stringBuilder.toString();
    }
}
