package src.com.kurs.lessons;

import java.util.Arrays;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class homework3 {
    public static void main(String[] args) {
        scanner();
        dialogPane();
    }

    public static void scanner() {

        try (Scanner sc = new Scanner(System.in);) {
            // Wczytaj skanerem 3 liczby typu int, wyswietl ich sume na konsoli
            System.out.println("Enter 3 integers:");
            int sum = 0;
            for (int i = 0; i < 3; i++) {
                System.out.print("Number " + (i + 1) + ": ");
                int number = sc.nextInt();
                sum += number;
            }
            System.out.println("Sum: " + sum);

            // Wczytaj skanerem 3 napisy, wyswietl ten ktory jest najdluzszy
            System.out.println("\nEnter 3 strings:");
            String longest = "";
            for (int i = 0; i < 3; i++) {
                System.out.print("String " + (i + 1) + ": ");
                String input = sc.nextLine();
                if (input.length() > longest.length()) {
                    longest = input;
                }
            }
            System.out.println("Longest string: " + longest);

            // Wczytaj skanerem 10 losowych liczb i umiesc je w tablicy
            System.out.println("\nEnter 10 integers:");
            int[] numbers = new int[10];
            for (int i = 0; i < numbers.length; i++) {
                System.out.print("Number " + (i + 1) + ": ");
                numbers[i] = sc.nextInt();
            }

            System.out.println("Numbers entered: ");
            System.out.println(Arrays.toString(numbers));
            // wczytaj skanerem od 3 do 7 stringow i policz sume ich dlugosci
            int count;
            int totLen = 0;
            System.out.println("Enter how many strings you want to enter (3-7)?: ");
            count = sc.nextInt();
            sc.nextLine();

            if (count >= 3 && count <= 7) {

                for (int i = 0; i < count; i++) {
                    System.out.printf("\nEnter %d string :", i + 1);
                    String str = sc.nextLine();
                    totLen += str.length();
                }
            }
            System.out.printf("\n Sum of lengths is: %d", totLen);
            // Stwórz kalkulator za pomocą skanera, uzytkownik wprowadza liczbe (double),
            // znak, druga liczbe
            // w zaleznosci od tego czy poda +,-,/,* to wykonujemy taka operacje matematycna
            double a, b;
            String operand;

            System.out.println("Enter num1: ");
            a = sc.nextDouble();
            sc.nextLine();

            System.out.println("Enter operand: ");
            operand = sc.nextLine().trim();

            System.out.println("Enter num2: ");
            b = sc.nextDouble();

            switch (operand) {
                case "+":
                    System.out.printf("\n%.2f %s %.2f = %.2f", a, operand, b, a + b);
                    break;
                case "-":
                    System.out.printf("\n%.2f %s %.2f = %.2f", a, operand, b, a - b);
                    break;
                case "/":
                    if (b == 0) {
                        System.out.println("Cannot divide by 0");
                        break;
                    } else {
                        System.out.printf("\n%.2f %s %.2f = %.2f", a, operand, b, a / b);
                        break;
                    }
                case "*":
                    System.out.printf("\n%.2f %s %.2f = %.2f", a, operand, b, a * b);
                    break;
                default:
                    System.out.println("Operand not recognized");
                    break;
            }
            // Uzytkownik wprowadza liczby. Na poczatku uzytkownik deklaruje ile liczb chce
            // wprowadzic. Nastepnie wprowadza
            // tyle liczb ile podał. Chcemy policzyc ich sume, element najmniejsz,
            // najwiekszy oraz srednia arytmetyczna.

            System.out.print("How many numbers do you want to enter? ");
            int count2 = sc.nextInt();

            if (count2 <= 0) {
                System.out.println("Number must be greater than 0.");
                return;
            }

            double sumCalc = 0;
            double min = Double.MAX_VALUE;
            double max = Double.MIN_VALUE;

            for (int i = 0; i < count2; i++) {
                System.out.printf("Enter number %d: ", i + 1);
                double num = sc.nextDouble();

                sumCalc += num;
                if (num < min)
                    min = num;
                if (num > max)
                    max = num;
            }
            double average = sumCalc / count2;

            System.out.println("Sum: " + sumCalc);
            System.out.println("Minimum: " + min);
            System.out.println("Maximum: " + max);
            System.out.printf("Average: %.2f\n", average);
            // Symulacja wprowadzania hasla przez uzytkownika. Uzytkownik wprowadza hasło,
            // tak dlugo az jest
            // niepoprawne, wyswietlamy napis ze haslo jst niepoparwne, wprowadz poprawne
            // hasło.
            // Jesli uzytkownik wprowadzi poprawne haslo to wyswietlamy komunikat ze haslo
            // jest poprawne.
            final String TEST_PASSWORD = "1234";
            System.out.println("Enter password: ");
            String pass = sc.nextLine();
            while (!pass.equals(TEST_PASSWORD)) {
                System.out.println("Password do not match. Try again");
                pass = sc.nextLine();
            }
            System.out.println("Password is correct");

        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
    }

    public static void dialogPane() {

        // Wprowadz za pomoca okienka dialogowego jakis napis. Jesli jego dlugosc jest
        // wieksza niz 15, wyswietl
        // za pomoca okienka napis ze jest za dlugi tekst, a jesli nie to wyswietl ze
        // jest ok.
        String txt = JOptionPane.showInputDialog("Enter your some text:");
        if (txt.length() > 15) {
            JOptionPane.showMessageDialog(null, "Input is to long.");
        } else {
            JOptionPane.showMessageDialog(null, "Ok");
        }

        // Za pomoca JOPtionPane wczytaj 3 liczby i wyswietl ta ktora jest najwieksza
        String input1 = JOptionPane.showInputDialog("Enter the first number:");
        String input2 = JOptionPane.showInputDialog("Enter the second number:");
        String input3 = JOptionPane.showInputDialog("Enter the third number:");

        int num1 = Integer.parseInt(input1);
        int num2 = Integer.parseInt(input2);
        int num3 = Integer.parseInt(input3);

        int largest = Math.max(num1, Math.max(num2, num3));

        JOptionPane.showMessageDialog(null, "The largest number is: " + largest);

        // Za pomoc JOptionpane (confrim dialog) zadaj pytanie uzytkownikowi o to czy
        // chce zlozyc zamowienie.
        // W zaleznosci od zaznaczonej odpowiedzi wyswietl odpowiedni napis
        int answ = JOptionPane.showConfirmDialog(null, "Do you want to place an order ?");
        System.out.println(answ);
        switch (answ) {
            case 0:
                JOptionPane.showMessageDialog(null, "You placed an order");
                break;
            case 1:
                JOptionPane.showMessageDialog(null, "You didn't place an order");
                break;
            case 2:
                JOptionPane.showMessageDialog(null, "You canceled");
                break;
            default:
                break;
        }

        // Za pomoca JOPtionpane uzytkwonik podaje imiona. Dopoki nie poda tomek to moze
        // je wprowadzac dalej i wypisujemy je na konsoli
        // Gdy wpisze Tomek przerywamy wprowadzanie i podajemy komunikat w okienku
        // dialogowym ze wpisano brzydkie imie.
        while (true) {
            String name = JOptionPane.showInputDialog(null, "Enter a name:");

            if (name != null && name.equalsIgnoreCase("Tomek")) {
                JOptionPane.showMessageDialog(null, "You entered a bad name (Tomek)!");
                break; // Exit the loop
            }

            if (name != null && !name.isEmpty()) {
                System.out.println("Entered name: " + name);
            }
        }

        // Wpisujemy imiona za pomoca JOPtionPane tak dlugo az uzytkownik nie
        // zrezygnuje. Przypisujemy te wartosci do wczesniej utworzonej
        // zmiennej typu String, wyswietlamy ja na koncu
        StringBuilder names = new StringBuilder();

        while (true) {
            String name = JOptionPane.showInputDialog(null, "Enter a name (Cancel to finish):");

            if (name == null || name.isEmpty()) {
                break;
            }

            if (names.length() > 0) {
                names.append(", ");
            }
            names.append(name);
        }

        JOptionPane.showMessageDialog(null, "Entered names: " + names.toString());

        // Uzytkownik wybiera dwie opcje, tak lub nie dopoki nie nacisnie cancel. Policz
        // czy uzytkownik wybral wiecej razy tak, nie czy bylo ich tyle samo.
        int y = 0;
        int n = 0;
        while (true) {
            int res = JOptionPane.showOptionDialog(null, "Do you want to continue?", "Choose y or n",
                    JOptionPane.YES_NO_CANCEL_OPTION,
                    JOptionPane.QUESTION_MESSAGE, null, null, null);

            if (res == JOptionPane.YES_OPTION) {
                y++;
            }
            if (res == JOptionPane.NO_OPTION) {
                n++;
            }
            if (res == JOptionPane.CANCEL_OPTION) {
                break;
            }
        }
        String result = (y > n) ? "More Yes" : (n > y) ? "More No" : "Equal Yes and No";
        JOptionPane.showMessageDialog(null, result);
    }
}
