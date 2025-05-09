package src.com.kurs.lessons;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        variables();
        // scaner();

    }

    public static void variables() {
        // wyswietl pare napisow na konsoli, wykorzystaj skrot na sout i justowanie kodu
        // wykorzystaj znaki specjalne
        // Zadeklaruj zmienne ktore poznalas i wypisz je na konsoli
        System.out.println("asdadasdad");
        System.out.println("asdadasdad  \"\" ");
        String str1 = "asdasda";
        int num = 98;
        System.out.printf("string: %s \nint: %d\n", str1, num);
        num = 1000;
        System.out.printf("string: %s \nint: %d\n", str1, num);

        double d1 = 2.5;
        // Przetestuj operatory +,-,\*,/ dla innych zmiennych np pomiedzy doublem i
        // Stringiem, Stringiem i booleanem, intem i doublem
        System.out.println(d1 + str1);
        Boolean t = true;
        // System.out.println(d1+t);
        System.out.println(num + d1);
        // Stwórz zmienna typu String. Wyswietl jej dlugosc (metoda length()->wygoogluj)
        String str = "asad";
        System.out.println(str.length());

        // Stwórz zmienna typu String i wyswietl jej pierwszy i trzeci znak (metoda
        // charAt() -> wygoogluj)
        String str2 = "asad";
        System.out.println(str2.charAt(0));
        System.out.println(str2.charAt(2));

        // Stwórz zmienna typu String i wyswietl tego stringa od 1 do 3 znaku (metoda
        // substring() -> wygoogluj)
        String str3 = "asad";
        System.out.println(str3.substring(0, 2));

        // Stwórz zmienna typu String i sprawdz czy zawiera ciag znakow "abc" (metoda
        // contains())
        String str4 = "asad";
        System.out.println(str4.contains("abc"));

        // Stwórz zmienne imie, nazwisko, adres, wiek i wypisz informacje które w nich
        // przechowujesz w jednym syso ale tak zeby kazda informacja byla w nowej
        // linijce
        String name = "Marcin";
        String lastName = "Nedza";
        int age = 20;
        System.out.printf("Name: %s \nlastname: %s\nage: %d", name, lastName, age);

        // Stwórz dwie zmienne typu int i w jednej linii wypisz ich sume, roznice,
        // iloczyn i iloraz, uzyj znakow specjalnych
        int a1 = 2;
        int b2 = 3;
        int sum1 = a1 + b2;
        System.out.printf("Suma: %d ", sum1);
        // Zalozmy ze masz String liczba = "10" i chcemy tego Stringa zamienic na inta
        // metoda parseInt() -> wygoogluj
        String liczba = "10";
        System.out.println(Integer.parseInt(liczba));
        // masz dwa stringi i chcesz je porównac, jak to zrobimy? co sie stanie jak
        // zrobimy str1 == str2? googlowanko

        String strin1 = "asd";
        String strin2 = "ash";
        System.out.println("========");
        System.out.println(strin1.equals(strin2));
        // masz dwa stringi i chcesz je porównac, jak to zrobimy? co sie stanie jak
        // zrobimy str1 == str2? googlowanko

        // String jest obiektem i trzeba zrobic deep equality, znaki == nie wiele dadzą
        // bo bedą porównywać
        // adresy w pamieci.

    }

    public static void scaner() {
        // Zadeklaruj dwie zmienne typu double (2.5, 2.2) i wykonaj działania za pomoca
        // operatorów: +, -, _, /
        // Stworzyc prosty kalkulator, zadeklaruj dwie zmienne typu double
        // Stworzyc mozliwosc wypisania na konsoli dzialan matematycznych +,-,_,/
        double d1 = 2.5;
        double d2 = 2.2;
        System.out.println();
        System.out.printf("%.1f + %.1f = %.1f", d1, d2, d1 + d2);
        System.out.println();

        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Operation: ");
            String op = sc.nextLine();
            switch (op) {
                case "+":
                    System.out.printf("\nSuma %.1f i %.1f wynosi = %.1f", d1, d2, d1 + d2);
                    break;

                case "-":
                    System.out.printf("\nRóżnica %.1f i %.1f wynosi = %.1f", d1, d2, d1 - d2);
                    break;

                case "/":
                    System.out.printf("\nIloraz %.1f i %.1f wynosi = %.1f", d1, d2, d1 / d2);
                    break;
                case "*":
                    System.out.printf("\nIloczyn %.1f i %.1f wynosi = %.1f", d1, d2, d1 * d2);
                    break;
                default:
                    System.out.println("Zly znak.");
                    break;
            }
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
    }
}
