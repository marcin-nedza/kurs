package src.com.kurs.lessons;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class homework4 {
    public static void main(String[] args) {
        // files();
        dictionary();
    }

    public static void files() {
        // Zapisz do pliku kilka nazw zwierzat, odczytaj je i wypisz
        String filePath = "testfile.txt";
        String[] animals = { "dog", "cat", "fish" };
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filePath))) {
            for (String an : animals) {
                writer.write(an + "\n");
            }
        } catch (Exception e) {
            System.err.println(e.getMessage());
            e.printStackTrace();
        }

        System.out.println("Reading file : " + filePath);
        readFile(filePath);

        System.out.println("Cleaning file...");

        cleanFile(filePath);

        // Stworz plik z 10 liczbami, wczytaj je i przypisz do tablicy, wyswietl cala
        // tablice
        int[] nums = new int[10];
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filePath))) {
            for (int i : nums) {
                writer.append(String.valueOf(Math.ceil(Math.random() * 10)) + "\n");
            }
        } catch (Exception e) {
            System.err.println(e.getMessage());
            e.printStackTrace();
        }

        System.out.println("Reading file : " + filePath);
        readFile(filePath);
        cleanFile(filePath);
        // Stwórzmy program ktory pozwala zapisac do pliku 3 imiona podane przez
        // uzytkownika. Nastepnie odczytajmy te imiona i
        // wyswietlmy najdluzsze z nich
        try (Scanner sc = new Scanner(System.in)) {
            // String[] names = new String[3];
            for (int i = 0; i < 3; i++) {
                System.out.printf("Write %d name: ", i + 1);
                String name = sc.nextLine();
                writeToFile(filePath, name, true);
                // names[i] = sc.nextLine();
            }
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }

        readCheckLongest(filePath);
        cleanFile(filePath);
        // Zapiszmy do pliku n losowych liczb (z zakresu 1-8). Kazda liczba ma byc
        // losowa z zakresu 5-15
        int rand1 = (int) Math.ceil(Math.random() * 8) + 1;
        for (int i = 0; i < rand1; i++) {
            int rand2 = (int) Math.ceil(Math.random() * 11) + 5;
            writeToFile(filePath, String.valueOf(rand2), true);
        }
        readFile(filePath);
    }

    public static void dictionary() {
        // Stworz plik slownik z kilkunastoma wyrazami. Wsrod tych wyrazow wsadz kilka
        // kurde, kurcze i kurka.
        // Program ma za zadanie kazdy wyraz brzydki zastapic ** i zapisac
        // całosc do nowego pliku ktory sie nazywa
        // slownikPoprawiony
    	// W pliku tekstowym sa wyrazy. Wypisz te ktore sa palindromami np kajak, ala

        String dictionaryPath = "slownik.txt";
        String dictionaryPath2 = "slownikPoprawiony.txt";
        String[] dictionary = { "kurde", "kurka", "cos", "jdsfjsf", "kurcze", "uuuduf", "iiwiwiwiw", "ana", "kajak" };

        cleanFile(dictionaryPath);
        cleanFile(dictionaryPath2);

        for (String w : dictionary) {
            writeToFile(dictionaryPath, w, true);
        }
        List<String> badW = new ArrayList<>();
        badW.add("kurde");
        badW.add("kurcze");
        badW.add("kurka");

        try (BufferedReader reader = new BufferedReader(new FileReader(dictionaryPath))) {
            String line = reader.readLine();

            while (line != null) {
                getPalindrome(line);
                if (badW.contains(line)) {
                    line = "**";
                }
                writeToFile(dictionaryPath2, line, true);

                line = reader.readLine();
            }
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }

    }

    public static void writeToFile(String path, String content, Boolean ap) {

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(path, ap))) {
            writer.write(content + "\n");
        } catch (Exception e) {
            System.err.println(e.getMessage());
            e.printStackTrace();
        }
    }

    public static void readFile(String filename) {
        try (BufferedReader reader = new BufferedReader(new FileReader(filename))) {
            String line = reader.readLine();

            while (line != null) {
                System.out.println(line);
                line = reader.readLine();
            }
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
    }

    public static void readCheckLongest(String filename) {
        try (BufferedReader reader = new BufferedReader(new FileReader(filename))) {
            String line;
            String longest = "";

            while ((line = reader.readLine()) != null) {
                if (longest.length() < line.length()) {
                    longest = line;
                }
            }
            System.out.println("Longest name is:  " + longest);
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
    }

    public static void cleanFile(String filepath) {
        try (FileWriter wr = new FileWriter(filepath)) {
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
    }

    public static void getPalindrome(String w) {
        StringBuilder str = new StringBuilder(w);
        if (str.reverse().toString().equalsIgnoreCase(w)) {
            System.out.println("Palindrome found:  " + w);
        }
    }
}
