package src.com.kurs.lesson1a;

public class Main {

    public static void main(String[] args) {
        // Instrukcja warunkowa
        /*
         * = przypisanie
         * == równa sie
         * != nierówna się
         * >, >=, <, <= wieksze, wieksze badz rowne itd
         * && and (logiczne i, koniunkcja)
         * ||or (logiczne lub, alternatywa)
         * % - modulo, reszta z dzielenia
         */

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
        double liczba1=2.00;
        System.out.println(liczba1>0?"Dodatnia":liczba1==0?"zero":"ujemna");

        // Zadeklaruj 2 zmienne typu int, wyświetl która z tych dwóch liczb jest
        // większa i o ile, np dla 4 i 1 chcemy wyświetlić: 4 jest większe od 1 o 3
        int x1=1;
        int x2=4444;
        int roznica=0;
        System.out.println("-------");
        if(x1>x2){
           roznica=x1-x2;
            System.out.printf("%d jest wieksze od %d o %d",x1,x2,roznica);
        }else{
            roznica=x2-x1;
            System.out.printf("%d jest wieksze od %d o %d",x2,x1,roznica);
        }
        // Napisz program sprawdzajacy czy podana liczba jest parzysta
        int liczbax=3;
        System.out.println(liczbax%2==0?"Parzysta":"Nieparzysta");

        // Sprawdzmy czy zadeklarowana liczba typu double, nalezy do przedzialu (1,4)
        // czy moze [6,8], czy jest spoza przedzialu

        // Sprawdz czy srednia dwoch liczb typu double jest wieksza od 4

        // Sprawdz czy suma 3 liczb jest podzielna przez 3
        // Sprawdz czy dlugosc podanego Stringa jest wieksza od 5

        // Sprawdz czy pierwszy znak stringa to literka A

        // sprawdz czy string zawiera literke a

        // Pętle

        // Wypisz na konsoli liczby od 1 do 20
        // Wypisz na konsoli liczby od 20 do 1

        // Wypisz na konsoli liczby od 1 do 20 oddzielone przecinkiem

        // Za pomocą pętli while, wypisz liczby od 1 do 10, dla kazdej liczby powyzej 5
        // dodaj napis'duża liczba'

        // Napisz program liczacy sume liczb z zakresu od 1 do 100

        // Wypisz wszystkie liczby parzyste z zakresu 1-30

        // wszystkie liczby nieparzyste od -10 do 40.

        // Napisz program liczacy silnie, np 5! = 1*2*3*4*5

        // Napisac program, ktory liczy pole kwadratu dla boku n, który
        // przyjmuje wartosci od 1 do 10, uzyc petli while

        // Tablice
        // Zadeklaruj tablice intów pierwszym sposobem, przypisz do niej wartosci,
        // wypisz juej dlugosc i niektore elementy
        // zadeklaruj tablice intow i przypisz do niej 8 liczb
        // wyswietl cała tablice
        // wyswietl tylko liczby wieksze niz 4
        // policz sume elementów tablicy
        // znajdz element najwiekszy
        // znajdz element najmniejszy
        // zadeklaruj tablicę długosci 20 i przypisz do niej liczby od 1 do 20
        // wypiszmy te tablice odwrotnie, czyli od 20 do 1
        // wypiszmy liczby od 1 do 20 ale oddzielone przecinkiem
        // wypiszmy te liczby które sa parzyste z tej tablicy
        // Oblicz sume elementow tablicy doubli ale tylko tych ktore sa wieksze niz 3.8
        // oblicz sumę elementów ktore sa podzielne przez 3
        // Oblicz sume elementow ale tylko tych ktore stoja na nieparzystych indeksach

        // Zadeklaruj tablicę stringów. Wypisz z nich wszystkie te których ilość literek
        // a jest większa niż pozostałych literek.
        //
        // Przykład:
        // Input: arbuz, anka, aabc, anakonda, alaas, bacada, aabokaa
        // Output: aabc, alaas, aabokaa

        // Oblicz ile jest literek ‘a’ we wszystkich słowach, które znajdują się w
        // tablicy stringów.

    }
}
