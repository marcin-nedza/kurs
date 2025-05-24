package src.com.kurs.lesson2.excercise4;

import java.io.BufferedReader;
import java.io.FileReader;

public class Scanner {
    public static String runLine(String path) {
        try (BufferedReader reader = new BufferedReader(new FileReader(path))) {
            String line = reader.readLine();
            return line;
        } catch (Exception e) {
            System.err.println(e.getMessage());
            return "";
        }

    }
}
