package src.com.kurs.lessons;

import java.util.Arrays;
import java.util.Random;

public class homework5 {
    public static void main(String[] args) {
        // method1("asda");
        // method2(1, 2);
        // method3(1, 23, 3);
        // method4("asda");
        // method5("asda", "djf");
        // method6(2.00, 1.23);
        // method7(2);
        // method8(2, 3);
        // method9("zazy");
        // method10("xbadxxx");
        // method11("asa", 'a');
        // method12(2);
        // method13(21);
        // method14(22);
        // method15(2, 1);
        // method16(16);
        // method17(16);
        // method18("asd", 2);
        tableMethod1(new int[] { 2, 3, 5 });
        System.out.println(tableMethod2(new int[] { 2, 4, 5 }));
        System.out.println(Arrays.toString(tableMethod7(new int[] { 2, 3, 4, 5, 6 })));
        System.out.println(tableMethod14(new int[] { 1, 2, 2, 1 }));
    }

    // Napisz metode, ktora dodaje do Stringa podanego jako parametr napis "dzien
    // dobry"
    public static String method1(String txt) {
        return txt + " dzien dobry";
    }

    // Stworz metode ktora liczy sume dwoch liczb ktore sa podane jako parametr
    public static int method2(int a, int b) {
        return a + b;
    }

    // Napisz metode ktora jako argument (parametr) przyjmuje
    // 3 zmienne typu int i liczy sume pierwszej i drugiej i mnozy przez trzecia
    public static int method3(int a, int b, int c) {
        return (a + b) * c;
    }
    // Stwórz metode ktora zwraca dlugosc Stringa podanego jako parametr

    public static int method4(String a) {
        return a.length();
    }

    // Stworz metode ktora zwraca dłuższy z dwoch podanych jako parametr Stringow
    public static String method5(String a, String b) {
        return a.length() > b.length() ? a : b;
    }

    // Stworz metode ktora zwraca wieksza z dwoch podanych liczb typu double jako
    // parametr gdy liczby są równe zwracamy 0

    public static double method6(double a, double b) {
        return a == b ? 0 : a > b ? a : b;
    }

    // Napisz metode ktora przyjmuje jako argument liczbe i sprawdza czy jest to
    // liczba parzysta
    public static boolean method7(int a) {
        return a % 2 == 0;
    }
    // Napisz metode ktora zwraca sume dwoch liczb ale z uwaga ze jesli ktoras z
    // podanych liczb jest z przedzialu [13,19]
    // to zwrocona wartosc to zawsze 19

    public static int method8(int a, int b) {
        if ((a >= 13 && a <= 19) || (b >= 13 && b <= 19)) {
            return 19;
        }
        return a + b;
    }
    // Napisz metode ktora przyjmuje jako parametr Stringa, jesli String zaczyna sie
    // na z zwroc napis zzz, jesli konczy sie na y zwroc napis yyy
    // jesli zaczyna sie na z i konczy na y zwroc zzyy, w kazdym innym przypadku
    // zwroc stringa niezmienionego
    // metoda startsWith() i endsWith() <- sprawdzenie czy string konczy/zaczyna sie
    // na dany literał łancuchowy

    public static String method9(String a) {

        if (a.endsWith("y") && a.startsWith("z")) {
            return "zzyy";
        }

        if (a.startsWith("z")) {
            return "zzz";
        }

        if (a.endsWith("y")) {
            return "yyy";
        }

        return a;
    }
    // zddy -> zzyy
    // zasd -> zzz
    // asdy -> yyy
    // pusty string -> pusty string
    // z -> zzz
    // y -> yyy
    // zy -> zzyy
    // a -> a
    // bb -> bb

    // Sprawdz czy podany String jako parametr zaczynajac od 0 lub 1 indeksu ma w
    // sobie slowo bad
    // xbadxxx - true
    // badxxx - true
    // xxbadxx - false

    public static boolean method10(String a) {
        String s = a.trim().substring(0, 3);
        String s2 = a.trim().substring(1, 4);
        System.out.println(s);
        System.out.println(s2);
        if (s.equals("bad") || s2.equals("bad")) {
            return true;
        }
        return false;
    }

    // Napisz metode ktora liczy ile razy podany znak wystepuje w podanym Stringu.
    public static int method11(String a, char b) {
        int sum = (int) Arrays.asList(a.split("")).stream().filter(c -> c.equals(String.valueOf(b))).count();
        return sum;
    }

