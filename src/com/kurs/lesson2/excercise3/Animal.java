package src.com.kurs.lesson2.excercise3;

public abstract class Animal {
    private String name;
    private String race;
    private Trainer trainer;

    public Animal(String name, String race) {
        this.name = name;
        this.race = race;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRace() {
        return race;
    }

    public void setRace(String race) {
        this.race = race;
    }

    public Trainer getTrainer() {
        return trainer;
    }

    public void setTrainer(Trainer trainer) {
        this.trainer = trainer;
    }

    @Override
    public String toString() {
        return "Animal [name=" + name + ", race=" + race + ", trainer=" + trainer + "]";
    }

}
