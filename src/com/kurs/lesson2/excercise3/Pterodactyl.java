package src.com.kurs.lesson2.excercise3;

public class Pterodactyl extends Animal {
    private int wingSpan;

    public Pterodactyl(String name, String species, int wingSpan) {
        super(name, species);
        this.wingSpan = wingSpan;
    }

    public int getWingSpan() {
        return wingSpan;
    }

    public void setWingSpan(int wingSpan) {
        this.wingSpan = wingSpan;
    }

}
