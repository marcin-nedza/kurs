package src.com.kurs.lessons;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class homework2 {
    public static void main(String[] args) {
        // getConditionals();
        // getLoops();
        getTables();
    }

    private static void getConditionals() {
        // Zrób intstrukcje switch case, dla wartosci String
        // niech bedzie to reprezentacja miesiecy i w zaleznosci od
        // podanego miesiaca podac klimat
        int a = 5;
        switch (a) {
            case 1 -> System.out.println("Pała");
            case 2 -> System.out.println("Zdałes ledwo");
            case 3 -> System.out.println("ASdask2j3");
            case 4 -> System.out.println("Zima");
            case 5 -> System.out.println("HUra");
            default -> System.out.println("Default");
        }
        if (a == 1) {
            System.out.println("1");
        } else if (a == 2) {
            System.out.println("2");
        } else if (a == 3) {
            System.out.println("3");
        } else if (a == 4) {
            System.out.println("4");
        } else if (a == 5) {
            System.out.println("5");
        } else {
            System.out.println("Default");
        }
        // Sprawdz czy podana liczba typu double jest dodatnia, czy jest rowna 0, czy
        // jest ujemna
        double liczba1 = 2.00;
        System.out.println(liczba1 > 0 ? "Dodatnia" : liczba1 == 0 ? "zero" : "ujemna");

        // Zadeklaruj 2 zmienne typu int, wyświetl która z tych dwóch liczb jest
        // większa i o ile, np dla 4 i 1 chcemy wyświetlić: 4 jest większe od 1 o 3
        int x1 = 1;
        int x2 = 4444;
        int roznica = 0;
        System.out.println("-------");
        if (x1 > x2) {
            roznica = x1 - x2;
            System.out.printf("%d jest wieksze od %d o %d", x1, x2, roznica);
        } else {
            roznica = x2 - x1;
            System.out.printf("%d jest wieksze od %d o %d", x2, x1, roznica);
        }
        // Napisz program sprawdzajacy czy podana liczba jest parzysta
        int liczbax = 3;
        System.out.println();
        System.out.println(liczbax % 2 == 0 ? "Parzysta" : "Nieparzysta");
        // Sprawdzmy czy zadeklarowana liczba typu double, nalezy do przedzialu (1,4)
        // czy moze [6,8], czy jest spoza przedzialu
        double d1 = 2.4;
        if (d1 > 1 && d1 < 4) {
            System.out.printf("\nNumber %.1f is in (1,4) range", d1);
        } else if (d1 >= 6 && d1 <= 8) {

            System.out.printf("\nNumber %.1f is in [3,8] range", d1);
        } else {
            System.out.printf("\nNumber %.1f is out of range", d1);
        }

        // Sprawdz czy srednia dwoch liczb typu double jest wieksza od 4
        double d2 = 10.4;
        if ((d1 + d2) / 2 > 4) {
            System.out.printf("\nAverage of number %.1f and number %.1f is greater than 4", d1, d2);
        }

        // Sprawdz czy suma 3 liczb jest podzielna przez 3
        int n1 = 1;
        int n2 = 2;
        int n3 = 3;
        if ((n1 + n2 + n3) % 3 == 0) {
            System.out.println("It is divisible by 3");
        }
        // Sprawdz czy dlugosc podanego Stringa jest wieksza od 5
        String s = "j9hjafha";
        if (s.length() > 5) {
            System.out.println("String lenght is greate than 5");
        }

        // Sprawdz czy pierwszy znak stringa to literka A
        if (s.charAt(0) == 'A') {
            System.out.println("String starts with an \"A\"");
        }

        // sprawdz czy string zawiera literke a
        if (s.contains("a")) {
            System.out.println("String contains letter \"a\"");
        }
    }

    public static void getLoops() {

        // Wypisz na konsoli liczby od 1 do 20
        System.out.println("------");
        for (int i = 1; i <= 20; i++) {
            System.out.println(i);
        }
        System.out.println("------");
        // Wypisz na konsoli liczby od 1 do 20 oddzielone przecinkiem
        for (int i = 20; i >= 1; i--) {
            System.out.println(i);
        }

        // Za pomocą pętli while, wypisz liczby od 1 do 10, dla kazdej liczby powyzej 5
        // dodaj napis'duża liczba'
        System.out.println("------");
        int it = 1;
        while (it <= 10) {
            if (it > 5) {
                System.out.println(it + " duża liczba");
            } else {
                System.out.println(it);
            }
            it++;
        }

        // Napisz program liczacy sume liczb z zakresu od 1 do 100
        int sum = 0;
        for (int i = 1; i <= 100; i++) {
            sum += i;
        }
        System.out.println(sum);

        // Wypisz wszystkie liczby parzyste z zakresu 1-30
        for (int i = 1; i <= 30; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }

        }

        // wszystkie liczby nieparzyste od -10 do 40.
        for (int i = -10; i <= 40; i++) {
            if (i % 2 != 0) {
                System.out.println(i);
            }

        }
        sum = 1;
        // Napisz program liczacy silnie, np 5! = 1*2*3*4*5
        for (int i = 1; i <= 5; i++) {
            sum *= i;

        }
        System.out.println(sum);

        // Napisac program, ktory liczy pole kwadratu dla boku n, który
        // przyjmuje wartosci od 1 do 10, uzyc petli while
        int bok = 2;
        while (bok >= 1 && bok <= 10) {
            System.out.printf("\nRectangle area is: %d", bok * bok);
            break;
        }
    }

    public static void getTables() {
        // Zadeklaruj tablice intów pierwszym sposobem, przypisz do niej wartosci,
        int[] n = { 1, 2, 3, 4 };
        // wypisz juej dlugosc i niektore elementy
        System.out.println(n.length);
        System.out.println(n[2]);
        // zadeklaruj tablice intow i przypisz do niej 8 liczb
        List<Integer> n2 = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8));
        // wyswietl cała tablice
        System.out.println(n2);
        // albo petla for po kazdym elemencie
        // wyswietl tylko liczby wieksze niz 4
        n2.forEach(el -> {
            if (el > 4) {
                System.out.println(el);
            }
        });
        // policz sume elementów tablicy
        int sumTable = n2.stream().reduce(0, (a, b) -> a + b);
        System.out.println(sumTable);
        // znajdz element najwiekszy
        int[] max = { n2.get(0) };

        n2.forEach(el -> {
            if (el > max[0]) {
                max[0] = el;
            }
        });
        System.out.println(max[0]);

        // znajdz element najmniejszy
        int[] min = { n2.get(0) };

        n2.forEach(el -> {
            if (el <= min[0]) {
                min[0] = el;
            }
        });
        System.out.println(min[0]);
        // zadeklaruj tablicę długosci 20 i przypisz do niej liczby od 1 do 20
        int[] tbl = new int[20];
        for (int i = 0; i < tbl.length; i++) {
            tbl[i] = i + 1;
        }
        System.out.println(Arrays.toString(tbl));
        // wypiszmy te tablice odwrotnie, czyli od 20 do 1
        for (int i = 0; i < tbl.length; i++) {
            tbl[i] = Math.abs(i - 20);
        }
        System.out.println(Arrays.toString(tbl));
        // wypiszmy liczby od 1 do 20 ale oddzielone przecinkiem
        String st = Arrays.stream(tbl).mapToObj(String::valueOf).collect(Collectors.joining(","));
        System.out.println(st);

        // wypiszmy te liczby które sa parzyste z tej tablicy
        String st2 = Arrays.stream(tbl).filter(el -> el%2==0).mapToObj(String::valueOf).collect(Collectors.joining(" "));
        System.out.println(st2);
        // Oblicz sume elementow tablicy doubli ale tylko tych ktore sa wieksze niz 3.8
        List<Double> tblDouble=new ArrayList<>();
        for (int i = 0; i < 20; i++) {
           tblDouble.add(Math.random()*10) ;
        }
        double sumDouble=tblDouble.stream().filter(el->el>3.8).mapToDouble(Double::doubleValue).sum();
        System.out.println(sumDouble);
        // oblicz sumę elementów ktore sa podzielne przez 3
        
        //rzadko kiedy bedzie jakis podzielny przez 3 jak mamy double

        // Oblicz sume elementow ale tylko tych ktore stoja na nieparzystych indeksach
        // Zadeklaruj tablicę stringów. Wypisz z nich wszystkie te których ilość literek
        // a jest większa niż pozostałych literek.

        // Przykład:
        // Input: arbuz, anka, aabc, anakonda, alaas, bacada, aabokaa
        // Output: aabc, alaas, aabokaa

        // Oblicz ile jest literek ‘a’ we wszystkich słowach, które znajdują się w
        // tablicy stringów.

        // Tablice dwuwymiarowe
        // Zadeklaruj tablice dwuwymiarowa 4x6 typu String. Przypisz do niej kilka
        // elementów,
        // wypisz jej liczbe wierszy i liczbę kolumn, wypisz jakis przykladowy wyraz
        // Wypisz cała macierz

        // Zadeklaruj macierz 6x6 i wypełnij ja liczbami od 10 w gore
        // policzyc sume wszystkich elementow w macierzy

        // wypisac powyzsza macierz w odwrotnej kolejnosci

        // wypisz z powyzszej macierzy przekatna od lewej górnej do prawej dolnej

        /*
         * Stwórzmy macierz 4x4 i wpiszmy do niej liczby podzielne przez 3 zaczynajac od
         * 10.
         * Wszystkie liczby niepodzielne przez 4 zastąp -1, wypisz cala macierz
         */

        // zadeklaruj macierz o wymiarach 5x8, wypelnij ja liczbami losowymi z zakresu
        // 10-90, znajdz najwieksza i najmniejsza wartosc oraz srednia arytmetyczna
        // sprawdz czy wiecej jest liczb mniejszych od 50 czy wiekszych badz rownych 50
    }
}
