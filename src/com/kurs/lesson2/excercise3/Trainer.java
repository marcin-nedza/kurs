package src.com.kurs.lesson2.excercise3;

import java.util.ArrayList;
import java.util.List;

public class Trainer {
    private String name;
    private String lastName;
    private String adress;
    private List<Animal> animals=new ArrayList<>();

    public Trainer(String name, String lastName, String adress) {
        this.name = name;
        this.lastName = lastName;
        this.adress = adress;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public List<Animal> getAnimals() {
        return animals;
    }

    public void setAnimals(List<Animal> animals) {
        this.animals = animals;
    }

    @Override
    public String toString() {
        return "Trainer [name=" + name + ", lastName=" + lastName + ", adress=" + adress + ", animals=" + animals + "]";
    }

}