    // Napisz metodę obliczająca silnię z podanej liczby
    public static int method12(int a) {
        int result = 1;
        for (int i = 2; i <= a; i++) {
            result *= i;
        }
        return result;
    }

    // napisz metoda ktora sprawdza czy podana liczba dwucyfrowa ma wieksza cyfre
    // jednosci od cyfry dziesiatek
    public static boolean method13(int a) {
        if (a < 10 || a > 99)
            return false;
        int tens = a / 10;
        int ones = a % 10;
        return ones > tens;
    }

    // Napisz funkcję, która wyznacza sumę cyfr podanej liczby całkowitej.
    public static int method14(int a) {
        int sum = 0;
        a = Math.abs(a);
        while (a > 0) {
            sum += a % 10;
            a /= 10;
        }
        return sum;
    }

    // Napisz metode ktora jako argument przyjmuje dwie liczby i liczy ich potegi,
    // dla argumentow 3^4 ma obliczyc 3*3*3*3 = 81
    // uwzglednic ze a^0 = 1
    // uwzglednic ze a^-b = 1/(a^b)
    public static double method15(double a, int b) {
        if (b == 0)
            return 1;
        double result = 1;
        for (int i = 0; i < Math.abs(b); i++) {
            result *= a;
        }
        return b < 0 ? 1 / result : result;
    }

    // Napisz funkcje, ktora stwierdza, czy zadana jako parametr liczba calkowita
    // jest kwadratem
    // pewnej liczby calkowitej. Liczby bedace kwadratami liczb calkowitych to 1, 4,
    // 9, 16 itd.
    // Wartosci funkcji ma byc prawda, jesli liczba spelnia warunek oraz falsz w
    // przeciwnym wypadku. Math.sqrt(x) zwraca pierwiastek z x
    // sqrt(16) = 4 czyli ok bo liczba całkowita
    // sqrt(17) - 4.2 czyli nie ok bo liczba niecałkowita 🙂
    public static boolean method16(int a) {
        if (a < 0)
            return false;
        double sqrt = Math.sqrt(a);
        return sqrt == (int) sqrt;
    }

    // Wypisz dzielniki liczby naturalnej podanej jako parametr
    // np dla 16 wynik to 1,2,4,8,16
    public static void method17(int a) {
        for (int i = 1; i <= a; i++) {
            if (a % i == 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }

    // Napisz metodę przyjmująca stringa i inta. Sprawdź czy podany int jest
    // dzielnikiem liczby odpowiadającej długości stringa.
    public static boolean method18(String s, int d) {
        if (d == 0)
            return false;
        return s.length() % d == 0;
    }

    // napisz metode która sprawdza czy w tablicy intów roznica kazdej kolejnej pary
    // liczb jest wieksza od poprzedniej
    // czyli np 1,3,6,10 true bo roznice to 2,3,4
    // 1,3,6,9 false bo roznice to 2,3,3
    public static boolean tableMethod1(int[] arr) {
        if (arr.length < 3)
            return true;
        int prevDiff = arr[1] - arr[0];
        for (int i = 1; i < arr.length - 1; i++) {
            int diff = arr[i + 1] - arr[i];
            if (diff <= prevDiff) {
                return false;
            }
            prevDiff = diff;
        }
        return true;
    }

    // Napisz metode ktora za swoj parametr przyjmuje tablice intow a nastepnie
    // zwraca sume wszystkich liczb ktore sa umieszczone w tej tablicy.
    public static int tableMethod2(int[] arr) {
        return Arrays.stream(arr).sum();
        // int sum = 0;
        // for (int n : arr) {
        // sum += n;
        // }
        // return sum;
    }

    // Napisz metode ktora za swoj parametr przyjmuje tablice intów, a nastepnie
    // zwraca tablice liczb liczb większych od 5
    public static int[] tableMethod3(int[] arr) {
        return Arrays.stream(arr).filter(n -> n > 5).toArray();
    }

    // Napisz metode ktora za swoj parametr przyjmuje tablice intow, a nastepnie
    // wypisuje wszystkie liczby podzielne przez 2 ktore sa wieksze niz 7
    public static void tableMethod4(int[] arr) {
        for (int n : arr) {
            if (n > 7 && n % 2 == 0) {
                System.out.println(n);
            }
        }
    }

    // Napisz metode ktora za swoj parametr przyjmuje tablice stringow, a nastepnie
    // wypisuje najdluzszy ze stringow
    public static void tableMethod5(String[] arr) {
        String longest = "";
        for (String s : arr) {
            if (s.length() > longest.length()) {
                longest = s;
            }
        }
        System.out.println(longest);
    }

    /*
     * Napisz metode ktora jako parametr przyjmuje tablice intow, a nastepnie zwraca
     * tablice intow ktora zawiera wartosci: dla liczb nieparzystych dodaje do nich
     * 3 dla liczb parzystych odejmuje od nich 1
     *
     * Przyklad: dla tablicy {2,3,4,5} nasza metoda powinna zwrocic tablice
     * {1,6,3,8}
     */
    public static int[] tableMethod6(int[] arr) {
        int[] result = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                result[i] = arr[i] - 1;
            } else {
                result[i] = arr[i] + 3;
            }
        }
        return result;
    }

