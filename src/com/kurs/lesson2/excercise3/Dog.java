package src.com.kurs.lesson2.excercise3;

import java.util.ArrayList;
import java.util.List;

public class Dog extends Animal {
    private int furlength;
    private List<String> favouriteToys = new ArrayList<>();

    public Dog(String name, String species,Trainer trainer, int furlength, List<String> favouriteToys) {
        super(name, species,trainer);
        this.furlength = furlength;
        this.favouriteToys = favouriteToys;
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

}
