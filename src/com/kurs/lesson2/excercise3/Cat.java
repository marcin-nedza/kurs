package src.com.kurs.lesson2.excercise3;

public class Cat extends Animal {


    private int annoyanceLevel;

    public Cat(String name, String species,Trainer trainer,int annoyanceLevel) {
        super(name, species,trainer);
        this.annoyanceLevel=annoyanceLevel;
    }

    public int getAnnoyanceLevel() {
        return annoyanceLevel;
    }

    public void setAnnoyanceLevel(int annoyanceLevel) {
        this.annoyanceLevel = annoyanceLevel;
    }
    @Override
    public String toString() {
        return "Cat [annoyanceLevel=" + annoyanceLevel + "]";
    }
}
