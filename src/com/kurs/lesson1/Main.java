package src.com.kurs.lesson1;

public class Main {
    public static void main(String[] args) {

        // syso + ctrl + spacja
        // println przechodzi do kolejnego wiersza
        System.out.println("Hello world!"); // ctrl + d duplikowanie kodu
        System.out.println("Hello world!");
        System.out.println("Hello world!");

        // print nie przechodzi do kolejnego wiersza
        System.out.print("Hello world!"); // bla bla bla
        System.out.print("Hello world!");
        System.out.print("Hello world!");
        System.out.println();

        // znak specjalny \n przechodzi do kolejnego wiersza
        System.out.println("A\nB\nC");
        System.out.println();
        // to jest komentarz wierszowy

        /*
         * komentarz blokowy bla bla bla
         */

        //wykorzystaj znaki specjalne
        //wyswietl pare napisow na konsoli, wykorzystaj skrot na sout i justowanie kodu

        // Zmienne
        // typZmiennej nazwaZmiennej = wartosc ;

        // int - liczba calkowita w przedziale od -2 147 483 648 do 2 147 483 647
        int integer = 5;
        System.out.println(integer);

        integer = 4;
        System.out.println(integer);

        // long - liczba calkowita w przedziale od -9,223,372,036,854,775,808 to +9,223,372,036,854,775,807
        long longg = 5555555555L; // na koncu longa powinnismy dopisywac L, aby kompilator wiedzial, ze to nie integer
        System.out.println(longg);

        // double - liczba rzeczywista z  dokladnoscia do 15 liczb po przecinku
        double realNumber = 3.14;
        System.out.println(realNumber);

        realNumber = 3.5;
        System.out.println(realNumber);

        // float - liczba rzeczywista z dokladnoscia 7 liczb po przecinku
        float pi = 3.141f;
        System.out.println(pi);

        // char - pojedynczy znak
        char character = 'a';
        System.out.println(character);

        System.out.println(8/5); //Tutaj dzielimy dwie liczby calkowite, wiec wynik jest rowniez liczba calkowita
        System.out.println(8.0/5); //Tutaj wynik to double

        // Autojustowanie kodu ctrl+alt+L

        // String - literał łańcuchowy - po prostu tekst, jakiś napis

        String txt = "Jane has a cat";
        System.out.println(txt);

        // Zadeklaruj zmienne ktore poznalas i wypisz je na konsoli
        // nastepnie przypisz do niej inna wartosc i znowu ja wypisz na konsoli

        String txt2 = "Matt has BMW";
        System.out.println(txt2);

        // to nie jest deklaracja nowej zmiennej, to nadpisanie nowej wartosci do
        // istniejacej zmiennej
        txt2 = "Matt sold BMW";
        System.out.println(txt2);

        // zmienna typu boolean, true/false
        boolean bool = false;
        System.out.println(bool);

        bool = true;
        System.out.println(bool);

        // Zadeklaruj dwie zmienne typu double i wykonaj działania za pomoca operatorów: +, -, *, /

        int a = 10, b = 5; // to to samo co bysmy napisali int a=10; int b=5;

        //Tutaj chcemy żeby wydrkukowało nam "Suma liczb X i Y to Z"
        System.out.println("The sum of " + a + " and " + b + " is " + (a + b)); // przy dwóch intach operator + działa jako zwykle matematyczne dodawanie
        System.out.println("The sum of " + a + " and " + b + " is " + a + b); // tutaj a + b zostalo potraktowane jako ciag znakow
        System.out.println(a - b);
        System.out.println(a * b);
        System.out.println(a / b);

        // Zadeklaruj zmienna typu int i String i wykonaj na nich dzialania +,-,*,/

        int m = 11, n = 5;
        String txt3 = "TXT";

        System.out.println(m + txt3); // operator + tylko dziala jak sklejanie Stringow

        //		System.out.println(m-txt);  tu beda bledy ze wzgledu na to ze nie mozemy robic dzialan
        //		System.out.println(m*txt);  matematycznych na np Stringu i incie
        //		System.out.println(m/txt);

        System.out.println("LSLALLA");
        System.out.println(n + m + txt3);
        System.out.println(txt3 + n + m);
        System.out.println(txt3 + (n + m));

        //Zadanie 1 - dokonczyc to co zaczelismy z intami i sumowaniem


        // Stworzyć prosty kalkulator, zadeklaruj dwie zmienne typu double
        // Stworzyć możliwość wypisania na konsoli działań matematycznych +,-,*,/

        // double x=4, y=5;
        // double suma=x+y; syso(suma)
        // -> Suma 4 i 8 wynosi 12
        // -> Różnica 4 i 8 wynosi -4


        double x = 4;
        double y = 8;

        double sum = x + y;
        double difference = x - y;
        double multiplication = x * y;
        double division = x / y;

        System.out.println("The sum of " + x + " and " + y + " is " + sum);
        System.out.println("The difference of " + x + " and " + y + " is " + difference);
        System.out.println("The product of " + x + " and " + y + " is " + multiplication);
        System.out.println("The quotient of " + x + " and " + y + " is " + division);

        // Przetestować operatory +,-,*,/ dla innych zmiennych
        // np pomiedzy doublem i Stringiem, Stringiem i booleanem, intem i doublem
        // i intem i booleanem

        /*
         * Stwórz zmienna typu String. Wyswietl jej dlugosc (metoda length()->wygoogluj)
         *
         * Stwórz zmienne imie, nazwisko, adres, wiek i wypisz informacje które w nich
         * przechowujesz w jednym sout ale tak zeby kazda informacja byla w nowej
         * linijce
         *
         * Stwórz dwie zmienne typu int i w jednej linii wypisz ich sume, roznice,
         * iloczyn i iloraz, uzyj znakow specjalnych
         */

        //Stwórz zmienna typu String. Wyswietl jej dlugosc (metoda length()->wygoogluj)
        String str="asad";
        System.out.println(str.length());

        //Stwórz zmienna typu String i wyswietl jej pierwszy i trzeci znak (metoda charAt() -> wygoogluj)
        String str2="asad";
        System.out.println(str2.charAt(0));
        System.out.println(str2.charAt(2));

        //Stwórz zmienna typu String i wyswietl tego stringa od 1 do 3 znaku (metoda substring() -> wygoogluj)
        String str3="asad";
        System.out.println(str3.substring(0,2));

        //Stwórz zmienna typu String i sprawdz czy zawiera ciag znakow "abc" (metoda contains())
        String str4="asad";
        System.out.println(str4.contains("abc"));

        //Stwórz zmienne imie, nazwisko, adres, wiek i wypisz informacje które w nich
        //przechowujesz w jednym syso ale tak zeby kazda informacja byla w nowej linijce
        String name="Marcin";
        String lastName="Nedza";
        int age=20;
        System.out.printf("Name: %s \nlastname: %s\nage: %d",name,lastName,age);

        //Stwórz dwie zmienne typu int i w jednej linii wypisz ich sume, roznice,
        //iloczyn i iloraz, uzyj znakow specjalnych
        int a1=2;
        int b2=3;
        int sum1=a1+b2;
        System.out.printf("Suma: %d ",sum1);
        //Zalozmy ze masz String liczba = "10" i chcemy tego Stringa zamienic na inta metoda parseInt() -> wygoogluj
        String liczba="10";
        System.out.println(Integer.parseInt(liczba));
        //masz dwa stringi i chcesz je porównac, jak to zrobimy? co sie stanie jak zrobimy str1 == str2? googlowanko

        String strin1="asd";
        String strin2="ash";
        System.out.println("========");
        System.out.println(strin1.equals(strin2));


        System.out.println(Math.round(Math.PI));

        // Poniższa operacja będzie traktowana jako mnożenie znaku 'A' przez liczbę 5.
        // Wartość znaku 'A' w Unicode wynosi 65, więc wyrażenie to zostanie obliczone jako 65 * 5.
        System.out.println('A' * 5);

        int i = 5;
        System.out.println(i);

        //zwiekszenie liczby o 2
        i = i + 2;
        System.out.println(i);

        //to to samo co linijke wyzej, ale LADNIEJ
        i += 3;
        System.out.println(i);

        //zwiekszenie liczby o 1
        i++;
        System.out.println(i);

        //zmniejszenie liczby o 1
        i--;
        System.out.println(i);

        //Przetestuj powyzsze dzialania np z * i /

    }
}
