package src.com.kurs.lesson2.excercise2;

import java.util.Comparator;
import java.util.List;
import java.util.Map;

public class Main {
    /*
     * Stwórz klasę Pracownik (imie,nazwisko, adres, pensja i Klient (imie,nazwisko,
     * ulubiony produkt). Klient kupuje produkty (nazwa, cena).
     * Pracownik uzywa samochod (model, marka)
     * 
     * 1) Znajdz klienta który wydal najwiecej
     * 
     * 2) Wyswietl dla kazdego klienta jego ulubiony produkt (of cuz ulubiony
     * produkt to ma byc atrybut wyliczalny na podstawie zakupow)
     * 
     * 3) Wyswietl 3 top pracownikow z najwieksza pensja (compartor + sortowanie)
     * DODATKOWE
     * 
     * 4) Pracownicy auta moga uzywac wielkorotnie, chcemy przechowywac informacje
     * (i moc ja wyswietlic) ile jaki pracownik uzywal jakiego auta
     */
    public static void main(String[] args) {
        Client cl1 = new Client("Wojtek", "Hohola");
        Client cl2 = new Client("Gosia", "Blabla");
        List<Client> clientList = List.of(cl1, cl2);

        Employee em1 = new Employee("Arek", "Powiat", "Radom", 1200);
        Employee em2 = new Employee("Marek", "Swiniak", "Wawa", 2200);
        Employee em3 = new Employee("JArek", "JHDFdfs", "Wawa", 200);
        Employee em4 = new Employee("CZarek", "hhhhhh", "Wawa", 3200);
        List<Employee> employeList = List.of(em1,em2,em3,em4);

        Car car1 = new Car("Audi", "A8");
        Car car2 = new Car("Fiat", "Maluch");
        List<Car> carList=List.of(car1,car2);
        em1.rideCar(car1);
        em2.rideCar(car1);
        em1.rideCar(car2);
        Product pr1 = new Product("Jaja", 2.33);
        Product pr2 = new Product("Zelki", 3.99);
        Product pr3 = new Product("Chleb", 2);

        cl1.buy(pr1);
        cl1.buy(pr2);
        cl1.buy(pr2);
        cl2.buy(pr3);
        cl2.buy(pr3);
        cl2.buy(pr2);

        System.out.println(findClient(clientList));
        cl1.getProdList().entrySet().forEach(s->System.out.println(s));
        getFavourite(clientList);
        getHighestPaid(employeList);
        getCarUsage(carList);
    }

    public static Client findClient(List<Client> clients) {
        return clients.stream().filter(c -> c.getProdList() != null)
                .max(Comparator.comparingDouble(cl -> cl.getProdList().entrySet().stream()
                        .mapToDouble(entry -> entry.getKey().getPrice() * entry.getValue()).sum()))
                .orElse(null);
    }

    public static void getFavourite(List<Client> clients){
        System.out.println("--a-sda");
        for (Client client : clients) {
            Map.Entry<Product,Integer> favourite=client.getProdList().entrySet().stream().max(Map.Entry.comparingByValue()).orElse(null);
            System.out.println(favourite);
        }
    }

    // public static List<Employee> getHighestPaid(List<Employee> empl){
    public static void getHighestPaid(List<Employee> empl){
        List<Employee> list=empl.stream().sorted(Comparator.comparingInt(Employee::getSalary).reversed()).limit(3).toList();
        System.out.println(list);
    }

    public static void getCarUsage(List<Car> cars){
        cars.forEach(c->{
            System.out.println("----");
            System.out.println(c.getEmpList());
        });
    }
}
