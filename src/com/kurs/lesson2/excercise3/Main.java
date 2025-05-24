package src.com.kurs.lesson2.excercise3;

import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

public class Main {
    /*
     * W systemie przechowujemy informacje o zwierzetach (nazwa, gatunek). Dla psów
     * przechowujemy dodatkowe ich dlugosc siersci
     * oraz ulubione zabawki ,dla kotów stopien bycia wkurwiajacym futrzakiem (1-10)
     * oraz dla pterodaktylow rozpietosc skrzydel.
     * 
     * Trenerzy (imie, nazwisko, adres) trenuja zwierzeta. Kazdy trener trenuje
     * wiele zwierzat, ale zwierze jest pod okiem jednego trenera.
     * 
     * Trener uzywa Sprzetu (nazwa, stopien zuzycia(nowe, uzywane, tragiczne)),
     * sprzet moze byc naprawiany.
     * Chcemy przechowywac informacje o tym jaki trener uzywal kiedy
     * jkaiego sprzetu. Sprzet przez trenera moze byc uzywany wielokrotnie.
     * 
     * 
     * -znajdz trenera ktory trenował najwiecej zwierzat
     * -znajdz trenera ktory uzywał jakiegos sprzetu najwieksza liczbe razy
     * -znajdz trenerow ktorzy trenowali psy z gatunku spaniel
     * -znajdz wszystkie sprzety które byly naprawiane co najmniej 2 razy
     * -znajdz wszystkie pterodaktyle ktore nigdy nie mialy przypisanego trenera
     */
    public static void main(String[] args) {
        Trainer trainer1 = new Trainer("Jacek", "Dziadu", "wawa");
        Trainer trainer2 = new Trainer("Tomek", "Chujek", "Kielce");
        List<Trainer> trainList = List.of(trainer1, trainer2);

        Cat cat1 = new Cat("ASd", "Dachowiec", 2);
        Cat cat2 = new Cat("ASd2", "Dachowiec", 10);

        Dog dog1 = new Dog("Burek", "Husky", 20);
        Pterodactyl ptero = new Pterodactyl("Dino", "Chuj wie", 10);
        Pterodactyl ptero1 = new Pterodactyl("Dino2", "Chuj wie", 10);

        Equipment eq1 = new Equipment("Bicz", Condition.TRAGIC);
        Equipment eq2 = new Equipment("Pala", Condition.NEW);
        List<Equipment> eqList = List.of(eq1, eq2);
        List<Animal> animals = List.of(cat1, cat2, dog1, ptero,ptero1);

        trainer1.trainAnimal(cat1);
        trainer2.trainAnimal(ptero);
        trainer1.useEq(eq1);
        trainer1.useEq(eq2);
        trainer2.useEq(eq1);
        eq1.repair();
        getEqByRepairCount(eqList, 1);
        // getTrainerWithMaxCount(trainList);
        // getTrainerWithMaxEq(eqList);
        getTrainerByAnimal(trainList, "Chuj wie");
        getAnimalByTrainer(animals, Pterodactyl.class);
    }

    public static void getTrainerWithMaxCount(List<Trainer> trainers) {
        Optional<Trainer> tr = trainers.stream().max(Comparator.comparingInt(t -> t.getAnimals().size()));
        if (tr.isPresent()) {
            System.out.println("Trainer with most animals: " + tr.get());
        } else {
            System.out.println("No trainers found.");
        }
    }

    public static void getTrainerWithMaxEq(List<Equipment> eqs) {
        Map<Trainer, Integer> map = new HashMap<>();
        for (Equipment eq : eqs) {
            for (Map.Entry<Trainer, Integer> entry : eq.getUsedByTrainer().entrySet()) {
                Trainer trainer = entry.getKey();
                if (map.containsKey(trainer)) {
                    int val = entry.getValue();
                    map.put(trainer, val + 1);
                } else {
                    map.put(trainer, 1);
                }
            }
        }
        System.out.println(map);
    }

    public static void getTrainerByAnimal(List<Trainer> list, String targetRace) {
        list.stream()
                .filter(t -> t.getAnimals().stream()
                        .anyMatch(a -> targetRace.equals(a.getRace())))
                .forEach(System.out::println);
    }

    public static void getEqByRepairCount(List<Equipment> eqs, int count) {
        List<Equipment> res = eqs.stream().filter(e -> e.getRepairCount() == count).toList();
        System.out.println(res);
    }

    public static <T extends Animal> void getAnimalByTrainer(List<Animal> animals, Class<T> type) {
        System.out.println("-----");
        System.out.println(animals.stream().filter(type::isInstance).filter(a -> a.getTrainer() == null).toList());
    }
}
