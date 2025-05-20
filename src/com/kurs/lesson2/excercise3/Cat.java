package src.com.kurs.lesson2.excercise3;

public class Cat extends Animal {

    private int annoyanceLevel;

    public Cat(String name, String species, int annoyanceLevel) {
        super(name, species);
        setAnnoyanceLevel(annoyanceLevel);
    }

    public int getAnnoyanceLevel() {
        return annoyanceLevel;
    }

    public void setAnnoyanceLevel(int annoyanceLevel) {
        if (annoyanceLevel < 1 || annoyanceLevel > 10) {
            throw new IllegalArgumentException("Annoyance level must be in 1-10 range");
        } else {

            this.annoyanceLevel = annoyanceLevel;
        }
    }

    @Override
    public String toString() {
        return "Cat [annoyanceLevel=" + annoyanceLevel + "]";
    }
}
