package src.com.kurs.lesson2.excercise3;

import java.util.HashMap;
import java.util.Map;

public class Equipment {
    // * Trener uzywa Sprzetu (nazwa, stopien zuzycia(nowe, uzywane, tragiczne)),
    // * sprzet moze byc naprawiany.
    private String name;
    private Condition eqCondition;
    private Map<Trainer, Integer> usedByTrainer = new HashMap<>();

    public Equipment(String name, Condition eqCondition) {
        this.name = name;
        this.eqCondition = eqCondition;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Condition getEqCondition() {
        return eqCondition;
    }

    public void setEqCondition(Condition eqCondition) {
        this.eqCondition = eqCondition;
    }

    public Map<Trainer, Integer> getUsedByTrainer() {
        return usedByTrainer;
    }

    public void setUsedByTrainer(Map<Trainer, Integer> usedByTrainer) {
        this.usedByTrainer = usedByTrainer;
    }

    // public void use(Employee empl) {
    // if (empList.containsKey(empl)) {
    // int val = empList.get(empl);
    // empList.put(empl, val + 1);
    // } else {
    // empList.put(empl, 1);
    // }
    // }
    public void getUsed(Trainer trainer) {
        if (usedByTrainer.containsKey(trainer)) {
            int val = usedByTrainer.get(trainer);
            usedByTrainer.put(trainer, val + 1);
        } else {
            usedByTrainer.put(trainer, 1);
        }
    }

    public void repair() {
        setEqCondition(Condition.NEW);
    }

    @Override
    public String toString() {
        return "Equipment [name=" + name + ", eqCondition=" + eqCondition + "]";
    }
}