    /*
     * Napisz metode, ktora jako parametr przyjmuje tablice intow i zwraca rowniez
     * tablice intow zmieniona w nastepujacy sposob: -liczby podzielne przez 3
     * zamienia na -1 -liczby niepodzielne przez 3 podnosi do kwadratu Dla tablicy =
     * {2,3,4,5,6} wynik to {4,-1,16,25,-1}
     */
    public static int[] tableMethod7(int[] arr) {
        int[] result = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 3 == 0) {
                result[i] = -1;
            } else {
                result[i] = arr[i] * arr[i];
            }
        }
        return result;
    }

    // napisz metode ktora przyjmuje jako parametr tablice Stringow oraz chara,
    // wypisuje te
    // slowa z tablicy ktore maja przynajmniej dwa podane chary
    // Ania Tomek Magda Krzys Ania i char a
    // output Ania Magda Ania
    public static void tableMethod8(String[] words, char ch) {
        for (String word : words) {
            long count = word.chars().filter(c -> c == ch).count();
            if (count >= 2) {
                System.out.println(word);
            }
        }
    }

    // dla podanej tablicy intów sprawdz czy liczba elementów ujemnych jest większa
    // od liczby elementow nieujemnych
    public static boolean tableMethod9(int[] arr) {
        int neg = 0;
        for (int n : arr) {
            if (n < 0)
                neg++;
        }
        return neg > arr.length - neg;
    }

    // Napisz metode ktora wypelnia tablice losowymi (ilosc elementow podana jako
    // parametr) wartosciami z przedzialu 1-9 i
    // zwraca tablice posortowana w kolejnosci rosnacej
    public static int[] tableMethod10(int size) {
        Random rand = new Random();
        int[] result = new int[size];
        for (int i = 0; i < size; i++) {
            result[i] = rand.nextInt(9) + 1; // 1 to 9
        }
        Arrays.sort(result);
        return result;
    }

    // napisz metode ktora obliczy ile jest elementow parzystych z tablicy
    public static int tableMethod11(int[] arr) {
        int count = 0;
        for (int n : arr) {
            if (n % 2 == 0)
                count++;
        }
        return count;
    }

    // napisz metode ktora zwraca true tylko wtedy gdy kazdy element z tablcy to 1
    // lub 4
    public static boolean tableMethod12(int[] arr) {
        for (int n : arr) {
            if (n != 1 && n != 4)
                return false;
        }
        return true;
    }

    // napisz metode ktora zwraca true jesli kazda liczba z tablicy podanej jako
    // parametr konczy sie ta sama cyfra
    // 117 7 786847 37
    public static boolean tableMethod13(int[] arr) {
        if (arr.length == 0)
            return true;
        int lastDigit = Math.abs(arr[0] % 10);
        for (int n : arr) {
            if (Math.abs(n % 10) != lastDigit)
                return false;
        }
        return true;
    }

    // napisz metode która sprawdza czy elementy po lewej od srodka tablicy sa rowne
    // elementom po prawej od srodka tablicy
    // np [1,2,3,4] - false
    // [4,5,6,9,0] - true
    // [8,2,6,10,3,3] - true
    public static boolean tableMethod14(int[] arr) {
        int len = arr.length;
        int mid = len / 2;

        for (int i = 0; i < mid; i++) {
            if (arr[i] != arr[len - 1 - i]) {
                return false;
            }
        }
        return true;
    }
}
