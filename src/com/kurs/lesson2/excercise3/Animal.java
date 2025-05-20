package src.com.kurs.lesson2.excercise3;

public abstract class Animal {
    private String name;
    private String species;
    private Trainer trainer;

    public Animal(String name, String species,Trainer trainer) {
        this.name = name;
        this.species = species;
        this.trainer=trainer;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    public Trainer getTrainer() {
        return trainer;
    }

    public void setTrainer(Trainer trainer) {
        this.trainer = trainer;
    }

    @Override
    public String toString() {
        return "Animal [name=" + name + ", species=" + species + ", trainer=" + trainer + "]";
    }

}
