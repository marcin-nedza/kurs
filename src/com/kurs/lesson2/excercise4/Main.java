package src.com.kurs.lesson2.excercise4;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Comparator;
import java.util.List;

public class Main {
    /*
     * Stwórz plik w formacie:
     * imie\tnazwisko\twiek\tmiasto
     *
     * Stworz klase Osoba na podstawie tego pliku, wczytaj wszystkie osoby z pliku
     * do listy i:
     *
     * - znajdz najstarsza osobe
     * - znajdz wszystkie osoby ktore maja na naziwsko kowalski
     * - znajdz wszystkie pelnoletnie osoby z warszawy
     */
    public static void main(String[] args) {
        initializePersons();
        getOldest();
        getByLastName("Kowalski");
    findByAgeTown(18, "Warszawa");
    }
    public static void initializePersons(){
        String path = "src/com/kurs/lesson2/excercise4/people.txt";
        try (BufferedReader reader = new BufferedReader(new FileReader(path))) {
            String line = reader.readLine();

            while (line != null) {
                String[] parts=line.split("\t");
                String name=parts[0];
                String lastName=parts[1];
                int age=Integer.parseInt(parts[2]);
                String town=parts[3];
                Person p = new Person(name, lastName, age, town);
                Person.addPerson(p);
                line = reader.readLine();
            }
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
        // System.out.println(Person.getPersons());

    }
    public static void getOldest(){
        List<Person> persons=Person.getPersons();
        if(persons.isEmpty()){
            System.out.println("No persons in the list, initialize list.");
            return;
        }
        Person oldest=persons.stream().max(Comparator.comparingInt(Person::getAge)).orElse(null);
        System.out.println("Oldest person is: "+oldest);
    }

    public static void getByLastName(String lname){
        List<Person> persons=Person.getPersons();
        System.out.println(persons.stream().filter(p->p.getLastName().equals(lname)).toList());
    }
    public static void findByAgeTown(int age,String town){
        List<Person> persons=Person.getPersons();
        System.out.println("List of adults : "+persons.stream().filter(p->p.getAge()>=age&& p.getTown().equals(town)).toList());
    }
}
