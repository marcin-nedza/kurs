package src.com.kurs.lesson2.excercise3;

import java.util.ArrayList;
import java.util.List;

public class Dog extends Animal {
    private int furlength;
    private List<String> favouriteToys = new ArrayList<>();

    public Dog(String name, String species, int furlength) {
        super(name, species);
        this.furlength = furlength;
    }

    public int getFurlength() {
        return furlength;
    }

    public void setFurlength(int furlength) {
        this.furlength = furlength;
    }

    public List<String> getFavouriteToys() {
        return favouriteToys;
    }

    public void setFavouriteToys(List<String> favouriteToys) {
        this.favouriteToys = favouriteToys;
    }

    public void addToy(String toy) {
        this.favouriteToys.add(toy);
    }

}
