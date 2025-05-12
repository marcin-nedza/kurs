package src.com.kurs.lessons;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class homework6 {
    public static void main(String[] args) {
        collections();
    }

    public static void collections() {
        // 1) Zadeklaruj ArrayListe intow, dodaj do niej 5 roznych liczb metoda add,
        // wyswietl cala liste petla for each.
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.forEach(n -> System.out.println(n));
        // 2) Stworz metode ktora zwroci sume liczb z ArrayListy z 1 zadania
        sum(list);
        // 3) Stworz metode ktora zwroci liste elementow wiekszych od 3
        getElementsGreaterThan(list);
        // 4) Zadeklaruj Liste Stringow, dodaj do niej kolekcje imion Tomek Ania Tomek
        // Krzys Grzes Tomek metoda addAll, nastepnie usun wszystkich Tomkow z tej listy
        List<String> names = new ArrayList<>();
        names.addAll(List.of("Tomek", "Ania", "Krzys", "Grzes", "Tomek"));
        names.removeIf(n -> n.equals("Tomek"));
        // 5) Napisz metode do zadania 4, ktora zwroci najdluzsze imie
        System.out.println(longestNamae(names));
        // 6) Napisz metode do zadani 4 ktora sprawdza czy podane imie znajduje sie w
        // kolekcji
        System.out.println(checkForName(names, "IAsda"));
        // 7) Zadeklaruj Liste zmiennych typu double, dodaj do listy 5 liczb rzeczywiste
        // i wypisz je w kolejnosci rosnacej
        List<Double> doubles = new ArrayList<>();
        doubles.add(4.5);
        doubles.add(1.2);
        doubles.add(3.8);
        doubles.add(2.0);
        doubles.add(9.3);
        doubles.stream().sorted().forEach(System.out::println);
        // Napisz metode ktora uzupelnia losowa iloscia (od 2-8) liczb losowych z
        // przedziaku 1-10,
        // wrzucmy te liczby do nowej listy posortujmy ja odwrotnie i zwracamy ta liste
        System.out.println(randomSorted());
        // Napisz metode ktora jako parametr przyjmuje liste intow i zwraca wszystkie
        // liczby parzyste z tej listy
        System.out.println(getEvenNumbers(list));

        // Wyswietl wszystkie imiona męskie które znajduja sie w liscie

        // ------Niewiem o ktore imiona chodzi

        // Wyswietl ile razy było podane imie podane jako parametr

        // Napisz metode ktora jako parametr przyjmuje Liste Stringow oraz znak. Zwroc
        // liste zawierajaca wszystkie
        // Stringi ktore zawieraja podana znak
        // Lista: Ania Kasia Grzegorz Tomek Magda a znak to a, to lista zwracana powinna
        // zawierac Ania Kasia Magda
        List<String> list2 = new ArrayList<>(List.of("Ania", "Kasia", "Grzegorz", "Ania"));
        System.out.println(contains(list2, "a"));
        // Napisz metode ktora jako parametr przyjmuje 2 Listy Stringow i zwraca liste
        // elementów wspolnych, ktore sa na obu listach

        List<String> list3 = new ArrayList<>(List.of("Ania", "HASdasda", "kdsjdkjfks"));
        System.out.println(commonElements(list2, list3));
        // Napisz metode ktora dla listy intów zwroci roznice pomiedzy jej najwiekszym a
        // najmniejszym elementem
        System.out.println(differenceMaxMin(list));
        // Napisz metode ktora przyjmuje liste Stringow i zwraca listę (intow) indeksow
        // wszystkich elementow na liscie, ktore sa takie same jak parametr metody
        // np dla Listy Ania Krzys Ania Piotr Tomek Ania i imienia Ania
        // output: to 0,2,5
        findAllIndexes(list3, "Ania");

        // Napisz metode ktora odwraca kolejnosc liczb w liscie ktora jest podana jako
        // parametr
        // metoda ma odwrocic liste, nie ma nic zwracac, nie mozna wykorzystywac innych
        // list/tablic
        // nie mozna uzywac nic z Collections
        reverseList(list);

        // majac liste intow zwróc liste intow tych ktore te ktore koncza sie na cyfre
        // podana jako porametr
        filterNumbersByLastDigit(list, 2);
        // Wyświetl ile razy ktorekolwiek imie zostało powtórzone Np dla imion ania
        // piotr ania tomek krzys tomek ania program
        // powinien wypisac 3, bo byly 3 potworki
        nameOccurances(list2);
        // Wyswietl ile razy we wszystkich imionach była użyta samogłoska

        // Napisz metodę która wyswietli unikalne imiona

        // Zwroc liste imion które sa dluzsze niz 5 znakow o parzystej dlugosci

        // Zwroc liczbe słow ktore sa zlozone z samych whitespaców np spacji

        // Napisz metode ktora przyjmuje jako parametr liste Stringow oraz liste intow
        // (tej samej dlugosci obie listy)

        // Metoda ma zwrocic liste Stringow z pirwszej listy ktorych dlugosc odpowiada
        // liczbom na 2 liscie
        // Ania Krzys Tomek Kasia Jan
        // 4 2 5 8 3
        // Ania Tomek Jan

        // napisz metode ktora przyjmuje liste stringow i stringa, jej zadaniem jest
        // usunicie z listy wszystkich stringow takich jak podany parametr
        // UWAGA: nie wolno uzywac z metody removeall, nalezy przeiterowac po liscie i
        // po kolei usuwac elementy

        // napisz metode ktora przyjmuje liste intow i zwraca z niej wszystkie liczby
        // pierwsze
        // Napisz metode ktora przyjmuje jako parametr liste tablic Stringow i oblicza
        // sume dlugosci wszystkich Stringów

        // Napisz metodę która przyjmuje jako parametr listę stringów. Jej zadaniem jest
        // zapisanie do pliku każdego stringa który zaczyna się od samogłoski
    }

    public static int sum(List<Integer> l) {
        return l.stream().mapToInt(Integer::intValue).sum();
    }

    public static List<Integer> getElementsGreaterThan(List<Integer> l) {
        return l.stream().filter(n -> n > 3).collect(Collectors.toList());
    }

    public static String longestNamae(List<String> l) {
        String longest = "";
        for (String name : l) {
            if (name.length() > longest.length()) {
                longest = name;
            }
        }
        return longest;
    }

    public static boolean checkForName(List<String> l, String name) {
        return l.contains(name);
    }

    public static List<Integer> randomSorted() {
        int count = (int) (Math.random() * 7) + 2;
        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < count; i++) {
            int number = (int) (Math.random() * 10) + 1;
            result.add(number);
        }
        return result.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
    }

    public static List<Integer> getEvenNumbers(List<Integer> l) {
        return l.stream().filter(n -> n % 2 == 0).collect(Collectors.toList());
    }

    public static List<String> contains(List<String> l, String c) {
        return l.stream().filter(n -> n.contains(c)).collect(Collectors.toList());
    }

    public static List<String> commonElements(List<String> L1, List<String> L2) {
        return L1.stream().filter(n -> L2.contains(n)).collect(Collectors.toList());
    }

    public static int differenceMaxMin(List<Integer> list) {
        int min = list.stream().mapToInt(Integer::intValue).min().getAsInt();
        int max = list.stream().mapToInt(Integer::intValue).max().getAsInt();
        if (list == null || list.isEmpty())
            return 0;
        return max - min;
    }

    public static List<Integer> findAllIndexes(List<String> list, String target) {
        List<Integer> indexes = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).equals(target)) {
                indexes.add(i);
            }
        }
        return indexes;
    }

    public static List<Integer> reverseList(List<Integer> list) {
        return list.stream().sorted(Comparator.reverseOrder()).toList();
    }

    public static List<Integer> filterNumbersByLastDigit(List<Integer> list, int digit) {
        return list.stream()
                .filter(n -> n % 10 == digit)
                .collect(Collectors.toList());
    }

    public static void nameOccurances(List<String> l) {
        Map<String, Long> nCount = l.stream().collect(Collectors.groupingBy(n -> n, Collectors.counting()));
        nCount.forEach((name, count) -> System.out.printf("\n %s appeared %d times", name, count));
    }
}
