package src.com.kurs.lessons;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.swing.JOptionPane;

public class homework7 {
    public static Map<Integer, String> map = new HashMap<>();
    private static int counter = 0;

    public static void main(String[] args) {

        addToMap("asd");
        addToMap("asd");
        addToMap("asd");
        addToMap("asd");
        String[] words = { "asd", "323", "323", "323" };
        addManyToMap(words);
        lottery();

        Map<Integer, String> testMap = new HashMap<>();
        testMap.putAll(Map.of(1, "asd", 2, "jfdjfd", 3, "99v9d", 4, "ooogf"));
        changeMap(testMap);
        System.out.println(testMap.toString());
        // dictionary();

        Map<String, List<String>> students = new HashMap<>();
        students.put("1a", Arrays.asList("Marcin", "Dobromir"));
        students.put("1b", Arrays.asList("Ana", "Kasia"));
        students.put("2a", Arrays.asList("Sprycigniew", "Cep"));
        getLongestInClass(students);
        getTheLongest(students);
    }
    // Mapy
    // w tych dwoch metodach jedno wywolanie metody dodaje jedo slowo do mapy

    // Napisz metoda która dodaje słowa do mapy. Kluczem maja byc kolejen liczby
    // naturalne zaczynajac od 0
    public static void addToMap(String w) {
        map.put(counter++, w);
    }

    // Napisz metode ktora pozwala dodawac do mapy kolejne wyrazy. Na koncu ma
    // wyswietlic ile razy jaki element byl dodany
    public static void addManyToMap(String[] words) {
        Map<String, Integer> count = new HashMap<>();

        for (String w : words) {
            addToMap(w);
            count.put(w, count.getOrDefault(w, 0) + 1);
        }
        System.out.println(count);
    }

    // Napisz program, ktory losuje liczby w duzym lotku bez powtorzen, zakres liczb
    // 1-45
    public static void lottery() {
        List<Integer> numbers = new ArrayList<>();
        for (int i = 1; i <= 45; i++) {
            numbers.add(i);
        }
        Collections.shuffle(numbers);

        List<Integer> draw = numbers.subList(0, 6);
        System.out.println(draw.toString());

    }

    // napisz metode ktora przyjmuje Mape<Integer, String>, zamien wartosci ktorych
    // klucze sa parzystych wartosci
    // na słowo "parzyste"
    public static void changeMap(Map<Integer, String> map) {
        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            if (entry.getKey() % 2 == 0) {
                entry.setValue("Parzyste");
            }
        }
    }

    // Napisz program, ktory symuluje dzialanie slownika
    // polsko-angielskiego. Przykładowy program: Podaj slowko po Polsku: mama Slowko
    // po Angielsku to mother. Program dziala dopoki uzytkownik nie zrezygnuje
    // (cancel)
    public static void dictionary() {
        Map<String, String> dict = new HashMap<>();
        dict.put("mama", "mother");
        dict.put("tata", "father");
        dict.put("kot", "cat");
        dict.put("pies", "dog");

        while (true) {
            String word = JOptionPane.showInputDialog(null, "Podaje slowko po Polsku: ");
            if (word == null || word.isEmpty()) {
                break;
            }
            if (dict.containsKey(word)) {
                JOptionPane.showMessageDialog(null, word + " slowo po Angielsku to " + dict.get(word));
            }
        }
    }

    // W systemie przechowujemy nazwe klasy (szkolnej, np 1a, 2b) oraz listę osób
    // (same nazwiska jako Stringi) które uczeszczaja do klasy.
    // 1) Napisz metode ktora zwraca liste osob o najdluzszych nazwiskach z kazdej
    // klasy

    public static Map<String, String> getLongestInClass(Map<String, List<String>> m) {
        Map<String, String> res = new HashMap<>();

        for (Map.Entry<String, List<String>> entry : m.entrySet()) {
            String clname = entry.getKey();
            List<String> studs = entry.getValue();
            String longest = "";
            for (String a : studs) {
                if (a.length() > longest.length()) {
                    longest = a;
                }
            }

            res.put(clname, longest);
        }
        return res;
    }

    
    // 2) Napisz metode która zwraca osobe o najdluzszym nazwisku ze wzystkich klas
    public static void getTheLongest(Map<String, List<String>> m) {
        String longest = "";
        for (List<String> studs : m.values()) {
            for (String s : studs) {
                if (s.length() > longest.length()) {
                    longest = s;
                }
            }
        }
        System.out.println(longest);
    }
}
